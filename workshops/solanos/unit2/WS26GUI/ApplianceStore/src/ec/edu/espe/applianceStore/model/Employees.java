/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.applianceStore.model;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class Employees {
    
    private int id;
    private String name;
    private String lastName;
    private int age;
    private String description;
    
    

    public Employees(int id, String name, String lastName, int age, String description) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.description = description;
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
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    /**
     * @return the email
     */
    public String getEmail() {
        return description;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.description = description;
    }
    
}
