/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SanamedAccountSystem.model;

/**
 *
 * @author Myck
 */
public class Pill {
    private int id;
    private String name;
    private float price;
    private int amountInStock;
    private String description;  
    
    public void addToShoppingCart(){
        
    }

    /**
     * @return the id
     */Z
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
     * @return the amountInStock
     */
    public int getAmountInStock() {
        return amountInStock;
    }

    /**
     * @param amountInStock the amountInStock to set
     */
    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
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
}

