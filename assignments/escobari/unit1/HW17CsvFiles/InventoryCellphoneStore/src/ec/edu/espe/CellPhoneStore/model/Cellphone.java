/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CellPhoneStore.model;

/**
 *
 * @author Usuario
 */
public class Cellphone {
    private String color;
    private String model;
    private Float price;
    private Float size;
    private Float weight;
    private String id;

    public Cellphone(String id, float price, float size, String color, float weight, String model) {
        this.price=price;
        this.color=color;
        this.model=model;
        this.size=size;
        this.weight= weight;
        this.id= id;
        
    }

    @Override
    public String toString() {
        return "Cellphone{" + "color=" + getColor() + ", model=" + getModel() + ", price=" + getPrice() + ", size=" + getSize() + ", weight=" + getWeight() + ", id=" + getId() + '}';
    }
    
    public Profit benefit(){
        return new Profit();
    }
    
    public void buy(){
    
    }
    
    public void sell(){
        
    }
    
    public void repair(){
        
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
    public Float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * @return the size
     */
    public Float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(Float size) {
        this.size = size;
    }

    /**
     * @return the weight
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(Float weight) {
        this.weight = weight;
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

    private static class Profit {

        public Profit() {
        }
    }

    
}
