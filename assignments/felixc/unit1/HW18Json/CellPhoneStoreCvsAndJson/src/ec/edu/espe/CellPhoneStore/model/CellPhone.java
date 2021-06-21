/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CellPhoneStore.model;

/**
 *
 * @author Cristian Felix InnovaCode ESPE-DCCO
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
    
    public CellPhone(int id,float price,String brand , String model, String color ){
        this.id = id;
        this.price = price;
        this.brand= brand;
        this.model = model;
        this.color = color; 
        
    }

    public CellPhone(String id, String price, String brand, String Model, String color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public Profit profit(){
    return new Profit();
    
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
