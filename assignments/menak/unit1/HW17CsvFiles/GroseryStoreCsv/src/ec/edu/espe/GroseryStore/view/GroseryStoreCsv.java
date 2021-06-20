/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.GroseryStore.view;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import ec.edu.espe.GroseryStore.model.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class GroseryStoreCsv {

    public static void main(String [] args){
         
         
        String type;
        String brand;
        int amountproducts;
        float price;
        
        ArrayList<AlcoholicDrinks> alcoholicDrinkss = new ArrayList<>();
        
        //input by keyboard
        type = " WHISKY";
        brand = " JACK DANIEL`S";
        amountproducts=1; 
        price=(float) 57.90;
        AlcoholicDrinks alcoholicDrinks = new AlcoholicDrinks();
       
        System.out.println("Alcoholic drinks object -> " + alcoholicDrinks);
        
        alcoholicDrinks = new AlcoholicDrinks(type, brand, amountproducts ,price);
        System.out.println("Alcoholic drinks object -> " + alcoholicDrinks);
        
        AlcoholicDrinks alcoholicDrinks2 = new AlcoholicDrinks(" WHISKY", " JACK DANIEL`S", 1, 57);
        System.out.println("alcoholic drinks 2 object -> " + alcoholicDrinks2);
        
        alcoholicDrinkss.add(alcoholicDrinks);
        alcoholicDrinkss.add(alcoholicDrinks2);
        
        
        AlcoholicDrinks[] alcoholicDrinksArray = new AlcoholicDrinks[2];
        alcoholicDrinksArray[0]= alcoholicDrinks;
        alcoholicDrinksArray[1]= alcoholicDrinks2;
         
        for(AlcoholicDrinks AlcoholicDrinkss: alcoholicDrinksArray){
            
        System.out.println("Alcoholic drinks Array->" + AlcoholicDrinkss.toString());
         
        System.out.println("");
        
        
          }  
        System.out.println("Alcoholic drinksArray -> " + alcoholicDrinksArray);
    
}
    public static void ExportCSV(List<AlcoholicDrinks> alcoholicDrinkss){
        String fileOutput = "AlcoholicDrinks.cvs"; 
        boolean exists = new File(fileOutput).exists();
      
        if(exists) {
            File AlcoholicDrinksFile = new File(fileOutput);
            AlcoholicDrinksFile.delete();
        }
        try {
            CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
            
            outputCSV.write("Type");
            outputCSV.write("Brand");
            outputCSV.write("amountproducts");
            outputCSV.write("Price");

           
            outputCSV.endRecord(); 
           
            for(AlcoholicDrinks alcoholicDrinks : alcoholicDrinkss){
                outputCSV.write(alcoholicDrinks.getType());
                outputCSV.write(alcoholicDrinks.getBrand());
                outputCSV.write(String.valueOf(alcoholicDrinks.getPrice()));
                
            
             
               
                outputCSV.endRecord(); //Stop writting the file
               
            }
        
            outputCSV.close(); //Close
           
           
        } catch(IOException e) {
            e.printStackTrace();
        }
       
       
    }
   
    public static void ImportCSV(){
        try{
            List<AlcoholicDrinks> alcoholicDrinks = new ArrayList<AlcoholicDrinks>();
            CsvReader readAlcoholicDrinks = new CsvReader("AlcoholicDrinks.csv");
            readAlcoholicDrinks.readHeaders();
           
            while(readAlcoholicDrinks.readRecord()){
                AlcoholicDrinks type = alcoholicDrinks.get(1);
                AlcoholicDrinks brand = alcoholicDrinks.get(0);
                AlcoholicDrinks amountofproducts = alcoholicDrinks.get(4);
                AlcoholicDrinks price = alcoholicDrinks.get(2);
               
                alcoholicDrinks.add(new AlcoholicDrinks(type, brand, amountofproducts, price));//Information
               
            }
           
            readAlcoholicDrinks.close(); //Close
           
            for(AlcoholicDrinks alcoholicDrinkss : alcoholicDrinks){
                System.out.println(alcoholicDrinkss.getBrand() + " , " +
                        alcoholicDrinkss.getType() + " , " );
                       
            }
           
        }catch(FileNotFoundException e){
            e.printStackTrace();
           
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
