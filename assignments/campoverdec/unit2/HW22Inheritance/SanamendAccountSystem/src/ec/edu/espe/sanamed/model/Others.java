/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sanamed.model;

/**
 *
 * @author Carlos Campoverde EMCL.java ESPE-DCCO
 */
class Others {
    private String typeOfMedicine;
    private int stock;
    private float price;

    public Others() {
    }

    public Others(String typeOfMedicine, int stock, float price) {
        this.typeOfMedicine = typeOfMedicine;
        this.stock = stock;
        this.price = price;
    }

    public String getTypeOfMedicine() {
        return typeOfMedicine;
    }

    public void setTypeOfMedicine(String typeOfMedicine) {
        this.typeOfMedicine = typeOfMedicine;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
    public void calculateStock(){
        
    } 
}
