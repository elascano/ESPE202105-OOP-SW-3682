/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphonestorediagram.model;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class Cellphone {

    /**
     * @return the capacity
     */
    public Float getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(Float capacity) {
        this.capacity = capacity;
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
    private String color;
    private String model;
    private Float price;
    private Float capacity;
    private String brand;
    
     public void buy(){
    
    }
    
    public void sell(){
        
    }
    
    public void repair(){
        
    }
    
    public Case Case(){
        return new Case();
    }
    
    public Client Client(){
        return new Client();
    }
    
    public HeadPhone HeadPhone(){
        return new HeadPhone();
    }
     public ScreenProtector ScreenProtector(){
        return new ScreenProtector();
    }
    
    public Inventory Inventory(){
        return new Inventory();
    }
    
    public OpticalPen OpticalPen(){
        return new OpticalPen();
    }
    
    public ProtectiveFilm ProtectiveFilm(){
        return new ProtectiveFilm();
    }
    
    public ScreenProtector ScreeenProtector(){
        return new ScreenProtector();
    }
    
    public UsbCable UsbCable(){
        return new UsbCable();
    }
        
   
    
}
