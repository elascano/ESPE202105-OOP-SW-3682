package ec.edu.espe.archivocsv.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import ec.edu.espe.archivocsv.model.ElectricKitchen;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

import java.util.Scanner;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class ArchivoCsv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
       
        Scanner sn = new Scanner(System.in);
        ArrayList<ElectricKitchen> electricKitchens = new ArrayList<ElectricKitchen>();
        ElectricKitchen electricKitchensArray[] = new ElectricKitchen[3];
        boolean exit = false;
        int opc;
        
        while(!exit){
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Salir");
            
         try{
            System.out.println("Choose an option");
                opc = sn.nextInt();  
            switch(opc){
              case 1:
                        System.out.println("\nYou have selected option 1");
                        Scanner ek = new Scanner(System.in);
                        System.out.println("Enter the size"); 
                        String size = ek.nextLine();
                        System.out.println("Enter the material");
                         String material = ek.nextLine();
                         System.out.println("Enter the weight");
                         float weight = ek.nextFloat();
                         System.out.println("Enter the price");
                         float price = ek.nextFloat();
                         System.out.println("Enter the identificationNumber");
                         int identificationNumber = ek.nextInt();
        
       
                         ElectricKitchen electricKitchen = new ElectricKitchen();
                        electricKitchen = new ElectricKitchen(price, weight,size, material, identificationNumber);
                        electricKitchens.add(electricKitchen);
        
                        electricKitchensArray[0] = electricKitchen;
                         CsvWriter csvWriter = new CsvWriter("ElectricKitchen.csv");
                         for (ElectricKitchen electrickitchenArray : electricKitchens){
                         String [] date = electricKitchen.getArray();
                         csvWriter.writeRecord(date);
                         }
                        csvWriter.close();
        
                        break;
               case 2:
                        System.out.println("\nYou have selected option 2");
                        CsvReader csvReader = new CsvReader("ElectricKitchen.csv");
                        csvReader.readHeaders();
                        while(csvReader.readRecord()){
                            String date = csvReader.get(0);
                        }
                        csvReader.close();
                        for(ElectricKitchen electricKitchenArray : electricKitchens){
                            System.out.println(electricKitchenArray.getWeight() + ',' + electricKitchenArray.getPrice() + ',' + electricKitchenArray.getIdentificationNumber() + ',' + electricKitchenArray.getMaterial() + ',' + electricKitchenArray.getSize());
                        }
                        break; 
                
               case 3:
                        exit = true;
                        break;
                        
               default:
                        System.out.println("Choose option 1 or 2");
                        
                        
                        
                        
            }
         }catch(InputMismatchException e) {
                System.out.println("Enter the number");
                sn.next();   
    }
        
    }
    
   
    
  }
    
}

