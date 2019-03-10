package com.contactbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ContactBookNewApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ContactBookNewApplication.class, args);
	}

}
