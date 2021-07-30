/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

import ec.edu.espe.bookstore.view.FrmInvoice;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class Invoice {
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String email;
    private String address;
    private String description;
    private String typeDocument;  
    private ArrayList<Book> books = new ArrayList<>();
    private LocalDateTime birthDate;
    private int amountProduct;

    public Invoice(String firstName, String lastName, String password, String phoneNumber, String email, String address, String description, String typeDocument, ArrayList<Book> books, LocalDateTime birthDate, int amountProduct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.description = description;
        this.typeDocument = typeDocument;
        this.books = books;
        this.birthDate = birthDate;
        this.amountProduct = amountProduct;
    }

    
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
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
     * @return the typeDocument
     */
    public String getTypeDocument() {
        return typeDocument;
    }

    /**
     * @param typeDocument the typeDocument to set
     */
    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    /**
     * @return the books
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    /**
     * @return the birthDate
     */
    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the amountProduct
     */
    public int getAmountProduct() {
        return amountProduct;
    }

    /**
     * @param amountProduct the amountProduct to set
     */
    public void setAmountProduct(int amountProduct) {
        this.amountProduct = amountProduct;
    }
    
    
}
