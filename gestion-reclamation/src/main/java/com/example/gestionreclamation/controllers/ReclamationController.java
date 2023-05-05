package com.example.gestionreclamation.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestionreclamation.entity.Reclamation;
import com.example.gestionreclamation.services.ReclamationMetierImpl;




@RestController
@RequestMapping("/Reclamation")
public class ReclamationController {

	
	
	@Autowired
	private ReclamationMetierImpl reclamationMetierImpl;
	
	
	@RequestMapping("/reclamations")
	public List<Reclamation> getReclamation() {
		List<Reclamation> reclamations = reclamationMetierImpl.listReclamations();
		return reclamations;
	}
	
	@RequestMapping(value = "/reclamation/delete")
	public String deleteReclamation(@RequestParam(name = "id") Long id) {
		reclamationMetierImpl.deleteReclamation(id);
		return "id " + id+ " est supprimé";
	}
	@RequestMapping(value = { "/reclamation/add/{user}" }, method = RequestMethod.POST)
	public String addReclamation(@RequestBody Reclamation reclamation , @PathVariable String user) {
		reclamationMetierImpl.saveReclamation(reclamation,user);
		
		return "reclamation a été ajouté avec succes" ;
	}
	@RequestMapping(value = { "/reclamation/update" }, method = RequestMethod.PUT)
	public String updateReclamation(@RequestBody Reclamation reclamation) {
		reclamationMetierImpl.updateReclamation(reclamation);
		return "reclamation a été modifié avec succes" ;
	}
	@RequestMapping(value = "/reclamation/findById")
	public Reclamation getReclamationById(@RequestParam(name = "id") Long id) {
		return reclamationMetierImpl.getReclamationById(id);
		
	}
	/*@RequestMapping("/reclamationsByUser/findByUser")
	@GetMapping
	public User getReclamationByUser(@RequestParam(name = "username") String username){
		return reclamationMetierImpl.getReclamationByUser(username);
	}
	*/
	
	@RequestMapping("/reclamationsEnAttente")
	public List<Reclamation> getrecsattente() {
		List<Reclamation> reclamationsAttente = reclamationMetierImpl.getrecsattente();
		return reclamationsAttente;
	}
	
	@RequestMapping(value = { "/reclamation/updateEtat" }, method = RequestMethod.PUT)
	public String modifieretat(@RequestBody Reclamation reclamation) {
		reclamationMetierImpl.modifieretat(reclamation);
		return "Etat reclamation a été modifié avec succes" ;
	}
	
	@RequestMapping(value = "/reclamation/getCountReclamations")
	public int getcountrecs(@RequestBody String etat) {
		return reclamationMetierImpl.getcountrecs(etat);
		


	}
	}
