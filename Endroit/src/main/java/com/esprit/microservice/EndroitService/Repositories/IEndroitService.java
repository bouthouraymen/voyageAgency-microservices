package com.esprit.microservice.EndroitService.Repositories;


import com.esprit.microservice.EndroitService.Entity.*;

import java.util.List;

/**
 * Created by ahelioui on 7/13/2022.
 */

public interface IEndroitService{


    void deleteEndroitByID(long endroitId);
    void ajouterEndroit(Endroit endroit);
    Endroit getEndroitById(long endroitId);
    void updateEndroit(Endroit endroit);
    List<Endroit> retrieveAllEndroits();
    List<Endroit> EndroitByCountry(String country);
    List<Endroit> getEndroitsToVisit(String idUser);




}
