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
public class Screen {
    private String model;
    private boolean original;
    private float priceRange;
    
    public void buy(){
        
    }
    public void sell(){
        
    }
    public void tostock(){
        
    }
    public Profit earnings(){
    return new Profit();
    }

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
     * @return the original
     */
    public boolean isOriginal() {
        return original;
    }

    /**
     * @param original the original to set
     */
    public void setOriginal(boolean original) {
        this.original = original;
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
    
}
