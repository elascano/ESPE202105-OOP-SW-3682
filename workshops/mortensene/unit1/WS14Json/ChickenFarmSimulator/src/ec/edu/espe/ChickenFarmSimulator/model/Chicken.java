/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ChickenFarmSimulator.model;


import java.util.Calendar;

import java.util.GregorianCalendar;

/**
 *
 * @author Eduardo Mortesen The Programers
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private Calendar age;
    private GregorianCalendar bornOn;
    private boolean isMolting;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", age=" + getAge() + ", bornOn="+ getBornOn()+ ", isMolting=" + isIsMolting() + '}';
    }

    public Chicken(int id, String name, String color, Calendar age, GregorianCalendar bornOn, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.bornOn=bornOn;
        this.isMolting = isMolting;
    }
    
    
    public Chicken() {
        this.id = 0;
        this.name = "no name";
        this.color = "no color";
        this.isMolting = false;
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
    public Calendar getAge() {
  Calendar now = Calendar.getInstance();
        Calendar bornOn = new GregorianCalendar(2019, 01,02);
        int Birthyear = bornOn.get(Calendar.YEAR);
        int today = now.get(Calendar.YEAR);
    

long ageindays = (now.getTimeInMillis() - bornOn.getTimeInMillis())
                        / 1000 / 60 / 60 / 24;

int years = Double.valueOf(ageindays / 365.25d).intValue();
int days = Double.valueOf(ageindays % 365.25d).intValue();

System.out.println(String.format("%d years and %d days", years, days));
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Calendar age) {
        this.age = age;
    }

    /**
     * @return the bornOn
     */
    public GregorianCalendar getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(GregorianCalendar bornOn) {
        this.bornOn = bornOn;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    private GregorianCalendar GregorianCalendar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
    

 