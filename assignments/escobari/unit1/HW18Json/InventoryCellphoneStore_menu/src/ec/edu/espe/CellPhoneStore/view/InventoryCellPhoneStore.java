/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CellPhoneStore.view;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.CellPhoneStore.model.Cellphone;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class InventoryCellPhoneStore {
    
    public static void main(String[] args) throws IOException, ParseException, Exception{
        float price;
        float size;
        String color;
        float weight;
        String id;
        String model;
          Scanner sc = new Scanner(System.in);
          System.out.println("Welcome");
          System.out.println("");
          System.out.println("1 -> CVS");
          System.out.println("2 -> JSON");
        int selection = sc.nextInt();
 
        if (selection ==1){
            System.out.println("1 -> To register CVS");
            System.out.println("2 -> To read CVS");
            selection=sc.nextInt();
            if (selection==1){
                CVS2();
            }else{
                if (selection==2){
                    CVS();
                    
                }
            }           
        }else{
            if (selection ==2){
            System.out.println("1 -> To register Json");
            System.out.println("2 -> To read Json");
            selection=sc.nextInt();
            if (selection==1){
                JSON();   
            }else{
                if (selection==2){
                    JSON2();
                    
                }
            }
                
            }
        }    
        }
    
    public static void CVS() throws FileNotFoundException, IOException{
        try{
            ArrayList<Cellphone>cellPhones= new ArrayList<Cellphone>();
            System.out.println("read CVS");
            CsvReader readCellphone = new CsvReader ("Cellphones.cvs");
            readCellphone.readHeaders();
            while(readCellphone.readRecord()){
                String price = readCellphone.get(0);
                String size = readCellphone.get(1);
                String color = readCellphone.get(2);
                String weight = readCellphone.get(3);
                String id = readCellphone.get(4);
                String model = readCellphone.get(5);
                
                cellPhones.add(new Cellphone(id, Float.parseFloat(price), color,
                Float.parseFloat(size),model, Float.parseFloat(weight)));
                
                
            }
            readCellphone.close();
            
            for(Cellphone CellphoneArray : cellPhones){
                System.out.println(CellphoneArray.getPrice()+ "," + CellphoneArray.getSize()+ "," +
                        CellphoneArray.getColor()+ "," + CellphoneArray.getWeight()+ "," +
                        CellphoneArray.getId()+ "," + CellphoneArray.getModel());
                
            }
                    }catch(FileNotFoundException e){
                    e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void CVS2() throws IOException{
        float price;
        float size;
        String color;
        float weight;
        String id;
        String model;
        ArrayList<Cellphone> cellPhones= new ArrayList<Cellphone>();
        Cellphone cellPhonesArray[] = new Cellphone[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CVS");
        
        System.out.println("Introduce the price :");
        price= sc.nextFloat();
        System.out.println("Introduce the size :");
        size= sc.nextFloat();
        System.out.println("Introduce the color :");
        color= sc.next();
        System.out.println("Introduce the weight :");
        weight= sc.nextFloat();
        System.out.println("Introduce the id :");
        id= sc.next();
        System.out.println("Introduce the model :");
        model= sc.next();
        
        Cellphone cellPhone = new Cellphone();
        System.out.println("Cellphone Object -> " + cellPhone);
        
        cellPhone = new Cellphone(id, price, size, color, weight, model);
        System.out.println("Cellphone Object ->" + cellPhone);
        
        cellPhones.add(cellPhone);
        
        System.out.println("CellPhones -> " + cellPhones + "\n");
        
        cellPhonesArray[0]= cellPhone;
        String fileOutput = "CellPhones.cvs";
        boolean exists = new File(fileOutput).exists();
        
        if(exists){
            File cellPhoneFile= new File(fileOutput);
            cellPhoneFile.delete();
        }
        try{
            CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
            
            outputCSV.write("Price");
            outputCSV.write("Size");
            outputCSV.write("Color");
            outputCSV.write("Id");
            outputCSV.write("Weight");
            outputCSV.write("Model");
            
            outputCSV.endRecord();
            
            for(Cellphone CellphoneArray : cellPhones){
                outputCSV.write(String.valueOf(CellphoneArray.getPrice()));
                outputCSV.write(String.valueOf(CellphoneArray.getSize()));
                outputCSV.write(String.valueOf(CellphoneArray.getColor()));
                outputCSV.write(String.valueOf(CellphoneArray.getId()));
                outputCSV.write(String.valueOf(CellphoneArray.getWeight()));
                outputCSV.write(String.valueOf(CellphoneArray.getModel()));
                
                outputCSV.endRecord();
            }
            outputCSV.close();
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
       
    public static void JSON() throws IOException{
        float price;
        float size;
        String color;
        float weight;
        String id;
        String model;
        ArrayList<Cellphone>cellPhones= new ArrayList<Cellphone>();
        Cellphone cellPhonesArray[] = new Cellphone[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to JSON");
        
        System.out.println("Introduce the price :");
        price= sc.nextFloat();
        System.out.println("Introduce the size :");
        size= sc.nextFloat();
        System.out.println("Introduce the color :");
        color= sc.next();
        System.out.println("Introduce the weight :");
        weight= sc.nextFloat();
        System.out.println("Introduce the id :");
        id= sc.next();
        System.out.println("Introduce the model :");
        model= sc.next();
        
        Cellphone cellPhone= new Cellphone();
        System.out.println(" cellPhone object ->" + cellPhone);
        
        cellPhone = new Cellphone(id, price, size, color, weight, model);
        System.out.println("cellPhone object ->" + cellPhone);
        
         cellPhones.add(cellPhone);
         
         System.out.println("cellPhones ->" + cellPhones + "\n");
         
         cellPhonesArray[0]= cellPhone;
         Gson gson = new GsonBuilder().setPrettyPrinting().create();
         try(Writer writer = new FileWriter("CellPhone.json")){
             writer.write(gson.toJson(cellPhones));
         }
           
        
        
        
    }
    
    public static void JSON2() throws Exception  {
        ArrayList<Cellphone>cellPhones= new ArrayList<Cellphone>();
        JSONParser parser = new JSONParser();
        try{
            FileReader reader = new FileReader("CellPhone.json");
            Object obj = parser.parse(reader);
            JSONObject JsonObj = (JSONObject)obj;
            
            String price = (String) JsonObj.get("price");
            String size = (String) JsonObj.get("size");
            String color = (String) JsonObj.get("color");
            String weight = (String) JsonObj.get("weight");
            String id = (String) JsonObj.get("id");
            String model = (String) JsonObj.get("model");
            
            System.out.println("Price: " + price);
            System.out.println("Size: " + size);
            System.out.println("Color: " + color);
            System.out.println("Weight: " + weight);
            System.out.println("Id: " + id);
            System.out.println("Model: " + model);
            Iterator iterator = cellPhones.iterator();
            while (iterator.hasNext());
            System.out.println(iterator.next());
            
            
            
            
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        
        
        
    }


    

   
    
    
}
