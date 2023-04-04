package com.mikh.diap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAsync
@SpringBootApplication
public class DiapApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiapApplication.class, args);
	}

}
