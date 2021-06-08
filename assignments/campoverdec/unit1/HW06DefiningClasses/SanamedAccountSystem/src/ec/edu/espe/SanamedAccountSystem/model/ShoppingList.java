/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SanamedAccountSystem.model;

import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class ShoppingList {
    private ArrayList<String> products = new ArrayList<String>();
    private int amount;
    private Client client;
    private float Value;

    public ArrayList<String> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public float getValue() {
        return Value;
    }

    public void setValue(float Value) {
        this.Value = Value;
    }
    
    
    
    public void removeProduct(){
        
    }
}
