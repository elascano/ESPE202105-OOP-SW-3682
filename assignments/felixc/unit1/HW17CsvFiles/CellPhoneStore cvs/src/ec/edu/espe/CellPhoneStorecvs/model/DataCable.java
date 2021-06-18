/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CellPhoneStorecvs.model;


/**
 *
 * @author 59399
 */
public class DataCable {
    private String model;
    private String brand;
    private float priceRange;
    private String color;
    private float size;
    private String material;

    public DataCable(String model,float priceRange, float size, String color, String brand, String material) {
        this.priceRange = priceRange;
        this.size = size;
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.material = material;
    }

    @Override
    public String toString() {
        return "DataCable{" + "price=" + priceRange + ", size=" + size + ", color=" + color + ", brand=" + brand + ", model=" + model + ", id=" + material + '}';
    }
    
    public Profit benefit(){
        return new Profit();
    }
    
    public void status(){
        
    }
    
    public void stock(){
        
    }
    
    public void beSelled(){
        
    }
    
    public void beBought(){
        
    }

    /**
     * @return the price
     */
    public float getPriceRange() {
        return priceRange;
    }

    /**
     * @param priceRange the price to set
     */
    public void setPriceRange(float priceRange) {
        this.priceRange = priceRange;
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
     * @return the weight
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the weight to set
     */
    public void set(String brand) {
        this.brand = brand;
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
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void seMaterial(String material) {
        this.material = material;
    }  
}
