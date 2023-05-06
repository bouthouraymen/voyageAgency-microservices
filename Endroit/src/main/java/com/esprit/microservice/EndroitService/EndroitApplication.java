package com.esprit.microservice.EndroitService;

import com.esprit.microservice.EndroitService.Repositories.*;
import com.esprit.microservice.EndroitService.dao.EndroitRepository;
import com.esprit.microservice.EndroitService.Entity.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EndroitApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndroitApplication.class, args);
	}

}
