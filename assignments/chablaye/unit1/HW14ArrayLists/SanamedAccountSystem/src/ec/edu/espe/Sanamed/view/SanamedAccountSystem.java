/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Sanamed.view;

import ec.edu.espe.SanamedAccountSystem.model.Cosmetic;
import ec.edu.espe.SanamedAccountSystem.model.Medicins;
import ec.edu.espe.SanamedAccountSystem.model.Others;
import ec.edu.espe.SanamedAccountSystem.model.Product;
import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class SanamedAccountSystem {
    public static void main(String[] args) {
        
        Medicins medicine;
        Cosmetic cosmetic;
        Others other;
        int quantity;
        float individualValue;
        ArrayList<Product> products = new ArrayList<>();
        Product productsArray[] = new Product[5];
        
        Product product1 = new Product("Medicine", 2, 4.5F);
        Product product2 = new Product("Cosmetic", 1, 5.5F);
        Product product3 = new Product("Medicine", 5, 6F);
        
        products.add(product1);
        products.add(product2);
        products.add(product1);
        
        System.out.println("----- ARRAYLIST -----");
        System.out.println("Products: " +products+ "\n");
        
        productsArray[0] = product1;
        productsArray[1] = product3;
        
        System.out.println("-----  ARREGLO  -----");
        System.out.println("Product Array: " +productsArray[0]);
        System.out.println("Product Array; " +productsArray[1]);
        
    }
    
}
