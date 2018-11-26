package com.hyl.learner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.hyl.learner")
public class LearnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnerApplication.class, args);
	}
}
