/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Farm.model;

import java.util.Date;

/**
 *
 * @author Darwin Valdiviezo NullPunters ESPE-DCCO
 */
public class Chicken {
 private int id;
    private String name;
    private String color;
    private Date age;
    private boolean isMoting;
    
     public Chicken() {
        this.id = 0;
        this.name = "No name";
        this.color = "";
        this.age = new Date();
        this.isMoting = false;
    }

    public Chicken(int id, String name, String color, Date age, boolean isMoting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMoting = isMoting;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMoting=" + isMoting + '}';
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
     * @return the age
     */
    public Date getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Date age) {
        this.age = age;
    }

    /**
     * @return the isMoting
     */
    public boolean isIsMoting() {
        return isMoting;
    }

    /**
     * @param isMoting the isMoting to set
     */
    public void setIsMoting(boolean isMoting) {
        this.isMoting = isMoting;
    }
}
