/* Copyright (C)  Dqlick ™ - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package com.example.gestionreclamation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.jetbrains.annotations.NotNull;


@Entity
public class Reclamation {
@Id
@GeneratedValue
private long id; 
private String titre;
private String description;	
private String etat ="en attente";	
private Gravite gravite ;


public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Gravite getGravite() {
		return gravite;
	}


	public void setGravite(Gravite gravite) {
		this.gravite = gravite;
	}
	

	public Reclamation() {
		// corps du constructeur
	}


	public Reclamation(@NotNull Long id, String titre, String description, String etat, Gravite gravite) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.etat = etat;
		this.gravite=gravite;
	}

	

	@Override
	public String toString() {
		return "Reclamation [id=" + id + ", titre=" + titre + ", description=" + description + ", etat=" + etat
				 +"gravite=" + gravite
				 +"]";
	}
	

}
