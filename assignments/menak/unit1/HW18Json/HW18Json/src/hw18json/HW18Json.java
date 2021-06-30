/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18json;


import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import ec.edu.espe.GroseryStore.model.AlcoholicDrinks;
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
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class HW18Json {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int opcion; 
 
        while (!exit) {
 
            System.out.println("1. Read on CSV");
            System.out.println("2. Read on Json");
            System.out.println("3. Write on CSV");
            System.out.println("4. Write on Json");
            System.out.println("5. Exit");
 
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
                        
                    case 4:
                        System.out.println("");
                        WriteJson();
                        break;       
                    case 5:
                        System.out.println("Thank you so much");
                        exit = true;
                        break;
                    default:
                        System.out.println("wrong option");
                }
            } catch (InputMismatchException e) {
                sn.next();
            }
        }
    
        String type;
        String brand;
        int amountproducts;
        float price; 
        
        ArrayList<AlcoholicDrinks> alcoholicDrinkss = new ArrayList<>();
        
        //input by keyboard
        type = " WHISKY";
        brand = " JACK DANIEL`S";
        amountproducts=1;     
        price= 57;
        
        AlcoholicDrinks alcoholicDrinks = new AlcoholicDrinks();
       
        System.out.println("Alcoholic Drinks object -> " + alcoholicDrinks);
        
        alcoholicDrinks = new AlcoholicDrinks(type, brand, amountproducts ,price);
        System.out.println("Alcoholic Drinks object -> " + alcoholicDrinks);
        
        AlcoholicDrinks alcoholicDrinks2 = new AlcoholicDrinks("WHISKY", "JACK DANIEL`S", 1, 57);
        System.out.println("Alcoholic drinks2 object -> " + alcoholicDrinks2);
        
        alcoholicDrinkss.add(alcoholicDrinks);
        alcoholicDrinkss.add(alcoholicDrinks2);
        
     
        AlcoholicDrinks[] alcoholicDrinksArray = new AlcoholicDrinks[2];
        alcoholicDrinksArray[0]= alcoholicDrinks;
        alcoholicDrinksArray[1]= alcoholicDrinks2;
         
        
        for(AlcoholicDrinks alcoholicDrinkss: alcoholicDrinksArray){
            
            System.out.println("alcoholicDrinkArray->" + alcoholicDrinkss.toString());
         
            System.out.println("");
        }
            
        
        
        
        System.out.println("alcoholicdrinksArray -> " + alcoholicDrinksArray);
        
    ExportCSV (alcoholicDrinkss);
}
    public static void ExportCSV(List<AlcoholicDrinks> alcoholicDrinkss){
        String fileOutput = "AlcoholicDrinks.csv"; 
        boolean exists = new File(fileOutput).exists();
      
        if(exists) {
            File AlcoholicDrinksFile = new File(fileOutput);
            AlcoholicDrinksFile.delete();
        }
        try {
            CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
           
            outputCSV.write("Type");
            outputCSV.write("Brand");
            outputCSV.write("amountofproducts");
            outputCSV.write("Price");


           
            outputCSV.endRecord(); 
           
            for(AlcoholicDrinks alcoholicDrinks : alcoholicDrinkss){
                outputCSV.write(String.valueOf(alcoholicDrinks.getPrice()));
                outputCSV.write(alcoholicDrinks.getBrand());
                outputCSV.write(alcoholicDrinks.getType());
            
             
               
                outputCSV.endRecord(); 
               
            }
        
            outputCSV.close(); 
           
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
                AlcoholicDrinks amountofproducts = alcoholicDrinks.get(3);
                AlcoholicDrinks price = alcoholicDrinks.get(2);                
               
                
                alcoholicDrinks.add(new AlcoholicDrinks(type,brand, amountofproducts, price));     
               
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
     static public void ReadJson(){
    Gson gson = new Gson();
         String file = "";
 
try (BufferedReader br = new BufferedReader(new FileReader("AlcoholicDrinks.json"))) {
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
    System.out.println(properties.get("Type"));
    System.out.println(properties.get("brand"));
    System.out.println(properties.get("amount of products")); 
    System.out.println(properties.get("price"));
    }
public static final String SEPARADOR = ",";
static public void ReadCvs(){

 BufferedReader bufferLectura = null;
 try {
 
  bufferLectura = new BufferedReader(new FileReader("AlcoholicDrinks.cvs"));
  

  String linea = bufferLectura.readLine();
  
  while (linea != null) {
  
   String[] campos = linea.split(SEPARADOR); 
   
   System.out.println(Arrays.toString(campos));
   

   linea = bufferLectura.readLine();
  }
 } 
 catch (IOException e) {
  e.printStackTrace();
 }
 finally {
  
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
                FileWriter fw=new FileWriter("AlcoholicDrinks.cvs", true); 
                
                System.out.println("Write the type");
                String type = br.readLine(); 
                System.out.println("Write the brand");
                String brand = br.readLine();
                System.out.println("Write the price");
                String price = br.readLine();
                
                
                fw.write( "type:");
                fw.write(type );
                fw.write(System.getProperty( "line.separator" ));
                fw.write( "brand:");
                fw.write( brand); 
                fw.write(System.getProperty( "line.separator" ));
                fw.write( "price:");
                fw.write( price); 
          
                fw.close();    
          }
          catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
        
    }

    private static void WriteJson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
