/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.view;

import ec.edu.espe.store.model.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class InheritanceApplianceStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Products> allProducts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        
        Blender blender = new Blender();
     
        System.out.println("Enter the caracteristics of the blender: ");
        System.out.println("Enter the id: ");
        blender.setId(scanner.nextInt());
        System.out.println("Enter the price: ");
        blender.setPrice(scanner.nextFloat());
        scanner.skip("\n");
        System.out.println("Enter the model: ");
        blender.setModel(scanner.nextLine());
        System.out.println("Enter the size: ");
        blender.setSize(scanner.nextFloat());
        System.out.println("Enter the weight: ");
        blender.setWeight(scanner.nextFloat());
        scanner.skip("\n");
        System.out.println("Enter the material: ");
        blender.setMaterial(scanner.nextLine());
        System.out.println("Enter the velocity");
        blender.setVelocity(scanner.nextInt());
        System.out.println("Enter the ability");
        blender.setAbility(scanner.nextInt());
        
        allProducts.add(blender);
        
        Products products = new Computer(1, 824, "Asus Predator", 18.9F, 3.0F, "Metal and Plastic", 500.0F, 70F);
        
        allProducts.add(products);
        
        products = new Kitchen(1, 300, "Indurama", 42.4F, 32F, "Plastic", "White", 6);
        
        allProducts.add(products);
        
        products = new Toaster(1, 80, "Oster", 11.6F, 0.9F, "Plastic");
        
        allProducts.add(products);
        
        System.out.println("Products in Stock ---> " + allProducts);
        
        blender.buy(124);
        products.sell(32);
        products.generateprofit();
        products.toStock();
    }  
}
