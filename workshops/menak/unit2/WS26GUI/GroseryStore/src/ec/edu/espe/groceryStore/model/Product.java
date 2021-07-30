/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.groceryStore.model;

import java.util.Date;


/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class Product {
    
    private String productName;
    private String price;
    private String amount;
    private String description;
    private String brand;
    private String type;
    private Date emmisionDate;
    private Date expireDate;

    
    
    public Product(String productName, String price, String amount, String description, String brand, String type, Date emmisionDate, Date expireDate) {
        this.productName = productName;
        this.price = price;
        this.amount = amount;
        this.description = description;
        this.brand = brand;
        this.type = type;
        this.emmisionDate = emmisionDate;
        this.expireDate = expireDate;
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
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the emmisionDate
     */
    public Date getEmmisionDate() {
        return emmisionDate;
    }

    /**
     * @param emmisionDate the emmisionDate to set
     */
    public void setEmmisionDate(Date emmisionDate) {
        this.emmisionDate = emmisionDate;
    }

    /**
     * @return the expireDate
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * @param expireDate the expireDate to set
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
    
    
    
    
    
}
