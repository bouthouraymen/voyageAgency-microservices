package com.example.gestionreclamation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestionreclamation.entity.Reclamation;
import com.example.gestionreclamation.repositories.ReclamationRepository;



@Service
public class ReclamationMetierImpl implements ReclamationMetier {
	
	

	
	/*@Autowired 
	UserRepository userRep;*/
	/*@Override
	public void saveReclamation(Reclamation reclamation, String user) {
		// TODO Auto-generated method stub
		
		reclamation.setUser(userRep.getById(user));
		recRep.save(reclamation);
	}*/
	@Autowired
	ReclamationRepository recRep;
	@Override
	public void saveReclamation(Reclamation reclamation, String user) {
		// TODO Auto-generated method stub
		//reclamation.setUser(userRep.getById(user));
		recRep.save(reclamation);
	}

	@Override
	public List<Reclamation> listReclamations() {
		// TODO Auto-generated method stub
		return recRep.findAll();
	}

	@Override
	public Reclamation getReclamationById(Long id) {
		// TODO Auto-generated method stub
		return recRep.findByIdRec(id);

	}

	@Override
	public void updateReclamation(Reclamation reclamation) {
		// TODO Auto-generated method stub
		recRep.save(reclamation);

	}

	@Override
	public void deleteReclamation(Long id) {
		// TODO Auto-generated method stub
		recRep.delete(recRep.findByIdRec(id));

	}

	@Override
	public List<Reclamation> getrecsattente() {
		// TODO Auto-generated method stub
		return recRep.getrecsattente();

	}

	@Override
	public void modifieretat(Reclamation reclamation) {
		// TODO Auto-generated method stub
		Reclamation r = recRep.save(reclamation);
		if(r.getEtat()=="en attente") {
		r.setEtat("en cours");}
		else r.setEtat("en attente");

	}

	@Override
	public int getcountrecs(String etat) {
		// TODO Auto-generated method stub
		return recRep.getcountrecs(etat);

	}

	

	
	}

	



	

