/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inventorycellphonestore.model;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class Cellphone {
    private float price;
    private float size;
    private String color;
    private float weight;
    private String model;
    private String id;

    public Cellphone(String model,float price, float size, String color, float weight, String id) {
        this.price = price;
        this.size = size;
        this.color = color;
        this.weight = weight;
        this.model = model;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cellphone{" + "model=" + model +  "price=" + price + ", size=" + size + ", color=" + color + ", weight=" + weight + ", id=" + id + '}';
    }
    
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
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
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