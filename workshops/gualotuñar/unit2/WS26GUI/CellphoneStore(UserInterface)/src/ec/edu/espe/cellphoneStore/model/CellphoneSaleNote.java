/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphoneStore.model;

/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class CellphoneSaleNote {
     private String color;
     private String model;
     private String NumberId;
     private float price;
     private String brand;

     
     
    public CellphoneSaleNote(String color, String model, String NumberId, float price, String brand) {
        this.color = color;
        this.model = model;
        this.NumberId = NumberId;
        this.price = price;
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
     * @return the id
     */
    public String getId() {
        return NumberId;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.NumberId = NumberId;
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
     
     
    
}
