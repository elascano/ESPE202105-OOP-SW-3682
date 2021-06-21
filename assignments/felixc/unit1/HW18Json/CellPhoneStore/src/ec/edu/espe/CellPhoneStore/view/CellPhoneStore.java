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
import ec.edu.espe.CellPhoneStore.model.CellPhone;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Iterator;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author 59399
 */
public class CellPhoneStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, Exception {
        
        String color;
        String brand;
        float price;
        int id;
        String model;
        ArrayList<CellPhone>cellPhones=new ArrayList<>();
        CellPhone cellPhonesArray[] = new CellPhone[3];
        int selection;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the system Appliance Store \n");
        System.out.println("");        
        System.out.println("1-> data CSV");
        System.out.println("2-> data JSON");
        selection=sc.nextInt();
        
        if (selection==1){
            System.out.println("1-> Enter data to csv");
            System.out.println("2-> read data from CSV"); 
            selection=sc.nextInt();
            if (selection==1){
            writeCSV();
            }else{
            if (selection==2){
            readCSV();
            }  
            }      
        }else{
        if (selection ==2){
        System.out.println("1-> Enter data to Json ");
        System.out.println("2-> read data from Json"); 
        selection=sc.nextInt();
            if (selection==1){
                writeJSON();
                }else{
            if (selection==2){
                readJSON();
            }
            }
    }
        }
    }

    public static void readCSV() throws FileNotFoundException, IOException{
        try{
        ArrayList<CellPhone>cellPhones=new ArrayList<CellPhone>();
        System.out.println("read data from CSV"); 
        CsvReader readCellPhone = new CsvReader("CellPhone.csv");
        readCellPhone.readHeaders();
        while(readCellPhone.readRecord()){
            String serialnumber = readCellPhone.get(0);
            String price = readCellPhone.get(1);
            String velocity = readCellPhone.get(2);
            String ability = readCellPhone.get(3);
            
            
            
        cellPhones.add(new CellPhone(Integer.parseInt(serialnumber), Float.parseFloat(price), 
                        Integer.parseInt(velocity),Integer.parseInt(ability)));   
        }
        readCellPhone.close();
        
        for(CellPhone CellPhoneArray : cellPhones){
            System.out.println(CellPhoneArray.getSerialnumber()+"," +
            CellPhoneArray.getPrice() + "," + CellPhoneArray.getVelocity() + "," +
                    CellPhoneArray.getAbility());   
        }
     
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
    }
    public static void writeCSV() throws IOException{
        int velocity;
        int ability;
        float price;
        int serialnumber;
        ArrayList<CellPhone>cellPhones=new ArrayList<CellPhone>();
        CellPhone cellPhonesArray[] = new CellPhone[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to csv");
                                   
        System.out.println("Ingrese el numero de serie :");
        serialnumber=sc.nextInt();
        System.out.println("Ingrese el precio :");
        price=sc.nextFloat();
        System.out.println("Ingrese las velocidades :");
        velocity=sc.nextInt();
        System.out.println("Ingrese las capacidad :");
        ability=sc.nextInt();
        
        CellPhone cellPhone = new CellPhone();
        System.out.println("CellPhone object -> " + cellPhone);
        
        cellPhone = new CellPhone(serialnumber,price,velocity,ability);
        System.out.println("CellPhone object -> " + cellPhone);
                   
        cellPhones.add(cellPhone);
               
        System.out.println("CellPhone -> " + cellPhones + "\n");
        
        cellPhonesArray[0] = cellPhone;
        String fileOutput = "CellPhone.csv"; 
        boolean exists = new File(fileOutput).exists(); 
        
        
        if(exists) {
            File blenderFile = new File(fileOutput);
            blenderFile.delete();
        }
        
        try {
            
            CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
            
     
            outputCSV.write("Serialnumber");            
            outputCSV.write("Price");
            outputCSV.write("Velocity");
            outputCSV.write("Ability");
            
            
            outputCSV.endRecord(); 
            
            
            for(CellPhone CellPhoneArray : cellPhones) {
                outputCSV.write(String.valueOf(CellPhoneArray.getSerialnumber()));
                outputCSV.write(String.valueOf(CellPhoneArray.getPrice()));
                outputCSV.write(String.valueOf(CellPhoneArray.getVelocity()));
                outputCSV.write(String.valueOf(CellPhoneArray.getAbility()));
                              
                outputCSV.endRecord(); 
            }
            
            outputCSV.close(); 
            
        } catch(IOException e) {
            e.printStackTrace();
        }    
    
        
    }
    public static void writeJSON() throws IOException{
        
        int velocity;
        int ability;
        float price;
        int serialnumber;
        ArrayList<CellPhone>cellPhones=new ArrayList<CellPhone>();
        CellPhone cellPhonesArray[] = new CellPhone[3];
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to Json");
              
                            
        System.out.println("Ingrese el numero de serie :");
        serialnumber=sc.nextInt();
        System.out.println("Ingrese el precio :");
        price=sc.nextFloat();
        System.out.println("Ingrese las velocidades :");
        velocity=sc.nextInt();
        System.out.println("Ingrese las capacidad :");
        ability=sc.nextInt();
        
        CellPhone cellPhone = new CellPhone();
        System.out.println("Blender object -> " + cellPhone);
        
        cellPhone = new CellPhone(serialnumber,price,velocity,ability);
        System.out.println("CellPhone object -> " + cellPhone);
                   
        cellPhones.add(cellPhone);
               
        System.out.println("CellPhones -> " + cellPhones + "\n");
        
        cellPhonesArray[0] = cellPhone;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
             try (Writer writer = new FileWriter("CellPhone.json")) {
                 writer.write(gson.toJson(cellPhones));
             }
    }
    public static void readJSON() throws Exception {
         ArrayList<CellPhone>cellPhones=new ArrayList<CellPhone>();
        JSONParser parser = new JSONParser();
        try {
           
        FileReader reader = new FileReader("CellPhone.json");
        Object obj = parser.parse(reader);
        JSONObject JsonObj = (JSONObject)obj;
                       
            String serialnumber =(String) JsonObj.get("serialnumber");
            String price =(String) JsonObj.get("price");
            String velocity =(String) JsonObj.get("velocity");
            String ability =(String) JsonObj.get("ability");
            
            System.out.println( "SerialNumber: " + serialnumber);
            System.out.println( "Price: " + price);
            System.out.println( "Velocity: " + velocity);
            System.out.println( "Ability: " + ability); 
            Iterator iterator = cellPhones.iterator();
            while (iterator.hasNext()) {
               System.out.println(iterator.next());
               }

		} catch (FileNotFoundException e) {
		e.printStackTrace();
		
			
		}
         
    }

   
        
    }
        
        
    
    

