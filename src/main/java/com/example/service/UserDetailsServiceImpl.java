package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.model.AccountAuth;
import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
   UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> optionaluser=userRepo.findByUsername(username);
		optionaluser.orElseThrow(() -> new UsernameNotFoundException("user data is not found"));
		
		UserDetails userDetails=new AccountAuth(optionaluser.get());
		return userDetails;
	}
	

}
