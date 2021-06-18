/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private LocalDate age;
    private LocalDate bornOn;
    private boolean isMolting;

    public Chicken(int id, String name, String color, LocalDate age, LocalDate bornOn, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.bornOn = bornOn;
        this.isMolting = isMolting;
    }
    
    public Chicken(){
        this.id = 0;
        this.name = "No name";
        this.color = "";
        this.age = LocalDate.now();
        this.bornOn = LocalDate.of(2000, 9, 12);
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

    public LocalDate getAge(LocalDate age, LocalDate bornOn) {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public LocalDate getBornOn() {
        return bornOn;
    }

    public void setBornOn(LocalDate bornOn) {
        this.bornOn = bornOn;
    }

    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }   
    
    public void calculatedAge(){
        Period edad = Period.between(bornOn , age);
//        System.out.println(String.format("%d años, %d meses y %d días",
//        edad.getYears(),
//        edad.getMonths(),
//        edad.getDays()));
        age = LocalDate.of(edad.getYears(), edad.getMonths(), edad.getDays());
    }

    @Override
    public String toString() {
        return "\nChicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" +age.getYear()+ " años " +age.getMonthValue()+ " meses " +age.getDayOfMonth()+  " dias , bornOn=" + bornOn + ", isMolting=" + isMolting + '}';
    }
    

}
