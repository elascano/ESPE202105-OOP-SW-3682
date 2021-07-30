/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SanamedAccountSystem.model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class Bill {
    private Client client;
    private Pharmacy pharmacy;
    private int numberOfbill;
    private LocalDateTime date;
    private String cashOrCreditC;
    private ShoppingList list;
    private  int quantityOfProducts;

    public Bill() {
    }

    public Bill(Client client, Pharmacy pharmacy, int numberOfbill, LocalDateTime date, String cashOrCreditC, ShoppingList list, int quantityOfProducts) {
        this.client = client;
        this.pharmacy = pharmacy;
        this.numberOfbill = numberOfbill;
        this.date = date;
        this.cashOrCreditC = cashOrCreditC;
        this.list = list;
        this.quantityOfProducts = quantityOfProducts;
    }
    
    

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    public int getNumberOfbill() {
        return numberOfbill;
    }

    public void setNumberOfbill(int numberOfbill) {
        this.numberOfbill = numberOfbill;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getCashOrCreditC() {
        return cashOrCreditC;
    }

    public void setCashOrCreditC(String cashOrCreditC) {
        this.cashOrCreditC = cashOrCreditC;
    }

    public ShoppingList getList() {
        return list;
    }

    public void setList(ShoppingList list) {
        this.list = list;
    }

    public int getQuantityOfProducts() {
        return quantityOfProducts;
    }

    public void setQuantityOfProducts(int quantityOfProducts) {
        this.quantityOfProducts = quantityOfProducts;
    }
    
    
    
    
    public void printBil(ShoppingList list){
        
    }
}
