/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FarmSystem.model;

import java.util.Date;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class Cow extends FarmAnimal{
    private boolean isProducingMilk;

    @Override
    public String toString() {
        return "Cow{" + "isProducingMilk=" + isProducingMilk + '}';
    }

    public Cow(int id, String breed, Date bornOn, boolean isProducingMilk) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
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
    
    
}
