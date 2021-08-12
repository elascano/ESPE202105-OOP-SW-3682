/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.system.model;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class Speaker {
    
    private String id;
    private String power;
    private String price;
    private String manufactured;
    private String model;
    private String isBluetooth;

    public Speaker(String id, String power, String price, String manufactured, String model, String isBluetooth) {
        this.id = id;
        this.power = power;
        this.price = price;
        this.manufactured = manufactured;
        this.model = model;
        this.isBluetooth = isBluetooth;
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
     * @return the manufactured
     */
    public String getManufactured() {
        return manufactured;
    }

    /**
     * @param manufactured the manufactured to set
     */
    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
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
     * @return the isBluetooth
     */
    public String getIsBluetooth() {
        return isBluetooth;
    }

    /**
     * @param isBluetooth the isBluetooth to set
     */
    public void setIsBluetooth(String isBluetooth) {
        this.isBluetooth = isBluetooth;
    }

    
}
