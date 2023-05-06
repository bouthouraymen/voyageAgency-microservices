package com.esprit.microservice.EndroitService.Entity;

import com.esprit.microservice.EndroitService.Entity.*;
import com.esprit.microservice.EndroitService.Repositories.*;
import com.esprit.microservice.EndroitService.dao.EndroitRepository;
import com.esprit.microservice.EndroitService.Entity.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by ahelioui on 7/13/2022.
 */

/*
enum Country {
    FRANCE("France"),
    ITALY("Italy"),
    TUNISIA("Tunisia");

    private String country;

    Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }

    public static Country fromString(String country){
        for (Country c : Country.values()) {
         if (c.country.equalsIgnoreCase(country)){
             return c;
         }
        }
        return null;
    }

    public String getUrl() {
        return country;
    }
}
*/

@Entity
public class Endroit  implements Serializable {
    @Id
    @NotNull
    @GeneratedValue

    long id;
    private int codePostal;
    private String ville;
    private String rue;
    private String country;
    private Date startDate;
    private Date endDate;


    public Endroit(Long id, int codePostal, String ville, String rue , String country,
                   Date startDate, Date endDate) {

        this.id = id;
        this.codePostal = codePostal;
        this.ville = ville;
        this.rue = rue;
        this.country = country;
        this.startDate = startDate;
        this.endDate = endDate;

    }

   /* @JsonIgnore
    @JoinColumn(name="id_user")

    @OneToMany(mappedBy="country",
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch=FetchType.EAGER)

    List<UserEndroits> userEndroits;
*/
    public Endroit() {
    }
/*
    public List<UserEndroits> getUserEndroits() {
        return userEndroits;
    }

    public void setUserEndroits(List<UserEndroits> userEndroits) {
        this.userEndroits = userEndroits;
    }
*/

    public int getCodePostal() {
        return codePostal;
    }
    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getRue() {
        return rue;
    }
    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public Date getStartDate() {return startDate;}
    public void setStartDate(Date startDate) {this.startDate = startDate;}

    public Date getEndDate() {return endDate;}
    public void setEndDate(Date endDate) {this.endDate = endDate;}

    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.setId(id);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endroit)) return false;

        Endroit endroit = (Endroit) o;

        if (getId() != endroit.getId()) return false;
        if (getCodePostal() != endroit.getCodePostal()) return false;
        if (getVille() != null ? !getVille().equals(endroit.getVille()) : endroit.getVille() != null) return false;
        if (getRue() != null ? !getRue().equals(endroit.getRue()) : endroit.getRue() != null) return false;
        if (getCountry() != null ? !getCountry().equals(endroit.getCountry()) : endroit.getCountry() != null)
            return false;
        if (getStartDate() != null ? !getStartDate().equals(endroit.getStartDate()) : endroit.getStartDate() != null)
            return false;
        return getEndDate() != null ? getEndDate().equals(endroit.getEndDate()) : endroit.getEndDate() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getCodePostal();
        result = 31 * result + (getVille() != null ? getVille().hashCode() : 0);
        result = 31 * result + (getRue() != null ? getRue().hashCode() : 0);
        result = 31 * result + (getCountry() != null ? getCountry().hashCode() : 0);
        result = 31 * result + (getStartDate() != null ? getStartDate().hashCode() : 0);
        result = 31 * result + (getEndDate() != null ? getEndDate().hashCode() : 0);
        return result;
    }
}

