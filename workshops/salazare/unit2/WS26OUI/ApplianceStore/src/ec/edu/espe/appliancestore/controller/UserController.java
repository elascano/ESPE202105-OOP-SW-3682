/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.controller;

import ec.edu.espe.appliancestore.model.Product;
import ec.edu.espe.appliancestore.model.User;
import ec.edu.espe.appliancestore.view.FrmUser;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;
import utils.DBManager;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class UserController {
    private User user;
    private FrmUser frmUser;
    private ArrayList<Product> product;
    private DBManager dbManager = new DBManager();

    public UserController(Product product, ArrayList<Locale.Category> categorys, FrmUser aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addUser(User user){
       //TODO read users (list) from database
       //TODO add user to database
    }
    
    public ArrayList<User> readUsers(){
        ArrayList<User> users = new ArrayList<>();
        //TODO read contacts from database
        //TODO use the utils class
        User user = new User("matthew", LocalDateTime.MIN, "emsalazar1@espe.edu", "male","quito", "123455678", "user", 0);
        users.add(user);
        user = new User("edwin", LocalDateTime.MIN, "emesed@espe.edu", "male","quito", "0876543", "user", 0);
        users.add(user);
        return users;
        
    }
    
    ArrayList<User> findUser (String Name){
        ArrayList<User> users = new ArrayList<>(); 
        
        //TODO find in database
         User user = new User("matthew", LocalDateTime.MIN, "emsalazar1@espe.edu", "male","quito", "123455678", "user", 0);
         users.add(user);
        return users;
    }
    //Contact findContact(String id);
    
    boolean removeUser(String fullName){
        //TODO findContact(fllname)
        //TODO verify what cpontact to remove
        return true;
    }
    
    void updateUser(String fullName, User user){
        //TODO update contact in the database
    }

    public UserController(User user, FrmUser frmUser, ArrayList<Product> product) {
        this.user = user;
        this.frmUser = frmUser;
        this.product = product;
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

    public void addUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
