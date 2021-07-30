/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lizbeth Cajas
 */
public class Client {
    private String firstName;
    private String lastName;
    private String adress;
    private String email;
    private String telephone;
    private String invoice;
    private String description;
    private ArrayList<Medicine> medicine = new ArrayList<>();
    private LocalDateTime bithDate;
    private int monthInewThisInvoice;

    public Client(String firstName, String lastName, String adress, String email, String telephone, String invoice, String description, LocalDateTime bithDate, int monthInewThisInvoice) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.email = email;
        this.telephone = telephone;
        this.invoice = invoice;
        this.description = description;
        this.bithDate = bithDate;
        this.monthInewThisInvoice = monthInewThisInvoice;
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
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
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
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the invoice
     */
    public String getInvoice() {
        return invoice;
    }

    /**
     * @param invoice the invoice to set
     */
    public void setInvoice(String invoice) {
        this.invoice = invoice;
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
     * @return the medicine
     */
    public ArrayList<Medicine> getMedicine() {
        return medicine;
    }

    /**
     * @param medicine the medicine to set
     */
    public void setMedicine(ArrayList<Medicine> medicine) {
        this.medicine = medicine;
    }

    /**
     * @return the bithDate
     */
    public LocalDateTime getBithDate() {
        return bithDate;
    }

    /**
     * @param bithDate the bithDate to set
     */
    public void setBithDate(LocalDateTime bithDate) {
        this.bithDate = bithDate;
    }

    /**
     * @return the monthInewThisInvoice
     */
    public int getMonthInewThisInvoice() {
        return monthInewThisInvoice;
    }

    /**
     * @param monthInewThisInvoice the monthInewThisInvoice to set
     */
    public void setMonthInewThisInvoice(int monthInewThisInvoice) {
        this.monthInewThisInvoice = monthInewThisInvoice;
    }
    
}
