/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.spk.model;

/**
 *
 * @author Darwin
 */
public class Speaker {
    private String id;
    private String price;
    private String power;
    private String model;
    private String brand;
    private String bluetooth;

    public Speaker(String id, String price, String power, String model, String brand, String bluetooth) {
        this.id = id;
        this.price = price;
        this.power = power;
        this.model = model;
        this.brand = brand;
        this.bluetooth = bluetooth;
    }

    public Speaker(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the power
     */
    public String getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(String power) {
        this.power = power;
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
     * @return the bluetooth
     */
    public String getBluetooth() {
        return bluetooth;
    }

    /**
     * @param bluetooth the bluetooth to set
     */
    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

}