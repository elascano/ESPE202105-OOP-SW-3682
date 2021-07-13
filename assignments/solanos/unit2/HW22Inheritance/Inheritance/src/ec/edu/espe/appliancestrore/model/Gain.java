/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestrore.model;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class Gain {
    
    private float price;

    public Gain(float price) {
        this.price = price;
    }
    
    public Gain(){
        price=0.0F;
    }
    
    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
}
