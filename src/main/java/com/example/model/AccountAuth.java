package com.example.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class AccountAuth  extends User implements UserDetails{

	public AccountAuth(User user) {
		super(user);
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		List<GrantedAuthority> autherity=new ArrayList<>();
		
		getRoles().forEach(role ->{
			autherity.add(new SimpleGrantedAuthority(role.getName()));
			role.getPermissions().forEach(permission->{
				autherity.add(new SimpleGrantedAuthority(permission.getName()));
			});
		});
		return null;
	}

	@Override
	public String getPassword() {
		return super.getPassword();
	}
	
	public String getUsername() {
		return super.getUsername();
	}
	 @Override
	    public boolean isAccountNonExpired() {
	        return super.isAccountNonExpired();
	    }

	    @Override
	    public boolean isAccountNonLocked() {
	        return super.isAccountNonLocked();
	    }

	    @Override
	    public boolean isCredentialsNonExpired() {
	        return super.isCredentialsNonExpired();
	    }

	    @Override
	    public boolean isEnabled() {
	        return super.isEnabled();
	    }
}
