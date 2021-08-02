/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.controller;

import ec.edu.espe.store.model.Interest;
import ec.edu.espe.store.model.User;
import ec.edu.espe.store.view.FrmUser;
import java.time.LocalDateTime;
import java.util.ArrayList;
import utils.DBManager;
import utils.Persistence;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class UserController {
    
    private User user;
    private FrmUser frmUser;
    private ArrayList<Interest> hobbies;
    private Persistence dbManager = new DBManager();

    public void addUser(User user){
        //TODO read user from database
        //TODO add user to database
        //Using the utils class
        
        //TODO user convet to json
        String userJson = "{}";
        dbManager.create(userJson, "contact"); // in files contact.json
    }
    
    public ArrayList<User> readUser(){
        
        ArrayList<User> users = new ArrayList<>();
        //read user from database
        //using the utils class
        User user1 = new User("Fracisco Nicolas","Suquillo Gavilanes", "0983011361", "fnsuquillo@espe.esu.ec", "commite del pueblo", "male", "Nico", "1234",hobbies,LocalDateTime.MIN, "", 0);
        users.add(user);
        return users;
    }
    
    public ArrayList<User> findUser(String lastName){
        
        ArrayList<User> users = new ArrayList<>();
        
        //TODO call our utils class to find the user in database
        User user1 = new User("Carolina Ayllin","Suquillo Gavilanes", "0983091264", "ayllin12@hotmail.com", "commite del pueblo", "female", "Ayllin", "12434",hobbies,LocalDateTime.MIN, "", 0);
        users.add(user);
        return users;
    }
    
    //User findUser(String id);
    
    //boolean removeUser(String fullName);
    
    //void updateUser(String fullName,User user);
    
    public UserController(User user, FrmUser frmUser, ArrayList<Interest> hobbies) {
        this.user = user;
        this.frmUser = frmUser;
        this.hobbies = hobbies;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the frmUser
     */
    public FrmUser getFrmUser() {
        return frmUser;
    }

    /**
     * @param frmUser the frmUser to set
     */
    public void setFrmUser(FrmUser frmUser) {
        this.frmUser = frmUser;
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
    
}
