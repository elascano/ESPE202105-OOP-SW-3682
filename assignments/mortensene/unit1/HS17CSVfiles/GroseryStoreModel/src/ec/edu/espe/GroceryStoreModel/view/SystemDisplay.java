/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.GroceryStoreModel.view;



import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import ec.edu.espe.groseryStoreModel.model.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/**
 *
 * @author Eduardo Mortensen The Programers
 */
public class SystemDisplay {
    
    
     public static void main(String [] args) throws IOException{
         
        
        String type;
        String brand;
        float volume;
        float price;
        int amountofproducts;
        ArrayList<Drinks> drinkss = new ArrayList<>();
        
        //input by keyboard
        type = "Soda";
        brand = "CocaCola";
        volume = 1;
        price=3;
        amountofproducts=1; 
        Drinks drinks = new Drinks();
       
        System.out.println("drinks object -> " + drinks);
        
        drinks = new Drinks(type, brand, volume, amountofproducts ,price);
        System.out.println("drinks object -> " + drinks);
        
        Drinks drinks2 = new Drinks("Juice", "Del Valle", 1, 1, 1);
        System.out.println("drinks2 object -> " + drinks2);
        
        drinkss.add(drinks);
        drinkss.add(drinks2);
        
     
        Drinks[] drinksArray = new Drinks[2];
        drinksArray[0]= drinks;
        drinksArray[1]= drinks2;
         
        for(Drinks Drinkss: drinksArray){
            
        System.out.println("drinkSArray->" + Drinkss.toString());
         
        System.out.println("");
        
        
          }  
        System.out.println("drinksArray -> " + drinksArray);
      ExportCSV (drinkss);
      ReadCvs();
}
    public static void ExportCSV(List<Drinks> drinkss){
        String fileOutput = "Drinks.cvs"; 
        boolean exists = new File(fileOutput).exists();
      
        if(exists) {
            File DrinksFile = new File(fileOutput);
            DrinksFile.delete();
        }
        try {
            CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
           
            outputCSV.write("Brand");
            outputCSV.write("Type");
            outputCSV.write("Price");
            outputCSV.write("Volume");
            outputCSV.write("amountofproducts");

           
            outputCSV.endRecord(); 
           
            for(Drinks drinks : drinkss){
                outputCSV.write(String.valueOf(drinks.getPrice()));
                outputCSV.write(String.valueOf(drinks.getVolume()));
                outputCSV.write(drinks.getBrand());
                outputCSV.write(drinks.getType());
            
             
               
                outputCSV.endRecord(); //Stop writting the file
               
            }
        
            outputCSV.close(); //Close
           
           
        } catch(IOException e) {
            e.printStackTrace();
        }
       
       
    }
   
 
    public static final String SEPARADOR = ",";
static public void ReadCvs(){

 BufferedReader bufferLectura = null;
 try {
  // Abrir el .csv en buffer de lectura
  bufferLectura = new BufferedReader(new FileReader("Drinks.cvs"));
  
  // Leer una linea del archivo
  String linea = bufferLectura.readLine();
  
  while (linea != null) {
   // Sepapar la linea le??da con el separador definido previamente
   String[] campos = linea.split(SEPARADOR); 
   
   System.out.println(Arrays.toString(campos));
   
   // Volver a leer otra l??nea del fichero
   linea = bufferLectura.readLine();
  }
 } 
 catch (IOException e) {
  e.printStackTrace();
 }
 finally {
  // Cierro el buffer de lectura
  if (bufferLectura != null) {
   try {
    bufferLectura.close();
   } 
   catch (IOException e) {
    e.printStackTrace();
   }
  }
 }
}
}
 
  