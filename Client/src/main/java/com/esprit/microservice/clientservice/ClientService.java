package com.esprit.microservice.clientservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public Client addClient(Client client) {
		return clientRepository.save(client);
	}
	public Client updateClient(int cin, Client newClient) {
		if (clientRepository.findById(cin).isPresent()) {
			Client existingClient = clientRepository.findById(cin).get();
			existingClient.setFirstName(newClient.getFirstName());
			existingClient.setSecondName(newClient.getSecondName());
			existingClient.setEmail(newClient.getEmail());
			existingClient.setPhoneNumber(newClient.getPhoneNumber());


			return clientRepository.save(existingClient);
		} else
			return null;
	}
	public String deleteClient(int cin) {
		if (clientRepository.findById(cin).isPresent()) {
			clientRepository.deleteById(cin);
			return "client deleted";
		} else
			return "client cannot be deleted";
	}
	
	public List<Client> getClients(){
		return clientRepository.findAll();
	}
}
