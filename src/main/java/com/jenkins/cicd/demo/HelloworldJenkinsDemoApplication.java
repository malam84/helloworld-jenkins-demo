package com.jenkins.cicd.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloworldJenkinsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldJenkinsDemoApplication.class, args);
	}
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String getHello() {
		return "Hello World";
	}

}
