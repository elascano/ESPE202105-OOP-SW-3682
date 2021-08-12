/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speaker.model;

/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class Speaker {
    private int id;
    private int power;
    private float price;
    private String brand;
    private String model;
    private boolean hasBluetooth;

    public Speaker(int id, int power, float price, String brand, String model, boolean hasBluetooth) {
        this.id = id;
        this.power = power;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.hasBluetooth = hasBluetooth;
    }

    
    
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the power
     */
    public int getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(int power) {
        this.power = power;
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
     * @return the hasBluetooth
     */
    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    /**
     * @param hasBluetooth the hasBluetooth to set
     */
    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

   
   
    
}
