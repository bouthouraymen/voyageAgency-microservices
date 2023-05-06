package com.esprit.microservice.EndroitService.dao;

import com.esprit.microservice.EndroitService.Entity.*;
import com.esprit.microservice.EndroitService.Repositories.*;
import com.esprit.microservice.EndroitService.dao.EndroitRepository;
import com.esprit.microservice.EndroitService.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by ahelioui on 7/15/2022.
 */

@Repository
public interface EndroitRepository extends JpaRepository<Endroit,Long> {

List<Endroit> findByCountry(String country);
}

