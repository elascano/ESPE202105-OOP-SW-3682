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
public class Computer extends ApplianceStore{
    private int storage;
    private int power;
    private String brand;

    public Computer(int serialNumber, float price,int storage, int power, String brand) {
        super(serialNumber, price);
        this.storage = storage;
        this.power = power;
        this.brand = brand;
    }

    
    @Override
    public String toString() {
        return "Computer{" +super.toString()+ ", storage=" + storage + "GB" + ", power=" + power + "GHz" + ", brand=" + brand + '}';
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

       
    
}
