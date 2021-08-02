/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmSystem.model;

import java.util.Date;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class Cow extends FarmAnimal {

    private boolean isProducingMilk;

    public Cow(int id, String breed, Date bornOn, boolean isProducingMilk) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public String toString() {
        return "Cow{" + super.toString() + "isProducingMilk=" + isProducingMilk + '}';
    }

    /**
     * @return the isProducingMilk
     */
    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public void feed(int amount) {
        System.out.println("feeding a cow with sugarcane");
    }

    public void feed(int amount, String foodType) {
        System.out.println("feeding a cow with " + foodType);
    }

    public void feed(int amount, int foodType) {
        System.out.println("feeding a cow with " + foodType);
    }
}
