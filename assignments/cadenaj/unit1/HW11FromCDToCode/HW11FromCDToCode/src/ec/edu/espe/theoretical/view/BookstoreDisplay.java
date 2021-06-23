/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.view;

import ec.edu.espe.theoretical.model.Product;
import java.util.ArrayList;

/**
 *
 * @author jejoc
 */
public class BookstoreDisplay {
    public static void main (String[] args){
        int productId;
        String name;
        String type;
        float price;
        float amount;
        ArrayList<Product> products = new ArrayList<>();
        Product productsArray[] = new Product[5];
        
        //Input by Keyboard
        productId=1;
        name= " Ulysses, James Joyce";
        type= "Book";
        price= 40;
        amount=10;
        
        Product product = new Product(productId, name, type, price, amount);
        System.out.println("product object -> " + product);
        
        Product product2 = new Product(2, "Casio FX-82MS", "Calculator", 7, 20);
        System.out.println("product object -> " + product2);
        
        Product product3 = new Product(3, "Hispanic-American", "Dictionary", 25, 3);
        System.out.println("product object -> " + product3);
    }
}
