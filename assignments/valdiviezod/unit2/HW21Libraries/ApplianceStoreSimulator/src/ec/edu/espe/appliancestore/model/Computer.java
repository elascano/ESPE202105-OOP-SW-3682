/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Computer {
    private int serialNumber;
    private float price;
    private int storage;
    private int power;
    private String brand;

    public Computer(int serialNumber, float price, int storage, int power, String brand) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.storage = storage;
        this.power = power;
        this.brand = brand;
    }
        
    public Computer(){
        this.power = 0;
        this.brand = "";
        this.price = 0.0F;
        this.storage = 0;
        this.serialNumber = 0;
    }

    @Override
    public String toString() {
        return "Computer{" + "serialNumber=" + serialNumber + ", price=" + price + ", storage=" + storage + ", power=" + power + ", brand=" + brand + '}';
    }
      
        
        
    public void buy(){
        
    }
    public void sell(){
        
    }
    public void tostock(){
        
    }
    public Gain generateprofit(){
    return new Gain();
    
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
     * @return the material
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
     * @return the storage
     */
    public int getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(int storage) {
        this.storage = storage;
    }

    /**
     * @return the serialNumber
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    
}
