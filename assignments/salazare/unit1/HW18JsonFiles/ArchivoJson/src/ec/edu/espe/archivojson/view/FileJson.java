package ec.edu.espe.archivojson.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.csvreader.CsvReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import ec.edu.espe.archivojson.model.ElectricKitchen;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;

import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class FileJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException, Exception {
        
       
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
                         for (ElectricKitchen electrickitchenArray : electricKitchens){
                         String [] date = electricKitchen.getArray();
                         Gson gson = new GsonBuilder().setPrettyPrinting().create();
                         try(Writer writer = new FileWriter("ElectricKitchen.json")){
                             writer.write(gson.toJson(electricKitchens));
                         }
                         String json = gson.toJson(date);
                         
                         }
                        // writer.close();
        
                        break;
               case 2:
                        System.out.println("\nYou have selected option 2"); 
                        try{
       
                            JSONParser parser = new JSONParser();
                            FileReader reader = new FileReader("ElectricKitchen.json");
                            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("ElectricKitchen.json"));
                            for (Object object : jsonArray)
                             {
                              JSONObject config = (JSONObject) object;

                                String sizeP = (String) config.get("size");
                                    System.out.println(sizeP);

                                String materialP = (String) config.get("material");
                                    System.out.println(materialP);

                                 String weightP = (String) config.get("weight");
                                    System.out.println(weightP);

                                 String priceP = (String) config.get("price");
                                    System.out.println(priceP);
                                    
                                 String identificationNumberP = (String) config.get("identificationNumber");
                                    System.out.println(identificationNumberP);
                             }

                        }catch(FileNotFoundException e){
                         e.printStackTrace();   
                        }
                        break; 
                
               case 3:
                        exit = true;
                        break;
                        
               default:
                        System.out.println("Choose option 1 or 2");
                        
                        
                        
                        
            }
         }catch(IOException e) {
                 e.printStackTrace(); 
    }
        
    }
    
   
    
  }
    
}

