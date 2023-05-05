package com.esprit.microservice.clientservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/clients")
public class ClientRestAPI {
	private String title = "Hello, I'm the client Microservice";
	
	@Autowired
	private ClientService clientService;
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Client> createClient(@RequestBody Client client) {
		return new ResponseEntity<>(clientService.addClient(client), HttpStatus.OK);
	}
	@PutMapping(value = "/{cin}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Client> updateClient(@PathVariable(value = "cin") int cin,
    										@RequestBody Client client){
		return new ResponseEntity<>(clientService.updateClient(cin, client), HttpStatus.OK);
	}
	@DeleteMapping(value = "/{cin}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteClient(@PathVariable(value = "cin") int cin){
		return new ResponseEntity<>(clientService.deleteClient(cin), HttpStatus.OK);
	}
	
	@GetMapping(value="/getAllClient")
	public List<Client> getAllClient(){
		return clientService.getClients();
	}
	
}
