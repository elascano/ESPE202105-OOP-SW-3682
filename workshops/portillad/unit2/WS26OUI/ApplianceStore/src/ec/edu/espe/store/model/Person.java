/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Person {
    private String name;
    private String lastName;
    private String email;
    private String paswoord;
    private String phoneNumber;
    private String adress;
    private String description;
    private ArrayList<Gender> genders = new ArrayList <>();
    private Date birthDate;
    private int age;

    public Person(String name, String lastName, String email, String paswoord, String phoneNumber, String adress, String description, Date birthDate, int age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.paswoord = paswoord;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.description = description;
        this.birthDate = birthDate;
        this.age = age;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaswoord() {
        return paswoord;
    }

    public void setPaswoord(String paswoord) {
        this.paswoord = paswoord;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Gender> getGenders() {
        return genders;
    }

    public void setGenders(ArrayList<Gender> genders) {
        this.genders = genders;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    
}
