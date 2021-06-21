/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.espe.cellphone.model;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class CellPhone {

    public static void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void add(CellPhone cellPhone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Float price;
    private Float size;
    private String color;
    private Float weight;
    private String model;
    private int id;

    public CellPhone(Float price, String color, String model, Float weight, Float size, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CellPhone(int i, String iphone_12, String black, float f, float f0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public String toString() {
        return "CellPhone{" + "price=" + getPrice() + ", size=" + getSize() + ", color=" + 
                getColor() + ", weight=" + getWeight() + ", model=" + getModel() + ", id=" + getId()
                + '}';
    }
    
    
    public CellPhone(Float price, Float size, String color, Float weight, 
            String model, int id) {
        
        this.id = id;
        this.price = price;
        this.color = color;
        this.size = size;
        this.weight = weight;
        this.model = model;
    }
    
    public CellPhone() {
        this.id = 0;
        this.price= (float) 0;
        this.color= "";
        this.weight= (float) 0;
        this.size= (float) 0;
        this.model= "";
        
        
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
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

   
}
