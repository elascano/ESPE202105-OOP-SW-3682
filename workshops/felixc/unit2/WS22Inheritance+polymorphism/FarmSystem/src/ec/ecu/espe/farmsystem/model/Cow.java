/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ecu.espe.farmsystem.model;

import java.util.Date;

/**
 *
 * @author 59399
 */
public class Cow extends FarmAnimal{
    
    private boolean isProducingMilk;


    public Cow(boolean isProducingMilk, int id, String breed, Date bornOn) {
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
        System.out.println("feeding a caw with sugarcane");
    }
    
    public void feed(int amount, String foodType) {
        System.out.println("feeding a caw with" + foodType);
    }
    public void feed(int amount, int foodType) {
        System.out.println("feeding a caw with" + foodType );
    }
    
}
