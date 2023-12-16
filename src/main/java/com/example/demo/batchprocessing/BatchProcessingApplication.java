package com.example.demo.batchprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication

public class BatchProcessingApplication {
	public static void main(String[] args) throws Exception {
		System.exit(SpringApplication.exit(SpringApplication.run(BatchProcessingApplication.class, args)));
	}
}
