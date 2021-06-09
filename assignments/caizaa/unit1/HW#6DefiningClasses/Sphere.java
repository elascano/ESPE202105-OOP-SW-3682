/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookStore.model;

/**
 *
 * @author alisson
 */
public class Sphere {
   private String color;
   private String quality;
   private String tipType;
   private int brand;
   
   public void sell(){
    }
    public void buy(){
    }
    public void offer(){ 
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
     * @return the quality
     */
    public String getQuality() {
        return quality;
    }

    /**
     * @param quality the quality to set
     */
    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * @return the tipType
     */
    public String getTipType() {
        return tipType;
    }

    /**
     * @param tipType the tipType to set
     */
    public void setTipType(String tipType) {
        this.tipType = tipType;
    }

    /**
     * @return the brand
     */
    public int getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(int brand) {
        this.brand = brand;
    }
    
}
