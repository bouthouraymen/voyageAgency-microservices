package com.esprit.microservice.clientservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
	
	 @Bean
	    ApplicationRunner init(ClientRepository repository) {
	        return args -> {
	            Stream.of("Sandra", "Aymen", "Selima","Souhail").forEach(firstName -> {
	                repository.save(new Client(firstName));
	            });
	            repository.findAll().forEach(System.out::println);
	        };
	    }

}
