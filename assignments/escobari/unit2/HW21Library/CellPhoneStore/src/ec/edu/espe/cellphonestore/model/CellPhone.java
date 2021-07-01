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
public class CellPhone {
    private String color;
    private String brand;
    private float price;
    private int id;
    private String model;

    public CellPhone(){
        this.id = 0;
        this.price = 0.0F;
        this.brand = "";
        this.color = "";
        this.model = "";
        }
    
    
    public CellPhone(String model, int id, float price,String brand , String color ){
        this.id = id;
        this.price = price;
        this.brand= brand;
        this.model = model;
        this.color = color; 
        
    }
    
    @Override
    public String toString() {
        return "CellPhone(" + "ProductId -> " + getId() + "; price ->" + 
                getPrice() + "; brand -> " + getBrand()  + "; model-> " + getModel() + "; color-> " + getColor() ;
                }
    public String [] getArray(){
        String[] date = {"id -> " + String.valueOf(getId())+ "; price ->" +String.valueOf(getPrice())+ "; brand -> "+String.valueOf(getBrand()) + "; model-> "+String.valueOf(getModel())+ "; color -> " + String.valueOf(getColor())};
     return date;
    }
    
        
    public void buy(){
        
    }
    public void sell(){
        
    }
    public void tostock(){
        
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
    
}
