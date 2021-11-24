package com.sankhya.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SankhyaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SankhyaConfigServerApplication.class, args);
	}

}
