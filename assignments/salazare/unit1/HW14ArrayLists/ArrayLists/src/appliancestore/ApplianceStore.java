/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appliancestore;

import ec.edu.espe.appliancestore.model.ElectricKitchen;
import java.util.ArrayList;

/**
 *
 * @author Matthew Salazar
 */
public class ApplianceStore {

   
    public static void main(String[] args) {
        float price;
        float weight;
        String size;
        String material;
        int identificationNumber;
        ArrayList<ElectricKitchen> electricKitchens = new ArrayList<>();
        ElectricKitchen electricKitchensArray[] = new ElectricKitchen[5];
        
         price = 350;
         weight = 25;
         size = "Medium";
         material = "Ceramics";
         identificationNumber = 002;
         
         ElectricKitchen electricKitchen = new ElectricKitchen();
         System.out.println("electricKitchen -> " + electricKitchen);
         
         electricKitchen = new ElectricKitchen(price, weight, size, material, identificationNumber);
         System.out.println("electricKitchen -> " + electricKitchen);
         
         ElectricKitchen electricKitchen2 = new ElectricKitchen(349, 30, "Medium", "Ceramics", 003);
         System.out.println("electricKitchen -> " + electricKitchen2);
         
         electricKitchens.add(electricKitchen);
         electricKitchens.add(electricKitchen2);
         System.out.println("electricKitchens -> " + electricKitchens);
         
         electricKitchensArray[0] = electricKitchen;
         System.out.println("electricKitchensArray -> " + electricKitchensArray[0]);
    }
    
}
