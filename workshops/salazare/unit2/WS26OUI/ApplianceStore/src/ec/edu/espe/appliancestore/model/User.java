/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class User {
    private String name;
    private LocalDateTime birth;
    private String userMail;
    private String glender;
    private String address;
    private String password;
    private String description;
    private ArrayList<Product> products = new ArrayList<>();
    private int numberOfUsername;

    public User(String name, LocalDateTime birth, String userMail, String glender, String address, String password, String description, int numberOfUsername) {
        this.name = name;
        this.birth = birth;
        this.userMail = userMail;
        this.glender = glender;
        this.address = address;
        this.password = password;
        this.description = description;
        this.numberOfUsername = numberOfUsername;
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
     * @return the birth
     */
    public LocalDateTime getBirth() {
        return birth;
    }

    /**
     * @param birth the birth to set
     */
    public void setBirth(LocalDateTime birth) {
        this.birth = birth;
    }

    /**
     * @return the userMail
     */
    public String getUserMail() {
        return userMail;
    }

    /**
     * @param userMail the userMail to set
     */
    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    /**
     * @return the glender
     */
    public String getGlender() {
        return glender;
    }

    /**
     * @param glender the glender to set
     */
    public void setGlender(String glender) {
        this.glender = glender;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
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
     * @return the products
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    /**
     * @return the numberOfUsername
     */
    public int getNumberOfUsername() {
        return numberOfUsername;
    }

    /**
     * @param numberOfUsername the numberOfUsername to set
     */
    public void setNumberOfUsername(int numberOfUsername) {
        this.numberOfUsername = numberOfUsername;
    }

}
    
    
