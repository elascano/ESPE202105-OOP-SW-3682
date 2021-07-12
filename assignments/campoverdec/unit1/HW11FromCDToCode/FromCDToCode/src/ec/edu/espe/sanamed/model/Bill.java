/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sanamed.model;

import java.util.ArrayList;

/**
 *
<<<<<<< HEAD
 * @author sony
 */
public class Bill {
    private int serialNumber;
    private Costumer costumerImformation;
    private ArrayList<Product> cs = new ArrayList<>();




    public ShoppingList m(){
        return new ShoppingList(); 
    }
    

    public Pharmacy pharmacy(){
        return new Pharmacy();
    }
    
=======
 * @author Carlos Campoverde EMCL:java
 */
public class Bill {
    private int serialNumber;
    private Costumer costumerInformation;
    private ArrayList<Product> cs = new ArrayList<>();
    public ShoppingList m(){
        return new ShoppingList();
    }
    public Pharmacy pharmacy(){
        return new Pharmacy();
    }
>>>>>>> b0248f8fb7c20307928377337bf48b753c72edee
}
