/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.groceryStore.model;


import java.util.ArrayList;
//import java.util.Date;


/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class Client {
    
    private String name;
    private String ID;
    private String phoneNumber;
    private String email;
    private String password; 
    private String description;
    
    private ArrayList<Product> product = new ArrayList<>();
    //private Date dateOfEntry;
    private int quantityOfProduct;

    public Client(String name, String ID, String phoneNumber, String email, String password, String description, int quantityOfProduct) {
        this.name = name;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.description = description;
        //this.dateOfEntry = dateOfEntry;
        this.quantityOfProduct = quantityOfProduct;
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
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the product
     */
    public ArrayList<Product> getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }

    
    /**
     * @return the dateOfEntry
     */
    //public Date getDateOfEntry() {
    //    return dateOfEntry;
    //}
    
    /**
     * @param dateOfEntry the dateOfEntry to set
     */
    //public void setDateOfEntry(Date dateOfEntry) {
    //    this.dateOfEntry = dateOfEntry;
    //}

    /**
     * @return the quantityOfProduct
     */
    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    /**
     * @param quantityOfProduct the quantityOfProduct to set
     */
    public void setQuantityOfProduct(int quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

        
    
    
  


    
    
    
}
