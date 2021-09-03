/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.store.model;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    
   
    
}
