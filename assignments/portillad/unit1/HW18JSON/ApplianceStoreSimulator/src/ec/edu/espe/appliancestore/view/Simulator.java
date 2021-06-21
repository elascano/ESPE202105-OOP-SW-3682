/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.view;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.appliancestore.model.Blender;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Simulator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, IOException, Exception  {
        
        
        int velocity;
        int ability;
        float price;
        int serialnumber;
        ArrayList<Blender>blenders=new ArrayList<>();
        Blender blendersArray[] = new Blender[3];
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
        ArrayList<Blender>blenders=new ArrayList<Blender>();
        System.out.println("read data from CSV"); 
        CsvReader readBlender = new CsvReader("Blender.csv");
        readBlender.readHeaders();
        while(readBlender.readRecord()){
            String serialnumber = readBlender.get(0);
            String price = readBlender.get(1);
            String velocity = readBlender.get(2);
            String ability = readBlender.get(3);
            
            
            
        blenders.add(new Blender(Integer.parseInt(serialnumber), Float.parseFloat(price), 
                        Integer.parseInt(velocity),Integer.parseInt(ability)));   
        }
        readBlender.close();
        
        for(Blender BlenderArray : blenders){
            System.out.println(BlenderArray.getSerialnumber()+"," +
            BlenderArray.getPrice() + "," + BlenderArray.getVelocity() + "," +
                    BlenderArray.getAbility());   
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
        ArrayList<Blender>blenders=new ArrayList<Blender>();
        Blender blendersArray[] = new Blender[3];
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
        
        Blender blender = new Blender();
        System.out.println("Blender object -> " + blender);
        
        blender = new Blender(serialnumber,price,velocity,ability);
        System.out.println("Blender object -> " + blender);
                   
        blenders.add(blender);
               
        System.out.println("Blenders -> " + blenders + "\n");
        
        blendersArray[0] = blender;
        String fileOutput = "Blender.csv"; 
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
            
            
            for(Blender BlenderArray : blenders) {
                outputCSV.write(String.valueOf(BlenderArray.getSerialnumber()));
                outputCSV.write(String.valueOf(BlenderArray.getPrice()));
                outputCSV.write(String.valueOf(BlenderArray.getVelocity()));
                outputCSV.write(String.valueOf(BlenderArray.getAbility()));
                              
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
        ArrayList<Blender>blenders=new ArrayList<Blender>();
        Blender blendersArray[] = new Blender[3];
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
        
        Blender blender = new Blender();
        System.out.println("Blender object -> " + blender);
        
        blender = new Blender(serialnumber,price,velocity,ability);
        System.out.println("Blender object -> " + blender);
                   
        blenders.add(blender);
               
        System.out.println("Blenders -> " + blenders + "\n");
        
        blendersArray[0] = blender;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
             try (Writer writer = new FileWriter("Blender.json")) {
                 writer.write(gson.toJson(blenders));
             }
    }
    public static void readJSON() throws Exception {
         ArrayList<Blender>blenders=new ArrayList<Blender>();
        JSONParser parser = new JSONParser();
        try {
           
        FileReader reader = new FileReader("Blender.json");
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
            Iterator iterator = blenders.iterator();
            while (iterator.hasNext()) {
               System.out.println(iterator.next());
               }

		} catch (FileNotFoundException e) {
		e.printStackTrace();
		
			
		}
         
    }

   
        
    }
        
                

        


    
    
    

        
        
        
						
		    
        
    
    
    
