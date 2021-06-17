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
public class DataCable {
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
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    private String model;
    private String brand;
    private float priceRange;
    private String color;
    private float size;
    private String material;
    
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
