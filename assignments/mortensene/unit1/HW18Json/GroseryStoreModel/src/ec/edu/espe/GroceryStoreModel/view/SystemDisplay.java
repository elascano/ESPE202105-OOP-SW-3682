/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.GroceryStoreModel.view;



import com.csvreader.CsvReader;


























































































































import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import ec.edu.espe.groseryStoreModel.model.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;
/**
 *
 * @author Eduardo Mortensen The Programers
 */
public class SystemDisplay {
    
    
     public static void main(String [] args){
         
         
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!exit) {
 
            System.out.println("PRESS 1:Read on CSV");
            System.out.println("PRESS 2:Read on Json");
            System.out.println("PRESS 3: Write on CSV");
            System.out.println("PRESS 4: Write on Json");
            System.out.println("PRESS 5: EXIT");
 
            try {
 
                System.out.println("Choose one option");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("");
                        ReadCvs();
                        break;
                    case 2:
                        System.out.println("");
                        ReadJson();
                        break;
                     case 3:
                        System.out.println("");
                        WriteCsv ();
                        break;   
                    case 5:
                        System.out.println("THANK YOU FOR USING OUR STORE, HAVE A NICE DAY!!");
                        exit = true;
                        break;
                    default:
                        System.out.println("you haven´t choosed any option, please try again");
                }
            } catch (InputMismatchException e) {
                sn.next();
            }
        }
    
         
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
}
    public static void ExportCSV(List<Drinks> drinkss){
        String fileOutput = "Drinks.csv"; 
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
   
    public static void ImportCSV(){
        try{
            List<Drinks> drinks = new ArrayList<Drinks>();
            CsvReader readDrinks = new CsvReader("Drinks.csv");
            readDrinks.readHeaders();
           
            while(readDrinks.readRecord()){
                Drinks brand = drinks.get(0);
                Drinks type = drinks.get(1);
                Drinks price = drinks.get(2);
                Drinks volume= drinks.get(3);
                Drinks amountofproducts = drinks.get(4);
                
               
                drinks.add(new Drinks(brand, type,price,volume,
                        amountofproducts));//Information
               
            }
           
            readDrinks.close(); //Close
           
            for(Drinks drinkss : drinks){
                System.out.println(drinkss.getBrand() + " , " +
                        drinkss.getType() + " , " );
                       
            }
           
        }catch(FileNotFoundException e){
            e.printStackTrace();
           
        }catch(IOException e){
            e.printStackTrace();
        }
    }
     static public void ReadJson(){
    Gson gson = new Gson();
         String file = "";
 
try (BufferedReader br = new BufferedReader(new FileReader("Drinks.json"))) {
    String line;
    while ((line = br.readLine()) != null) {
        file += line;
    }
 
} catch (FileNotFoundException ex) {
    System.out.println(ex.getMessage());
} catch (IOException ex) {
    System.out.println(ex.getMessage());
    
}
    Properties properties = gson.fromJson(file, Properties.class);
    System.out.println(properties.get("brand"));
    System.out.println(properties.get("price"));
    System.out.println(properties.get("volume"));
    System.out.println(properties.get("amount of products")); 
    
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
   // Sepapar la linea leída con el separador definido previamente
   String[] campos = linea.split(SEPARADOR); 
   
   System.out.println(Arrays.toString(campos));
   
   // Volver a leer otra línea del fichero
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
public static void WriteCsv (){
 try 
          {    
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                FileWriter fw=new FileWriter("Drinks.cvs", true); 
                 System.out.println("Write the price");
                String price = br.readLine();
                System.out.println("Write the brand");
                String brand = br.readLine();
                System.out.println("Write the type");
                String type = br.readLine();
                System.out.println("Write the volume");
                 String volume = br.readLine();
                fw.write( "price:");
                fw.write( price); 
                 fw.write(System.getProperty( "line.separator" ));
                fw.write( "brand:");
                fw.write( brand); 
                 fw.write(System.getProperty( "line.separator" ));
                fw.write( "type:");
                fw.write(type );
                 fw.write(System.getProperty( "line.separator" ));
                fw.write( "volume:");
                 fw.write(volume);
                  fw.write(System.getProperty( "line.separator" ));
                fw.close();    
          }
          catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
    }    

}

  