/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speaker.model;

/**
 *
 * @author jejoc
 */
public class Speaker {
    private int id;
    private int power;
    private float price;
    private String model;
    private String manufacturer;
    private boolean bluetooth;
    
    public Speaker(int id, int power, float price, String model, String manufacturer, boolean bluetooth) {
        this.id = id;
        this.power = power;
        this.price = price;
        this.model = model;
        this.manufacturer = manufacturer;
        this.bluetooth = bluetooth;
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
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the bluetooth
     */
    public boolean isBluetooth() {
        return bluetooth;
    }

    /**
     * @param bluetooth the bluetooth to set
     */
    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
    
}
