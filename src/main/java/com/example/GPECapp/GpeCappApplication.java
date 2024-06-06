package com.example.GPECapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
public class GpeCappApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpeCappApplication.class, args);
	}

}
