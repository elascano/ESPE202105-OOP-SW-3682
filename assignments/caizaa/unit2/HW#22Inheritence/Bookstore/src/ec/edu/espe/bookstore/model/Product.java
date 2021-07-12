/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public abstract class Product {
    private float price;
    
            
    public abstract void buy(float price);

    @Override
    public String toString() {
        return "Product{" + "price=" + price + '}';
    }
    
}