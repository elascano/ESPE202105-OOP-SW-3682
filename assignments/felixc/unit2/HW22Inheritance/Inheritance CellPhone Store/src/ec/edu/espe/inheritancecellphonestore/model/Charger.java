/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inheritancecellphonestore.model;

/**
 *
 * @author 59399
 */
public class Charger extends Warehouse{
    
    private String color;
    private String entryType;
    private String model;

    public Charger(String color, String entryType, String model, int id, float priceRange) {
        super(id, priceRange);
        this.color = color;
        this.entryType = entryType;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Charger{" + "color=" + getColor() + ", entryType=" + getEntryType() + ", model=" + getModel() + '}';
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
