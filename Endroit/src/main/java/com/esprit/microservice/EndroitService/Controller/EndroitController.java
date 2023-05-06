package com.esprit.microservice.EndroitService.Controller;

import com.esprit.microservice.EndroitService.Entity.*;
import com.esprit.microservice.EndroitService.Repositories.IEndroitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.esprit.microservice.EndroitService.Repositories.*;
import com.esprit.microservice.EndroitService.dao.EndroitRepository;
import com.esprit.microservice.EndroitService.Entity.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by ahelioui on 7/14/2022.
 */

@RestController
public class EndroitController  {
    @Autowired
    IEndroitService endroitService;

  /*  // http://localhost:8082/pidev/ajouterEndroit
    @PostMapping("/ajouterEndroit")
    @ResponseBody
    public long ajouterEndroit(@RequestBody Endroit Endroit)
    {
        endroitService.ajouterEndroit(Endroit);
        return Endroit.getId();

    }
*/


    @RequestMapping(value = { "/ajouterEndroit" }, method = RequestMethod.POST)
    public String ajouterEndroit(@Valid @RequestBody Endroit endroit) {
        endroitService.ajouterEndroit(endroit);
        return "endroit ajouté avec succes" ;
    }


    // http://localhost:8082/pidev/deleteEndroitByID/1
    @DeleteMapping("/deleteEndroitByID/{idendroit}")
    @ResponseBody
    public String deleteEndroitByID(@PathVariable("idendroit")long endroitId)
    {
        endroitService.deleteEndroitByID(endroitId);
        return "id " + endroitId+ " est supprimé";
    }

    //http://localhost:8082/pidev/deleteEndroitByID/1
    @RequestMapping(value = { "/endroit/update" }, method = RequestMethod.PUT)
    public String updateEndroit(@Valid @RequestBody Endroit endroit) {
        endroitService.updateEndroit(endroit);
        return "endroit modifié avec succes" ;
    }

    //http://localhost:8082/pidev/getEndroitById/1
    @GetMapping(value = "getEndroitById/{idendroit}")
    @ResponseBody
    public Endroit getEndroitById(@PathVariable("idendroit") long endroitId)
    {
        System.out.println(endroitService.getEndroitById(endroitId).getVille());
        return endroitService.getEndroitById(endroitId);
    }

    //http://localhost:8082/pidev/findAllEndroits
    @RequestMapping("/findAllEndroits")
    public List<Endroit> getendroits() {
        List<Endroit> endroits = endroitService.retrieveAllEndroits();
        return endroits;
    }

    //http://localhost:8082/pidev/getEndroitByCountry/test
    @GetMapping(value = "getEndroitByCountry/{country}")
    @ResponseBody
    public List<Endroit> getEndroitByCountry(@PathVariable("country") String country)
    {
        return endroitService.EndroitByCountry(country);
    }


    //http://localhost:8082/pidev/getEndroitByEndroit/xx
    @GetMapping(value = "getListEndroit/{idUser}")
    @ResponseBody
    public List<Endroit> getEndroitsToVisit(@PathVariable("idUser") String idUser)
    {
        return endroitService.getEndroitsToVisit(idUser);
    }

}
