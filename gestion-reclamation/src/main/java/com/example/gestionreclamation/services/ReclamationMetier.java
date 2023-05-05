package com.example.gestionreclamation.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.gestionreclamation.entity.Reclamation;


@Component
public interface ReclamationMetier  {
	
	
		//public void saveReclamation(Reclamation reclamation, String user);
		public List<Reclamation> listReclamations();
		//public User getReclamationByUser(String username);
		public Reclamation getReclamationById(Long id);
		public void updateReclamation(Reclamation reclamation);
		public void deleteReclamation(Long id);		
		public List<Reclamation>  getrecsattente();
		public void modifieretat(Reclamation reclamation);
		public int getcountrecs(String etat);
		

		
}
