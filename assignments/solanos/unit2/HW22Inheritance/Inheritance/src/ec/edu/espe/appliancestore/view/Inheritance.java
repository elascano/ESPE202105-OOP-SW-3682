/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.view;

import ec.edu.espe.appliancestrore.model.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class Inheritance {

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
        
        Products products = new Computer(1, 2, "Dell", 10.09F, 35.0F, "Metal", 400.0F, 60F);
        
        allProducts.add(products);
        
        allProducts.add(products);
        
        products = new Toaster(1, 60, "Taurus", 15.3F, 1.04F, "Metal");
        
        allProducts.add(products);
        
        System.out.println("Products in Stock ---> " + allProducts + "\n");
        
        blender.buy(35);
        products.sell(1);
        products.generateprofit();
        products.toStock();
    }  
}
