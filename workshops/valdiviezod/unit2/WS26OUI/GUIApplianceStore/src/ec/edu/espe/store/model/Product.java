/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public class Product {
    
    private String productName;
    private String price;
    private String valoration;
    private String serialNumber;
    private String description;
    private String brand;   
    private ArrayList<Iron> irons = new ArrayList<>();
    private Date sellDate;
    private int monthArrivalProduct;

    public Product(String productName, String price, String valoration, String serialNumber, String description, String brand, Date sellDate, int monthArrivalProduct) {
        this.productName = productName;
        this.price = price;
        this.valoration = valoration;
        this.serialNumber = serialNumber;
        this.description = description;
        this.brand = brand;
        this.sellDate = sellDate;
        this.monthArrivalProduct = monthArrivalProduct;
    }

    public Product(String productName, String Price, String Valoration, String serialNumber, String Description, Date sellDate, int datetoday) {
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
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
     * @return the valoration
     */
    public String getValoration() {
        return valoration;
    }

    /**
     * @param valoration the valoration to set
     */
    public void setValoration(String valoration) {
        this.valoration = valoration;
    }

    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @return the irons
     */
    public ArrayList<Iron> getIrons() {
        return irons;
    }

    /**
     * @param irons the irons to set
     */
    public void setIrons(ArrayList<Iron> irons) {
        this.irons = irons;
    }

    /**
     * @return the sellDate
     */
    public Date getSellDate() {
        return sellDate;
    }

    /**
     * @param sellDate the sellDate to set
     */
    public void setSellDate(Date sellDate) {
        this.sellDate = sellDate;
    }

    /**
     * @return the monthArrivalProduct
     */
    public int getMonthArrivalProduct() {
        return monthArrivalProduct;
    }

    /**
     * @param monthArrivalProduct the monthArrivalProduct to set
     */
    public void setMonthArrivalProduct(int monthArrivalProduct) {
        this.monthArrivalProduct = monthArrivalProduct;
    }
    
}
