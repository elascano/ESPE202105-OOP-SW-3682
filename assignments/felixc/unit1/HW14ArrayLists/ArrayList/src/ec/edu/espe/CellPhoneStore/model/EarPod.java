/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CellPhoneStore.model;

/**
 *
 * @author 59399
 */
public class EarPod {
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the priceRange
     */
    public float getPriceRange() {
        return priceRange;
    }

    /**
     * @param priceRange the priceRange to set
     */
    public void setPriceRange(float priceRange) {
        this.priceRange = priceRange;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the noiceMuffer
     */
    public boolean isNoiceMuffer() {
        return noiceMuffer;
    }

    /**
     * @param noiceMuffer the noiceMuffer to set
     */
    public void setNoiceMuffer(boolean noiceMuffer) {
        this.noiceMuffer = noiceMuffer;
    }
    private String model;
    private String brand;
    private float priceRange;
    private String color;
    private boolean noiceMuffer;
    
    public void buy(){
        
    }
    public void sell(){
        
    }
    public void tostock(){
        
    }
    public Profit earnings(){
    return new Profit();
    }
    
}
