/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.grocerystoremanagement;

import java.util.Date;

/**
 *
 * @author Mortensen Eduardo
 */
public class Bacon {
private float weight;
private float purchaseprice;
private float saleprice;
private String brand;
private String type;
private Date expirationdate;

private void sell(float purchaseprice){
    
}
private void buy(float saleprice){
    
}
private void checkquaility(){
    
}
private void checkstatus (){
    
}

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the purchaseprice
     */
    public float getPurchaseprice() {
        return purchaseprice;
    }

    /**
     * @param purchaseprice the purchaseprice to set
     */
    public void setPurchaseprice(float purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    /**
     * @return the saleprice
     */
    public float getSaleprice() {
        return saleprice;
    }

    /**
     * @param saleprice the saleprice to set
     */
    public void setSaleprice(float saleprice) {
        this.saleprice = saleprice;
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
     * @return the expirationdate
     */
    public Date getExpirationdate() {
        return expirationdate;
    }

    /**
     * @param expirationdate the expirationdate to set
     */
    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }
}
