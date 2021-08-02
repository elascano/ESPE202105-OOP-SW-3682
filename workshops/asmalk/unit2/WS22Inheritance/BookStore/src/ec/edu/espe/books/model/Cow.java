/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Asmal Kevin
 */
public class Cow extends FarmAnimal {
    private boolean isProducingMilk; 

    public Cow(int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }
   

    /**
     * @return the isProducingMilk
     */
    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    @Override
    public String toString() {
        return "Cow{" + "isProducingMilk=" + isProducingMilk + '}';
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public void feed(int amount) {
        System.out.println("Feeding a cow with sugarcane");
    }
    public void feed(int amount,String foodType) {
        System.out.println("Feeding a cow with"+ foodType);
    }
    
    public void feed(int amount,int foodType) {
        System.out.println("Feeding a cow with"+ foodType);
    }
}
