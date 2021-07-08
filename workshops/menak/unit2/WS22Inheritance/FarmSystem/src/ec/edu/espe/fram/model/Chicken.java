/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fram.model;

import java.util.Date;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class Chicken extends FarmAnimal {
    
    private boolean isMolting;

    @Override
    public String toString() {
        return "Chicken{" + super.toString() + "isMolting=" + isMolting + '}';
    }

        
    
    public Chicken(int id, String breed, Date borOn, boolean isMolting) {
        super(id, breed, borOn);
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
        System.out.println("feeding a chicken with balanceado");
    }
    
    
}
