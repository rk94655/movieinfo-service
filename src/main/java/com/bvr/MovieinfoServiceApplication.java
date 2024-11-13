package com.bvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.bvr.resource.Mapper;

@SpringBootApplication
public class MovieinfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieinfoServiceApplication.class, args);
	}

	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public Mapper getMapper() {
		return new Mapper();
	}
}
