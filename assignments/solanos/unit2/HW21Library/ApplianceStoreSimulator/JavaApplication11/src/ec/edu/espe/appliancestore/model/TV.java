/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class TV {
    private int serialnumber;
    private float price;
    private float size;
    private String color;
    private String definition;
    private String model;

    public TV() {
        this.serialnumber = 0;
        this.price = 0.0F;
        this.size = 0.0F;
        this.color = "";
        this.definition = "";
        this.model = "";
    }

    public TV(int serialnumber, float price, float size, String color, String definition, String model) {
        this.serialnumber = serialnumber;
        this.price = price;
        this.size = size;
        this.color = color;
        this.definition = definition;
        this.model = model;
    }

    @Override
    public String toString() {
        return "TV{" + "serialnumber=" + serialnumber + ", price=" + price + ", size=" + size + ", color=" + color + ", definition=" + definition + ", model=" + model + '}';
    }
    
    
    
    public void buy(){
        
    }
    public void sell(){
        
    }
    public void tostock(){
        
    }
    public Gain generateprofit(){
    return new Gain();
    
    }

    /**
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
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
     * @return the definition
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * @param definition the definition to set
     */
    public void setDefinition(String definition) {
        this.definition = definition;
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
     * @return the serialnumber
     */
    public int getSerialnumber() {
        return serialnumber;
    }

    /**
     * @param serialnumber the serialnumber to set
     */
    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }
}
