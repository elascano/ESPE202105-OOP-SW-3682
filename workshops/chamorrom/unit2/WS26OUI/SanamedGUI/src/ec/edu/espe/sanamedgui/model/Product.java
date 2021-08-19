/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sanamedgui.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class Product {
    
    private int id;
    private String name;
    private String type;
    private String description;
    private boolean activeForSell;
    private float price;
    private ArrayList<Modification> modifications = new ArrayList<>();
    private LocalDateTime dateOfSell;
    private int amountForSale;

    public Product(int id, String name, String type, String description, boolean activeForSell, float price,ArrayList<Modification> modifications, LocalDateTime dateOfSell, int amountForSale) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.activeForSell = activeForSell;
        this.price = price;
        this.modifications = modifications;
        this.dateOfSell = dateOfSell;
        this.amountForSale = amountForSale;
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
     * @return the activeForSell
     */
    public boolean isActiveForSell() {
        return activeForSell;
    }

    /**
     * @param activeForSell the activeForSell to set
     */
    public void setActiveForSell(boolean activeForSell) {
        this.activeForSell = activeForSell;
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
     * @return the modifications
     */
    public ArrayList<Modification> getModifications() {
        return modifications;
    }

    /**
     * @param modifications the modifications to set
     */
    public void setModifications(ArrayList<Modification> modifications) {
        this.modifications = modifications;
    }

    /**
     * @return the dateOfSell
     */
    public LocalDateTime getDateOfSell() {
        return dateOfSell;
    }

    /**
     * @param dateOfSell the dateOfSell to set
     */
    public void setDateOfSell(LocalDateTime dateOfSell) {
        this.dateOfSell = dateOfSell;
    }

    /**
     * @return the amountForSale
     */
    public int getAmountForSale() {
        return amountForSale;
    }

    /**
     * @param amountForSale the amountForSale to set
     */
    public void setAmountForSale(int amountForSale) {
        this.amountForSale = amountForSale;
    }
    
    
    
}
