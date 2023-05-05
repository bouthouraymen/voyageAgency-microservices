package com.esprit.microservice.Volservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class VolApplication {

	public static void main(String[] args) {
		SpringApplication.run(VolApplication.class, args);
	}
	
	 @Bean
	    ApplicationRunner init(VolRepository repository) {
	        return args -> {
	            Stream.of("pc", "tel", "ipad").forEach(name -> {
	                repository.save(new Vol(name));
	            });
	            repository.findAll().forEach(System.out::println);
	        };
	    }

}
