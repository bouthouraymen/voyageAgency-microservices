package com.esprit.microservice.Volservice;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VolRepository extends JpaRepository<Vol, Integer> {
	@Query("select c from Vol c where c.name like :name")
	public Page<Vol> volByName(@Param("name") String n, Pageable pageable);
	   
}
