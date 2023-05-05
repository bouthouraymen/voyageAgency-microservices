/* Copyright (C)  Dqlick ™ - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package com.example.gestionreclamation.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.gestionreclamation.entity.Reclamation;


/**
 * {@link } class.
 *
 * @author ajlani
 * @since 0.1.0
 *
 */

@Repository
public interface ReclamationRepository extends JpaRepository<Reclamation, Long>  {
	@Query("select u from Reclamation u where u.id = :x")
	public Reclamation findByIdRec( @Param("x")Long id );  
	

	@Query(value="SELECT * FROM Reclamation WHERE reclamation.etat='en attente'" , nativeQuery=true)
    List<Reclamation> getrecsattente()  ;

	
	@Query(value="SELECT count(*) FROM Reclamation WHERE reclamation.etat='en attente'or reclamation.etat='Resolved' or reclamation.etat='NotYetResolved'" , nativeQuery=true)
    int getcountrecs(String etat);
}
