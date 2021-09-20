/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author jejoc
 */
public class Chicken extends FarmAnimal {
    private boolean isMolting;

    @Override
    public String toString() {
        return "Chicken{" + super.toString() + "isMolting=" + isMolting + '}';
    }

    public Chicken(boolean isMolting, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    @Override
    public void feed(int amount) {
        System.out.println("feeding a Chicken whith balanced ");
    }

   
}