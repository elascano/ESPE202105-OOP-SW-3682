/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fromCDtoCode.model;

/**
 *
 * @author InnovaCode ESPE-DCCO
 */
public class Charger {
    private float price;
    private String color;
    private String entryType;
    private String id;
    
    public Profit benefit(){
        return new Profit();
    }
    
    public void status(){
        
    }
    
    public void stock(){
        
    }
    
    public void beSelled(){
        
    }
    
    public void beBought(){
        
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
     * @return the entryType
     */
    public String getEntryType() {
        return entryType;
    }

    /**
     * @param entryType the entryType to set
     */
    public void setEntryType(String entryType) {
        this.entryType = entryType;
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
}
