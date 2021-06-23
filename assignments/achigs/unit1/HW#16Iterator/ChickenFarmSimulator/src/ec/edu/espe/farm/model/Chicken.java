/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class Chicken {
    
    private int id;
    private String name;
    private String color;
    private int monthBorn=Calendar.MONTH, yearBorn=Calendar.YEAR,
            dayBorn=Calendar.DAY_OF_MONTH;
    private boolean isMolting;

    @Override
    public String toString() {
        return "{, id=" + getId() + "\n" + ", name=" + getName() + "\n" + ", color=" + getColor() +"\n" + ", monthBorn=" + getMonthBorn() +"\n" + ", yearBorn=" + getYearBorn() +"\n" + ", dayBorn=" + getDayBorn() +"\n" + ", isMolting=" + isIsMolting() + '}';
    }
    
    //overload
    public Chicken(int id, String name, String color, int monthBorn, int yearBorn, int dayBorn, boolean isMolting){
        this.id = id;
        this.name = name;
        this.color = color;
        this.monthBorn = monthBorn;
        this.yearBorn = yearBorn;
        this.dayBorn = dayBorn;
        this.isMolting = isMolting;
    }

    public Chicken() {
        id = 0;
        name = "no name";
        color = "";
        this.monthBorn = 1;
        this.yearBorn = 2001;
        this.dayBorn = 15;
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
     * @return the monthBorn
     */
    public int getMonthBorn() {
        return monthBorn;
    }

    /**
     * @param monthBorn the monthBorn to set
     */
    public void setMonthBorn(int monthBorn) {
        this.monthBorn = monthBorn;
    }

    /**
     * @return the yearBorn
     */
    public int getYearBorn() {
        return yearBorn;
    }

    /**
     * @param yearBorn the yearBorn to set
     */
    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    /**
     * @return the dayBorn
     */
    public int getDayBorn() {
        return dayBorn;
    }

    /**
     * @param dayBorn the dayBorn to set
     */
    public void setDayBorn(int dayBorn) {
        this.dayBorn = dayBorn;
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
}
    