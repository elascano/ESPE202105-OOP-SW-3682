/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sanamed.view;

import ec.edu.espe.sanamed.model.Product;
import java.util.ArrayList;

/**
 *
 * @author Lizbeth Cajas EMCL.java ESPE-DCCO
 */
public class Sanamed {
    public static void main(String[] args) {
        String tipe;
        String brand;
        int amount;
        float price;
        boolean inStock;
        ArrayList<Product>products = new ArrayList<>();
        Product productsArray[] = new Product[3];
        
        tipe="shampoo";
        brand="Pantene";
        amount=1;
        price=6.99F;
        inStock=true;
        
        
                
       
        Product product = new Product();
       
        
        product = new Product(tipe, brand, amount, price, inStock);
        
        
        Product product2 = new Product("vitamin c", "MK", 5, 3.45F, true);
        
        Product product3 = new Product("body cream", "Nivea", 1, 3.99F, true);
        
        products.add(product);
        products.add(product2);
        products.add(product3);
        System.out.println("products ->  " +  products);
        
        
                
        productsArray[0] = product;
        productsArray[1] = product2;
        productsArray[2] = product3;
        for(int i=0;i<3;i++){
            System.out.println("productsArray -> " +  productsArray[i]);
            System.out.println("\n");
        }
            
        
    }
}
