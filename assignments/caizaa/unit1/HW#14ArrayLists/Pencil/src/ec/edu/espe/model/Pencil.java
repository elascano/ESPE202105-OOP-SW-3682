/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.Date;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class Pencil {
   private int id;
   private String name;
   private String color;
   private Date quality;
   private boolean tiptype;
   
   @Override
    public String toString() {
        return "Pencil{" + "id= 52" + id + ", name= Pencil " + name + ", color= blue" + color + ", quality= Excellent tip color and durability" + quality + ", tiptype= HB" + tiptype + '}';
    }
    public Pencil(int id, String name, String color, Date quality, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.quality = quality;
        this.tiptype = tiptype;
    }
    
    public Pencil(){
        id = 0;
        name = "no name";
        color = "";
        this.quality = new Date();
        this.tiptype = false;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
    public Date getQuality() {
        return quality;
    }

    /**
     * @param quality the quality to set
     */
    public void setQuality(Date quality) {
        this.quality = quality;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return tiptype;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this. tiptype = tiptype;
    }
   

    
}
