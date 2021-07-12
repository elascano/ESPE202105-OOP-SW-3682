/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public abstract class FarmAnimal {
    private int id;
    private String bred;
    private Date bornOn;

    public FarmAnimal(int id, String bred, Date bornOn) {
        this.id = id;
        this.bred = bred;
        this.bornOn = bornOn;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", bred=" + bred + ", bornOn=" + bornOn + '}';
    }
    
       
    public int getAgeInInMonths(){
        
        return bornOn.getDate();
    }
    public abstract void feed(int amount);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

     /**
     * @return the bred
     */
    public String getBred() {
        return bred;
    }

    /**
     * @param bred the bred to set
     */
    public void setBred(String bred) {
        this.bred = bred;
    }

    /**
     * @return the bornOn
     */
    public Date getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }
}
