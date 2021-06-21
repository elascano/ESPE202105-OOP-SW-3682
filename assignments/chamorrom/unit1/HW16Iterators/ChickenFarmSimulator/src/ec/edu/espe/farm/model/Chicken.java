/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class Chicken {

    private int id;
    private String name;
    private String color;
    private String born;
    private String age;
    private boolean isMolting;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + '}';
    }

    public Chicken() {
        this.id = 0;
        this.name = "no name";
        this.color = "";
        this.born = "no born";
        this.age = "no age";
        this.isMolting = false;
    }

    public Chicken(int id, String name, String color, String born, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.born = born;
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dateOfBorn = LocalDate.parse(born, formatter);
                Period calculateAge = Period.between(dateOfBorn, LocalDate.now());
                age=(String.format("%d years, %d moths y %d days",
                calculateAge.getYears(),
                calculateAge.getMonths(),
                calculateAge.getDays()));
        this.isMolting = isMolting;
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
    public String getAge() {

        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
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
