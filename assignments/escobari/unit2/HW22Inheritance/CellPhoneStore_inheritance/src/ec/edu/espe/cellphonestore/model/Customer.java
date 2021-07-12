/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphonestore.model;

/**
 *
 * @author InnovaCode ESPE-DCCO
 */
public class Customer extends Warehouse{
    private String name;
    private int id;
    private String email;
    private String phoneNumber;

    public Customer(String name, int id, String email, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", id=" + id + ", email=" + email + ", phoneNumber=" + phoneNumber + '}';
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    

    

    
}
