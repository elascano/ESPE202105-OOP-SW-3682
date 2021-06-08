/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pharmacyaccount.model;

/**
 *
 * @author Carlos
 */
public class Soap {
     private int amount;
     private String name;
     private float price;
     private String description;
     private String smell;

    public void amount(){
        
    }
    
    public void removeToShoppingCart(){
        
    }
    public void putToShoppingCart(){
        
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the smell
     */
    public String getSmell() {
        return smell;
    }

    /**
     * @param smell the smell to set
     */
    public void setSmell(String smell) {
        this.smell = smell;
    }
}
