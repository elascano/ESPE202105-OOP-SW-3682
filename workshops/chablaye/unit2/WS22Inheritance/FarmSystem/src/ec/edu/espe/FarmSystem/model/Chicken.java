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
public class Chicken extends FarmAnimal{
    private boolean isMolting;

    public Chicken(int id, String breed, Date bonrOn, boolean isMolting) {
        super(id, breed, bonrOn);
        this.isMolting = isMolting;
    }

    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    @Override
    public String toString() {
        return "Chicken{" +super.toString()+ "isMolting=" + isMolting + '}';
    }

    @Override
    public void feed(int amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
