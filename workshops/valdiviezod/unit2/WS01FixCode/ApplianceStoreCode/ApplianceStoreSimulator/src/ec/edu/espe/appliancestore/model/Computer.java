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
    private int power;
    private String brand;
    private float price;
    private int storage;
    private int serialNumber;
    
    public Computer(){
        this.power = 0;
        this.brand = "";
        this.price = 0.0F;
        this.storage = 0;
        this.serialNumber = 0;
    }
    
    public Computer(int power,String brand,float price,int storange,int serialNumber){
        this.power = power;
        this.brand = brand;
        this.price = price;
        this.storage = storange;
        this.serialNumber = serialNumber;
    }
    
    public Computer(String power, String brand, String price, String storange, String serialNumber){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Computer(int parseInt, float parseFloat, int parseInt0, int parseInt1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Computer{" + "Power -> " + power + " GB " + " Brand -> " + brand + " Price -> " + price + " Storage ->" + storage + " GB " + " SerialNumber -> " + serialNumber + '}';
    }
    
    public String [] getArray(){
        String[] date = {"Power -> " + String.valueOf(power)+" GB "+" Brand ->" +String.valueOf(brand)+ " Price -> "+String.valueOf(price)+" Storage -> "+String.valueOf(storage)+" GB "+" SerialNumber -> "+String.valueOf(serialNumber)};
        return date;
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
