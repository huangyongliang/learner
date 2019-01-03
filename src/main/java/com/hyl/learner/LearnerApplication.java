package com.hyl.learner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 *   @author: jack
 *  @date: 2018/11/8 00:49
 */
@SpringBootApplication(scanBasePackages = "com.hyl.learner")
@EnableAsync
public class LearnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnerApplication.class, args);
	}
}
