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
public class CellPhone extends Warehouse{
    
    private String color;
    private String brand;
    private String model;

    public CellPhone(String color, String brand, String model, int id, float priceRange) {
        super(id, priceRange);
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "CellPhone{" + "color=" + getColor() + ", brand=" + getBrand() + ", model=" + getModel() + '}';
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
    
    
    
}
