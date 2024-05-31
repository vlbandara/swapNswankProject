package com.aggrandizer.swapNswank.profileservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import javax.persistence.Entity;

@SpringBootApplication
@EnableConfigServer
@ComponentScan(basePackages = "com.aggrandizer.swapNswank")
@EntityScan(basePackages = "com.aggrandizer.swapNswank.commons.model")
@EnableJpaRepositories(basePackages = "com.aggrandizer.swapNswank.profileservice.repository")

public class ProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileServiceApplication.class, args);
	}

}
