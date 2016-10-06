package com.aviation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;



@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class AviationMAinClass {
	
	public static void main(String[] args) {
		SpringApplication.run(AviationMAinClass.class, args);
	}

}
