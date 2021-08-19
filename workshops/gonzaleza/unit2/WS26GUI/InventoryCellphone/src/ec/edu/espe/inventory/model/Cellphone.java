/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inventory.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class Cellphone {
    private String brand;
    private String color;
    private float price;
    private int id;
    private String model;
    private String description;
    private int amount;
    private ArrayList<Phonecase> phonecases = new ArrayList<>();
    private LocalDateTime storedOn;

    public Cellphone(String brand, String color, float price, int id, String model, String description, int amount, LocalDateTime storedOn) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.id = id;
        this.model = model;
        this.description = description;
        this.amount = amount;
        this.storedOn = storedOn;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
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
     * @return the phonecases
     */
    public ArrayList<Phonecase> getPhonecases() {
        return phonecases;
    }

    /**
     * @param phonecases the phonecases to set
     */
    public void setPhonecases(ArrayList<Phonecase> phonecases) {
        this.phonecases = phonecases;
    }

    /**
     * @return the storedOn
     */
    public LocalDateTime getStoredOn() {
        return storedOn;
    }

    /**
     * @param storedOn the storedOn to set
     */
    public void setStoredOn(LocalDateTime storedOn) {
        this.storedOn = storedOn;
    }
    
    
    
}
