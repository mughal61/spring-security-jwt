package com.asimtechs.springsecurityjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityJwtApplication {

	/*
	* Objectives
	* Create a new Authentication API endpoint that returns a Jwt token - a Jwtutil class that deals with Jwt
	* And then we use Jwt token for subsequent request for authentication as we pass along Jwt in the header section of an Api call
	* Added a filter JwtRequestFilter that does checks Jwt for each of the request andf validates it and stores userdetails in the security context
	* 	and applied this filter in the configure override method of SecurityConfigurer class
	* */

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

}
