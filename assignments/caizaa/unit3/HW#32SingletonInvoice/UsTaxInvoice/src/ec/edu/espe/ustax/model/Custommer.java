/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ustax.model;

import java.util.Date;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class Custommer {
    private String firstName;
    private String lastName;
    private String numberPhone;
    private String address;
    private String email;
    private String identificationCard;
    private String date;

    @Override
    public String toString() {
        return "Cliente:\n" + "Nombre: " + getFirstName() + "\nApellido: " + getLastName() + "\nTelefono: " + getNumberPhone() + "\nDirección: " + getAddress() + "\nEmail: " + getEmail() + "\nIdentificación: " + getIdentificationCard() + "\nFecha: " + getDate();
    }

    public Custommer(String firstName, String lastName, String numberPhone, String address, String email, String identificationCard, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.address = address;
        this.email = email;
        this.identificationCard = identificationCard;
        this.date = date;
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
     * @return the numberPhone
     */
    public String getNumberPhone() {
        return numberPhone;
    }

    /**
     * @param numberPhone the numberPhone to set
     */
    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
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
     * @return the identificationCard
     */
    public String getIdentificationCard() {
        return identificationCard;
    }

    /**
     * @param identificationCard the identificationCard to set
     */
    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    
}
