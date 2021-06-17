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
public class CellPhone {
    
    private String brand;
    private String color;
    private float priceRange;
    private String model;
    
    public CellPhone(String brand, String color, float priceRange, String model) {
        this.brand = brand;
        this.color = color;
        this.priceRange = priceRange;
        this.model = model;
    }

    public CellPhone(int priceRange, String brand, String color, String model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    CellPhone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    

    
    @Override
    
    public String toString() {
        return "Cellphone{" + "price =" + priceRange + ", color=" + color + ", model=" + model + ", brand=" + brand + '}';
    }
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
