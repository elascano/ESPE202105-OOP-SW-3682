/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inheritancecellphonestore.model;

/**
 *
 * @author 59399
 */
public class PhoneCase extends Warehouse{
    
    private String color;
    private String model;
    private String brand;
    private String material;

    public PhoneCase(String color, String model, String brand, String material, int id, float priceRange) {
        super(id, priceRange);
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.material = material;
    }

    @Override
    public String toString() {
        return "PhoneCase{" + "color=" + getColor() + ", model=" + getModel() + ", brand=" + getBrand() + ", material=" + getMaterial() + '}';
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
    
    
    
}
