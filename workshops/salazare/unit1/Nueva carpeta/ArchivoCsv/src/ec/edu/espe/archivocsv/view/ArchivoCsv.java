/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.archivocsv.view;

import java.util.Scanner;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class ArchivoCsv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner electricKitchen = new Scanner(System.in);
         System.out.println("Enter the size"); 
        String size = electricKitchen.nextLine();
        System.out.println("Enter the material");
        String material = electricKitchen.nextLine();
        System.out.println("Enter the weight");
        float weight = electricKitchen.nextFloat();
        System.out.println("Enter the price");
        float price = electricKitchen.nextFloat();
        System.out.println("Enter the identificationNumber");
        int identificationNumber = electricKitchen.nextInt();
        
    }
    
}

