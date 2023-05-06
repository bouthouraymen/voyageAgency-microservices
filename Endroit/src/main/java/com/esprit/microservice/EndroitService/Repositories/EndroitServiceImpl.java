package com.esprit.microservice.EndroitService.Repositories;

import com.esprit.microservice.EndroitService.Repositories.*;
import com.esprit.microservice.EndroitService.dao.EndroitRepository;
import com.esprit.microservice.EndroitService.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ahelioui on 7/15/2022.
 */

@Service
public class EndroitServiceImpl implements IEndroitService{


    @Autowired
    EndroitRepository endroitRepository;



    @Override
    public void ajouterEndroit(Endroit endroit){
       // return endroitRepository.save(endroit).getId();
        endroitRepository.save(endroit);
    }

    @Override
    public Endroit getEndroitById(long EndroitId) {
      //  return endroitRepository.findById((long) endroitId).get();
        return endroitRepository.findById(EndroitId).get(); }

    @Override
    public void deleteEndroitByID(long endroitId){
        endroitRepository.delete(endroitRepository.findById(endroitId).get());
    }

    @Override
    public void updateEndroit(Endroit endroit) {
        endroitRepository.save(endroit);
    }
    @Override
    public List<Endroit> retrieveAllEndroits() {
        return (List<Endroit>) endroitRepository.findAll();
    }

    @Override
    public List<Endroit> EndroitByCountry(String country) {
        return endroitRepository.findByCountry(country);
    }

	@Override
	public List<Endroit> getEndroitsToVisit(String idUser) {
		// TODO Auto-generated method stub
		return null;
	}

   



}