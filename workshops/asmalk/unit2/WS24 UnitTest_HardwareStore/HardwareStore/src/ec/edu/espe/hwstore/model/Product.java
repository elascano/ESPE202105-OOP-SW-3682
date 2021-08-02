/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hwstore.model;

import utils.Tax;

/**
 *
 * @author Asmal Kevin
 */
public class Product {
    private int id;
    private String description;
    private float price;
    private float salePrice;
    private float totalPrice;

    public Product(int id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
        
        this.salePrice = price *1.20F;
        this.totalPrice = Tax.computeTotalPrice(salePrice);
    }

    public Product(int id, String description, float price, float salePrice, float totalPrice) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.salePrice = salePrice;
        this.totalPrice = totalPrice;
    }
    
    
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the salePrice
     */
    public float getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return the totalPrice
     */
    public float getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
}
