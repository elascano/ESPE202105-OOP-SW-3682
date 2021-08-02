/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ManageQuestion23.model;

/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class Computers {
    private int serialNumber;
    private String brand;
    private String model;
    private int Ram;
    private int storage;
    private Boolean IsNew;
    private float price;

    public Computers(int serialNumber, String brand, String model, int Ram, int storage, Boolean IsNew, float price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.Ram = Ram;
        this.storage = storage;
        this.IsNew = IsNew;
        this.price = price;
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
     * @return the Ram
     */
    public int getRam() {
        return Ram;
    }

    /**
     * @param Ram the Ram to set
     */
    public void setRam(int Ram) {
        this.Ram = Ram;
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
     * @return the IsNew
     */
    public Boolean getIsNew() {
        return IsNew;
    }

    /**
     * @param IsNew the IsNew to set
     */
    public void setIsNew(Boolean IsNew) {
        this.IsNew = IsNew;
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
    
    
}
