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
public class Bill {
    private int numberOfBill;
    private String billID;
    private int clientID;
    private String clientName;
    private ArrayList<String> amountOfProducts = new ArrayList<String>();
    private ArrayList unitPrice = new ArrayList();
    private ArrayList totalPrice = new ArrayList();

    public int getNumberOfBill() {
        return numberOfBill;
    }

    public void setNumberOfBill(int numberOfBill) {
        this.numberOfBill = numberOfBill;
    }

    public String getBillID() {
        return billID;
    }

    public void setBillID(String billID) {
        this.billID = billID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public ArrayList<String> getAmountOfProducts() {
        return amountOfProducts;
    }

    public void setAmountOfProducts(ArrayList<String> amountOfProducts) {
        this.amountOfProducts = amountOfProducts;
    }

    public ArrayList getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(ArrayList unitPrice) {
        this.unitPrice = unitPrice;
    }

    public ArrayList getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(ArrayList totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
    
    public void printBill(){
        
    }
    
    public void sentToEmail(){
        
    }
    
}
