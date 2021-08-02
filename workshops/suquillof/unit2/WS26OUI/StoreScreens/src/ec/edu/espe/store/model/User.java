/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class User {
    
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;
    private String gender;
    private String storeUser;
    private String password;
    private ArrayList<Interest> hobbies;
    private LocalDateTime dateOfBirth;
    private String comments;
    private int workHours;

    public User(String firstName, String lastName, String phoneNumber, String email, String address, String gender, String storeUser, String password, ArrayList<Interest> hobbies, LocalDateTime dateOfBirth, String comments, int workHours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.storeUser = storeUser;
        this.password = password;
        this.hobbies = hobbies;
        this.dateOfBirth = dateOfBirth;
        this.comments = comments;
        this.workHours = workHours;
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
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return storeUser;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.storeUser = user;
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
     * @return the hobbies
     */
    public ArrayList<Interest> getHobbies() {
        return hobbies;
    }

    /**
     * @param hobbies the hobbies to set
     */
    public void setHobbies(ArrayList<Interest> hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * @return the dateOfBirth
     */
    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the workHours
     */
    public int getWorkHours() {
        return workHours;
    }

    /**
     * @param workHours the workHours to set
     */
    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
    
    
}
