/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speaker.model;

/**
 *
 * @author Asmal Kevin
 */
public class Speaker {
    private String id;
    private String power;
    private float price;
    private String brand;
    private String model;
    private Boolean bluetooth;

    public Speaker() {
    }

    public Speaker(String id, String power, float price, String brand, String model, Boolean bluetooth) {
        this.id = id;
        this.power = power;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.bluetooth = bluetooth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "Speaker{" + "id=" + id + ", power=" + power + ", price=" + price + ", brand=" + brand + ", model=" + model + ", bluetooth=" + bluetooth + '}';
    }

    
    
}
