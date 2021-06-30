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
public class HeadPhone {
    private float price;
    private int id;
    private String color;
    private String model;

     public HeadPhone(){
        this.id = 0;
        this.price = 0.0F;
        this.color = "";
        this.model = "";
        }
    
    
    
    public HeadPhone(String model, float price, int id, String color ) {
        this.price = price;
        this.id = id;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "HeadPhone{" + "price=" + price + ", id=" + id + ", color=" + color + ", model=" + model + '}';
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
