/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private Date date;
    private boolean isMolting;

    public Chicken(int id, String name, String color, Date date, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.date = date;
        this.isMolting = isMolting;
    }
    
    public Chicken(){
        this.id = 0;
        this.name = "No name";
        this.color = "";
        this.date = new Date();
        this.isMolting = false;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", date=" + date + ", isMolting=" + isMolting + '}';
    }
    
    
    
    
}
