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
public class Cow extends FarmAnimal {
    private boolean isProducingMilk;

    public Cow(boolean isProducingMilk, int id, String breed, Date bonrOn) {
        super(id, breed, bonrOn);
        this.isProducingMilk = isProducingMilk;
    }

    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public String toString() {
        return "Cow{" +super.toString()+ "isProducingMilk=" + isProducingMilk + '}';
    }

    @Override
    public void feed(int amount) {
        System.out.println("Feeding a couw");
    }
    public void feed(int amount, String type){
        System.out.println("Feeding a cow with: " +type);
    }
    
    
    
}
