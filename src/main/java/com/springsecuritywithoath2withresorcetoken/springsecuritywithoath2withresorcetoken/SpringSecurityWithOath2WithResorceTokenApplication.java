package com.springsecuritywithoath2withresorcetoken.springsecuritywithoath2withresorcetoken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class SpringSecurityWithOath2WithResorceTokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityWithOath2WithResorceTokenApplication.class, args);
	}

}
