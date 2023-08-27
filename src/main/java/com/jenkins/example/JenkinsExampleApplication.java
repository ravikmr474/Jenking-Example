package com.jenkins.example;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsExampleApplication {

	private static Logger logger = LoggerFactory.getLogger(JenkinsExampleApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application Started...");
	}

	public static void main(String[] args) {
		logger.info("Application Executed...");
		SpringApplication.run(JenkinsExampleApplication.class, args);
	}

}
