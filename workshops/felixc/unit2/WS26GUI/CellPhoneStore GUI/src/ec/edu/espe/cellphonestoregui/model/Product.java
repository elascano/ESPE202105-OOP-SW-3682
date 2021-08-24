/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphonestoregui.model;

import java.time.LocalDateTime;
import java.util.ArrayList;


/**
 *
 * @author 59399
 */
public class Product {
    
    private String brand;
    private String model;
    private String password;
    private String price;
    private String productDescription;
    private String color;
    private String id;
    private ArrayList<Category> category = new ArrayList<>();
    private LocalDateTime dateProductAggregation;
    private int amount;

    public Product(String brand, String model, String password, String price, String productDescription, String color, String id, LocalDateTime dateProductAggregation, int amount) {
        this.brand = brand;
        this.model = model;
        this.password = password;
        this.price = price;
        this.productDescription = productDescription;
        this.color = color;
        this.id = id;
        this.dateProductAggregation = dateProductAggregation;
        this.amount = amount;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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
     * @return the productDescription
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * @param productDescription the productDescription to set
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the category
     */
    public ArrayList<Category> getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(ArrayList<Category> category) {
        this.category = category;
    }

    /**
     * @return the dateProductAggregation
     */
    public LocalDateTime getDateProductAggregation() {
        return dateProductAggregation;
    }

    /**
     * @param dateProductAggregation the dateProductAggregation to set
     */
    public void setDateProductAggregation(LocalDateTime dateProductAggregation) {
        this.dateProductAggregation = dateProductAggregation;
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

    

   

}
