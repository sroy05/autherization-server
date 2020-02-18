package com.example.autherizationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication(scanBasePackageClasses= {com.example.service.UserDetailsServiceImpl.class,com.example.configuration.AuthServerSecurityConfigure.class})
@EnableJpaRepositories(basePackages= {"com.example.model","com.example.repository"})
@EntityScan("com.example.model")
@EnableAuthorizationServer
public class AutherizationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutherizationServerApplication.class, args);
	}

}
