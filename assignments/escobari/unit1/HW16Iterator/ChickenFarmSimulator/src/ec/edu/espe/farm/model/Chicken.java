/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private boolean isMolting;
    private Calendar DateNac= new GregorianCalendar(2016,05,07);
    private Calendar DateToday=Calendar.getInstance();
    private int yearNac=DateNac.get(Calendar.YEAR);
    private int yearToday=DateToday.get(Calendar.YEAR);
    private int age=yearToday-yearNac;

    public Chicken(int chickenId, String name, String color, int age, boolean molting) {
        
    }

   
    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", isMolting=" + isMolting + ", DateNac=" + DateNac + ", DateToday=" + DateToday + ", yearNac=" + yearNac + ", yearToday=" + yearToday + ", age=" + age + '}';
    }
    

    public Chicken(int id, String name, String color, int age, boolean isMolting, Date date) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
    }
    
    public Chicken() {
        this.id = 0;
        this.name = "no name";
        this.color = "";
        this.age = 0;
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

    /**
     * @return the DateNac
     */
    public Calendar getDateNac() {
        return DateNac;
    }

    /**
     * @param DateNac the DateNac to set
     */
    public void setDateNac(Calendar DateNac) {
        this.DateNac = DateNac;
    }

    /**
     * @return the DateToday
     */
    public Calendar getDateToday() {
        return DateToday;
    }

    /**
     * @param DateToday the DateToday to set
     */
    public void setDateToday(Calendar DateToday) {
        this.DateToday = DateToday;
    }

    /**
     * @return the yearNac
     */
    public int getYearNac() {
        return yearNac;
    }

    /**
     * @param yearNac the yearNac to set
     */
    public void setYearNac(int yearNac) {
        this.yearNac = yearNac;
    }

    /**
     * @return the yearToday
     */
    public int getYearToday() {
        return yearToday;
    }

    /**
     * @param yearToday the yearToday to set
     */
    public void setYearToday(int yearToday) {
        this.yearToday = yearToday;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    

    
    
    
}
