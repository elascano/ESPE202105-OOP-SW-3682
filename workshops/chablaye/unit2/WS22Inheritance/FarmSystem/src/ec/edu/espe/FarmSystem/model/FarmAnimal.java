/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FarmSystem.model;

import java.util.Date;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public abstract class FarmAnimal {
    private int id;
    private String breed;
    private Date bonrOn;

    public FarmAnimal(int id, String breed, Date bonrOn) {
        this.id = id;
        this.breed = breed;
        this.bonrOn = bonrOn;
    }
    
    public int getAgeInMonths(){
        
        return bonrOn.getDate();
    }
    
    public abstract void feed(int amount);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Date getBonrOn() {
        return bonrOn;
    }

    public void setBonrOn(Date bonrOn) {
        this.bonrOn = bonrOn;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", bonrOn=" + bonrOn + '}';
    }
 
    
}
