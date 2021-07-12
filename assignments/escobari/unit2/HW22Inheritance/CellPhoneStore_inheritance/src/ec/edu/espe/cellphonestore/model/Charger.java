/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphonestore.model;

/**
 *
 * @author InnovaCode
 */
public class Charger extends Warehouse {
    private float price;
    private int id;
    private String color;
    private String entryType;
    private String model;

    public Charger(String model, float price, int id, String color, String entryType ) {
        this.id = 0;
        this.color = color;
        this.entryType = entryType;
        this.model = model;
    }
 public Charger(){
        this.id = 0;
        this.price = 0.0F;
        this.entryType = "";
        this.color = "";
        this.model = "";
        }
    
    
    @Override
    public String toString() {
        return "Charger{" + "price=" + getPrice() + ", id=" + getId() + ", color=" + getColor() + ", entryType=" + getEntryType() + ", model=" + getModel() + '}';
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
    

} 
    


