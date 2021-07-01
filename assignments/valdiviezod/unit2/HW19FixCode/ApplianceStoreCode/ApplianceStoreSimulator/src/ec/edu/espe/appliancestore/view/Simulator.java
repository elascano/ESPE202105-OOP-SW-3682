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
import ec.edu.espe.appliancestore.model.Blender;
import ec.edu.espe.appliancestore.model.CoffeeMaker;
import ec.edu.espe.appliancestore.model.Computer;
<<<<<<< HEAD
import ec.edu.espe.appliancestore.model.Microwave;
import java.io.BufferedReader;
import java.io.BufferedWriter;
=======
import ec.edu.espe.appliancestore.model.TV;
>>>>>>> 4ff8e5a91ef04626cf14f29faa4bb823768d9976
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
 * @author Diego Portilla NullPointers ESPE-DCCO
 * @author Salazar Matthew NullPointers ESPE-DCCO
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
        int select;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the system Appliance Store \n");
        System.out.println("---------------------");
        System.out.println("|Select the product |");
        System.out.println("---------------------");
        System.out.println("|1-> Blender        |");
        System.out.println("|2-> CoffeeMaker   |");
        System.out.println("|3-> Computer       |");
        System.out.println("|4 -> DVD           |");
        System.out.println("|5 -> Microwave     |");
        System.out.println("|6 -> TV            |");
        System.out.println("|7 -> Toaster       |");
        System.out.println("---------------------");
        select=sc.nextInt();
        
        switch(select){
            case 1:    
                System.out.println("---------------------");
                System.out.println("|    Blender        |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){
    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    writeCSVblender();
                }else{
                        if (selection==2){
                         readCSVblender();
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    System.out.println("------------------------|");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        writeJSONblender();
                    }else{
                        if (selection==2){
                            readJSONblender();
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
            }
        }
        break;    
        case 2:
            
                System.out.println("---------------------");
                System.out.println("|   CoffeeMaker    |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){   
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                        
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
            }  
    }
        break; 
        case(3):
              
                System.out.println("---------------------");
                System.out.println("|     Computer      |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                        
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
            }  
    }
        break; 
        case(4) :  
                System.out.println("---------------------");
                System.out.println("|       DVD         |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                        
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
                }
            }
        break; 
        case (5):
                System.out.println("---------------------");
                System.out.println("|     Microwave     |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    writeCSVmicrowave();
                }else{
                        if (selection==2){
                            readCSVmicrowave();
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        writeJSONmicrowave();
                    }else{
                        if (selection==2){
                            readJSONmicrowave();
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
                }
            }
        break; 
        case (6):
                System.out.println("---------------------");
                System.out.println("|       TV          |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                        
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
                }
            }
        break; 
        case(7):
                System.out.println("---------------------");
                System.out.println("|       Toaster     |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                        
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
                }
            }
        break;
        }
    

} 
    

    public static void readCSVblender() throws FileNotFoundException, IOException{
        try{
        ArrayList<Blender>blenders=new ArrayList<Blender>();
        System.out.println("read data from CSV"); 
        CsvReader readBlender = new CsvReader("ApplianceStore.csv");
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
    public static void writeCSVblender() throws IOException{
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
        String fileOutput = "ApplianceStore.csv"; 
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
    public static void writeJSONblender() throws IOException, Exception{
        
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
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonBlender;
        jsonBlender = gson.toJson(blender);
        
        
        gson = new GsonBuilder().setPrettyPrinting().create();
             try (Writer writer = new FileWriter("ApplianceStore.json")) {
                 writer.write(gson.toJson(blenders));
             }
    }
    public static void readJSONblender() throws Exception , ParseException {
        ArrayList<Blender>blenders=new ArrayList<Blender>();
        JSONParser parser = new JSONParser();
        try {
           
        FileReader reader = new FileReader("ApplianceStore.json");
        Object obj = parser.parse(reader);
        JSONObject jsonObj = (JSONObject)obj;
                       
            int serialnumber =(int) jsonObj.get("serialnumber");
            float price =(float) jsonObj.get("price");
            int velocity =(int) jsonObj.get("velocity");
            int ability =(int) jsonObj.get("ability");
            
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
    


    public static void readCSVtv() throws FileNotFoundException, IOException{
        try{
        ArrayList<TV>tvs=new ArrayList<TV>();
        System.out.println("read data from CSV"); 
        CsvReader readTV = new CsvReader("ApplianceStore.csv");
        readTV.readHeaders();
        while(readTV.readRecord()){
            String serialnumber = readTV.get(0);
            String price = readTV.get(1);
            String size = readTV.get(2);
            String color = readTV.get(3);
            String definition = readTV.get(4);
            String model = readTV.get(5);
            
            
            
            
        tvs.add(new TV(Integer.parseInt(serialnumber), Float.parseFloat(price), 
                        Float.parseFloat(size),(color),(definition),(model)));   
        }
        readTV.close();
        
        for(TV TVArray : tvs){
            System.out.println(TVArray.getSerialnumber()+"," +
            TVArray.getPrice() + "," + TVArray.getSize() + "," + TVArray.getColor() + ","+ 
                    TVArray.getDefinition() + "," + TVArray.getModel());   
        
        }
     
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
    }
    public static void writeCSVtv() throws IOException{
        int serialnumber;
        float price;
        float size;
        String color;
        String definition;
        String model;
        ArrayList<TV>tvs=new ArrayList<TV>();
        TV tvsArray[] = new TV[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to Json");
              
        System.out.println("Ingrese el color:");
        color=sc.nextLine();
        System.out.println("Ingrese la definition:");
        definition=sc.nextLine();
        System.out.println("Ingrese el model :");
        model=sc.nextLine();                    
        System.out.println("Ingrese el SerialNumber:");
        serialnumber=sc.nextInt();
        System.out.println("Ingrese el precio:");
        price=sc.nextFloat();
        System.out.println("Ingrese la size:");
        size=sc.nextFloat();
        
        
        
        TV tv = new TV();
        System.out.println("TV object -> " + tv);
        
        tv = new TV(serialnumber,price,size,color,definition,model);
        System.out.println("TV object -> " + tv);
                   
        tvs.add(tv);
               
        System.out.println("TV -> " + tvs + "\n");
        tvsArray[0] = tv;
        String fileOutput = "ApplianceStore.csv"; 
        boolean exists = new File(fileOutput).exists(); 
        
        
        if(exists) {
            File tvFile = new File(fileOutput);
            tvFile.delete();
        }
        
        try {
            
            CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
            
     
            outputCSV.write("Serialnumber");            
            outputCSV.write("Price");
            outputCSV.write("Size");
            outputCSV.write("Color");
            outputCSV.write("Definition");
            outputCSV.write("Model");
            
            
            outputCSV.endRecord(); 
            
            
            for(TV TVArray : tvs) {
                outputCSV.write(String.valueOf(TVArray.getSerialnumber()));
                outputCSV.write(String.valueOf(TVArray.getPrice()));
                outputCSV.write(String.valueOf(TVArray.getSize()));
                outputCSV.write(String.valueOf(TVArray.getColor()));
                outputCSV.write(String.valueOf(TVArray.getDefinition()));
                outputCSV.write(String.valueOf(TVArray.getModel()));
                              
                outputCSV.endRecord(); 
            }
            
            outputCSV.close(); 
            
        } catch(IOException e) {
            e.printStackTrace();
        }    
    
        
    }
    public static void writeJSONtv() throws IOException, Exception{
        
        int serialnumber;
        float price;
        float size;
        String color;
        String definition;
        String model;
        ArrayList<TV>tvs=new ArrayList<TV>();
        TV tvsArray[] = new TV[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to Json");
              
                            
        System.out.println("Ingrese el SerialNumber:");
        serialnumber=sc.nextInt();
        System.out.println("Ingrese el precio:");
        price=sc.nextFloat();
        System.out.println("Ingrese la size:");
        size=sc.nextFloat();
        System.out.println("Ingrese el color:");
        color=sc.nextLine();
        System.out.println("Ingrese la definition:");
        definition=sc.nextLine();
        System.out.println("Ingrese el model :");
        model=sc.nextLine();
        
        
        TV tv = new TV();
        System.out.println("TV object -> " + tv);
        
        tv = new TV(serialnumber,price,size,color,definition,model);
        System.out.println("TV object -> " + tv);
                   
        tvs.add(tv);
               
        System.out.println("TV -> " + tvs + "\n");
        tvsArray[0] = tv;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonTV;
        jsonTV = gson.toJson(tv);
        
        
        gson = new GsonBuilder().setPrettyPrinting().create();
             try (Writer writer = new FileWriter("ApplianceStore.json")) {
                 writer.write(gson.toJson(tvs));
             }
    }
    public static void readJSONtv() throws Exception , ParseException {
        ArrayList<TV>tvs=new ArrayList<TV>();
        JSONParser parser = new JSONParser();
        try {
           
        FileReader reader = new FileReader("ApplianceStore.json");
        Object obj = parser.parse(reader);
        JSONObject jsonObj = (JSONObject)obj;
             
            float size =(float) jsonObj.get("size");
            String color =(String) jsonObj.get("color");
            String definition =(String) jsonObj.get("definition");
            String model =(String) jsonObj.get("model");
            float price =(float) jsonObj.get("price");
            int serialnumber = (int) jsonObj.get("serialnumber");
            
            System.out.println( "Size: " + size);
            System.out.println(" Color: " + color);
            System.out.println( "Definition: " + definition);
            System.out.println( "Model: " + model);
            System.out.println( "Price: " + price);
            System.out.println("SerialNumber" + serialnumber);
            Iterator iterator = tvs.iterator();
            while (iterator.hasNext()) {
               System.out.println(iterator.next());
               }
        }catch (FileNotFoundException e) {
        e.printStackTrace();
        }
		
    }
    
    public static void readCSVcomputer() throws FileNotFoundException, IOException{
        try{
        ArrayList<Computer>computers=new ArrayList<Computer>();
        System.out.println("read data from CSV"); 
        CsvReader readComputer = new CsvReader("ApplianceStore.csv");
        readComputer.readHeaders();
        while(readComputer.readRecord()){
            String power = readComputer.get(0);
            String brand = readComputer.get(1);
            String price = readComputer.get(2);
            String storage = readComputer.get(3);
            String serialNumber = readComputer.get(4);
            
            
            
        computers.add(new Computer(Integer.parseInt(power), Float.parseFloat(price), 
                        Integer.parseInt(storage),Integer.parseInt(serialNumber)));   
        }
        readComputer.close();
        
        for(Computer ComputerArray : computers){
            System.out.println(ComputerArray.getPower()+"," +
            ComputerArray.getBrand() + "," + ComputerArray.getPrice() + "," +
                    ComputerArray.getStorage() + "," +
                    ComputerArray.getSerialNumber());   
        }
     
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    public static void writeCSVcomputer() throws IOException{
      int power;
      String brand;
      float price;
      int storage;
      int serialNumber;  
      ArrayList<Computer>computers=new ArrayList<Computer>();
      Computer computersArray[] = new Computer[3];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter data to csv");
      
        System.out.println("Enter the amount of RAM: ");
        power=sc.nextInt();
        System.out.println("Enter brand: ");
        brand=sc.nextLine();
        System.out.println("Enter the price: ");
        price=sc.nextInt();
        System.out.println("Enter storage capacity: ");
        storage=sc.nextInt();
        System.out.println("Enter the serialNumber: ");
        serialNumber=sc.nextInt();
        
        Computer computer = new Computer();
        System.out.println("Computer object -> " + computer);
        
        computer = new Computer(power, brand, price, storage, serialNumber);
        System.out.println("Computer object -> " + computer);
        
        computers.add(computer);
        System.out.println("Computers -> " + computers + "\n");
        
        computersArray[0] = computer;
        String fileOutput = "ApplianceStore.csv";
        boolean exists = new File(fileOutput).exists();
        
        if(exists){
            File computerFile = new File(fileOutput);
            computerFile.delete();
        }
        
        try{
          CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
          
            outputCSV.write("Power");            
            outputCSV.write("Brand");
            outputCSV.write("Price");
            outputCSV.write("Storage");
            outputCSV.write("SerialNumber");
            
            outputCSV.endRecord();
            
            for(Computer ComputerArray : computers){
                outputCSV.write(String.valueOf(ComputerArray.getPower()));
                outputCSV.write(String.valueOf(ComputerArray.getBrand()));
                outputCSV.write(String.valueOf(ComputerArray.getPrice()));
                outputCSV.write(String.valueOf(ComputerArray.getStorage()));
                outputCSV.write(String.valueOf(ComputerArray.getSerialNumber()));
                
                outputCSV.endRecord();  
            }
            outputCSV.close(); 
        } catch(IOException e){
            e.printStackTrace();
        }
    }
<<<<<<< HEAD
    
    public static void readCSVcomputer() throws FileNotFoundException, IOException{
=======

    

public static void writeCSVcoffeemaker() throws IOException{
        float size;
        int abilityt;
        String material;
        float price;
        String model;
        int serialnumber;
        
        ArrayList<CoffeeMaker>coffeemakers=new ArrayList<CoffeeMaker>();
        CoffeeMaker CoffeeMakersArray[] = new CoffeeMaker[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to csv");
                                   
        System.out.println("Enter the serial number :");
        serialnumber=sc.nextInt();
        System.out.println("Enter the model :");
        model=sc.nextLine();
        System.out.println("Enter the price :");
        price=sc.nextFloat();
        System.out.println("Enter the material :");
        material=sc.nextLine();
        System.out.println("Enter the size :");
        size = sc.nextFloat();
        System.out.println("Enter the ability :");
        ability = sc.nextFloat();
        
        CoffeeMaker coffeemaker = new CoffeeMaker();
        System.out.println("CoffeeMaker object -> " + coffeemaker);
        
        coffeemaker = new CoffeeMaker(size, ability, material, price, model, serialnumber);
        System.out.println("CoffeeMaker object -> " + coffeemaker);
                   
        coffeemakers.add(coffeemaker);
               
        System.out.println("CoffeeMaker -> " + coffeemakers + "\n");
        
        CoffeeMakersArray[0] = coffeemaker;
        String fileOutput = "ApplianceStore.csv"; 
        boolean exists = new File(fileOutput).exists(); 
        
        
        if(exists) {
            File coffeemakerFile = new File(fileOutput);
            coffeemakerFile.delete();
        }
        
<<<<<<< HEAD
        try {
            
            CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
            
     
            outputCSV.write("Serialnumber"); 
=======
>>>>>>> 4ff8e5a91ef04626cf14f29faa4bb823768d9976
        try{
          CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
          
            outputCSV.write("Ability");            
>>>>>>> b93768261956ca0aa0665faf4520ba472614dade
            outputCSV.write("Model");
            outputCSV.write("Price");
            outputCSV.write("Material");
            outputCSV.write("Size");
            outputCSV.write("ability");
            
            
            outputCSV.endRecord(); 
            
            
            for(Microwave MicrowaveArray : Microwaves) {
                outputCSV.write(String.valueOf(CoffeeMakerArray.getSerialnumber()));
                outputCSV.write(String.valueOf(CoffeeMakerArray.getModel()));
                outputCSV.write(String.valueOf(CoffeeMakerArray.getPrice()));
                outputCSV.write(String.valueOf(CoffeeMakerArray.getMaterial()));
                outputCSV.write(String.valueOf(CoffeeMakerArray.getSize()));
                outputCSV.write(String.valueOf(CoffeeMakerArray.getAbility()));
                
                              
                outputCSV.endRecord(); 
            }
            
            outputCSV.close(); 
            
        } catch(IOException e) {
            e.printStackTrace();
        }    
    }
    public static void readCSVcoffeemaker() throws FileNotFoundException, IOException{
        try{
        ArrayList<CoffeeMaker>coffeemakers=new ArrayList<CoffeeMaker>();
        System.out.println("read data from CSV"); 
        CsvReader readCoffeeMaker = new CsvReader("ApplianceStore.csv");
        readCoffeeMaker.readHeaders();
        while(readCoffeeMaker.readRecord()){
            String serialnumber = readCoffeeMaker.get(0);
            String model = readCoffeeMaker.get(1);
            String price = readCoffeeMaker.get(2);
            String material = readCoffeeMaker.get(3);
            String size = readCoffeeMaker.get(4);
            String ability = readCoffeeMaker.get(5);
            
            
        coffeemakers.add(new CoffeeMaker(Integer.parseInt(serialnumber), (model), 
                Float.parseFloat(price),(material),Float.parseFloat(size),Integer.parseInt(ability)));   
        }
        readCoffeeMaker.close();
        
        for(CoffeeMaker CoffeeMakerArray : coffeemakers){
            System.out.println(CoffeeMakerArray.getSerialnumber()+"," +
            CoffeeMakerArray.getModel()+ "," + CoffeeMakerArray.getPrice()+ "," +
                    CoffeeMakerArray.getMaterial() + "," + CoffeeMakerArray.getSize() + "," + CoffeeMakerArray.getAbility());   
        }
     
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
    }
    public static void writeJSONcoffeemaker() throws IOException, Exception{
        
        float size;
        int ability;
        String material;
        float price;
        String model;
        int serialnumber;
        ArrayList<CoffeeMaker>coffeemakers=new ArrayList<CoffeeMaker>();
        CoffeeMaker CoffeeMakersArray[] = new CoffeeMaker[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to Json");
              
                            
        System.out.println("Enter the serial number :");
        serialnumber=sc.nextInt();
        System.out.println("Enter the model :");
        model=sc.nextLine();
        System.out.println("Enter the price :");
        price=sc.nextFloat();
        System.out.println("Enter the material :");
        material=sc.nextLine();
        System.out.println("Enter the size :");
        size = sc.nextFloat();
        System.out.println("Enter the ability :");
        ability = sc.nextInt();
        
        
        CoffeeMaker coffeemaker = new CoffeeMaker();
        System.out.println("CoffeeMaker object -> " + coffeemaker);
        
        coffeemaker = new CoffeeMaker(size, ability, material, price, model, serialnumber);
        System.out.println("CoffeeMaker object -> " + coffeemaker);
                   
        coffeemakers.add(coffeemaker);
               
        System.out.println("CoffeeMakers -> " + coffeemakers + "\n");
        CoffeeMakersArray[0] = coffeemaker;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonCoffeeMaker;
        jsonCoffeeMaker = gson.toJson(coffeemaker);
        
        
        gson = new GsonBuilder().setPrettyPrinting().create();
             try (Writer writer = new FileWriter("ApplianceStore.json")) {
                 writer.write(gson.toJson(coffeemakers));
             }
    }
    public static void readJSONcoffeemaker() throws Exception , ParseException {
        ArrayList<CoffeeMaker>coffemakers=new ArrayList<CoffeeMaker>();
        JSONParser parser = new JSONParser();
        try {
           
        FileReader reader = new FileReader("ApplianceStore.json");
        Object obj = parser.parse(reader);
        JSONObject jsonObj = (JSONObject)obj;
             
            int serialnumber = (int) jsonObj.get("serialnumber");
            String model =(String) jsonObj.get("model");
            float price =(float) jsonObj.get("price");
            String material =(String) jsonObj.get("material");
            float size =(float) jsonObj.get("size");
            float ability =(int) jsonObj.get("ability");
            
            System.out.println("SerialNumber" + serialnumber);
             System.out.println( "Model: " + model);
            System.out.println( "Price: " + price);
            System.out.println( "Material: " + material);
            System.out.println( "Size: " + size);
            System.out.println( "Ability: " + ability);
            
            Iterator iterator = coffeemakers.iterator();
            while (iterator.hasNext()) {
               System.out.println(iterator.next());
               }
        }catch (FileNotFoundException e) {
        e.printStackTrace();
        }	
    }
<<<<<<< HEAD
    
    public static void writeCSVmicrowave() throws IOException{
        float size;
        float weight;
        String material;
        float price;
        String model;
        int serialnumber;
        
        ArrayList<Microwave>microwaves=new ArrayList<Microwave>();
        Microwave MicrowavesArray[] = new Microwave[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to csv");
                                   
        System.out.println("Enter the serial number :");
        serialnumber=sc.nextInt();
        System.out.println("Enter the model :");
        model=sc.nextLine();
        System.out.println("Enter the price :");
        price=sc.nextFloat();
        System.out.println("Enter the material :");
        material=sc.nextLine();
        System.out.println("Enter the size :");
        size = sc.nextFloat();
        System.out.println("Enter the weight :");
        weight = sc.nextFloat();
        
        Microwave microwave = new Microwave();
        System.out.println("Microwave object -> " + microwave);
        
        microwave = new Microwave(size, weight, material, price, model, serialnumber);
        System.out.println("Microwave object -> " + microwave);
                   
        microwaves.add(microwave);
               
        System.out.println("Microwave -> " + microwaves + "\n");
        
        MicrowavesArray[0] = microwave;
        String fileOutput = "ApplianceStore.csv"; 
        boolean exists = new File(fileOutput).exists(); 
        
        
        if(exists) {
            File microwaveFile = new File(fileOutput);
            microwaveFile.delete();
        }
        
        try {
            
            CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
            
     
            outputCSV.write("Serialnumber"); 
            outputCSV.write("Model");
            outputCSV.write("Price");
            outputCSV.write("Material");
            outputCSV.write("Size");
            outputCSV.write("Weight");
            
            
            outputCSV.endRecord(); 
            
            
            for(Microwave MicrowaveArray : Microwaves) {
                outputCSV.write(String.valueOf(MicrowaveArray.getSerialnumber()));
                outputCSV.write(String.valueOf(MicrowaveArray.getModel()));
                outputCSV.write(String.valueOf(MicrowaveArray.getPrice()));
                outputCSV.write(String.valueOf(MicrowaveArray.getMaterial()));
                outputCSV.write(String.valueOf(MicrowaveArray.getSize()));
                outputCSV.write(String.valueOf(MicrowaveArray.getWeight()));
                
                              
                outputCSV.endRecord(); 
            }
            
            outputCSV.close(); 
            
        } catch(IOException e) {
            e.printStackTrace();
        }    
    }
    public static void readCSVmicrowave() throws FileNotFoundException, IOException{
        try{
        ArrayList<Microwave>microwaves=new ArrayList<Microwave>();
        System.out.println("read data from CSV"); 
        CsvReader readMicrowave = new CsvReader("ApplianceStore.csv");
        readMicrowave.readHeaders();
        while(readMicrowave.readRecord()){
            String serialnumber = readMicrowave.get(0);
            String model = readMicrowave.get(1);
            String price = readMicrowave.get(2);
            String material = readMicrowave.get(3);
            String size = readMicrowave.get(4);
            String weight = readMicrowave.get(5);
            
            
        microwaves.add(new Microwave(Integer.parseInt(serialnumber), (model), 
                        Float.parseFloat(price),(material),Float.parseFloat(size),Float.parseFloat(weight)));   
        }
        readMicrowave.close();
        
        for(Microwave MicrowaveArray : microwaves){
            System.out.println(MicrowaveArray.getSerialnumber()+"," +
            MicrowaveArray.getModel()+ "," + MicrowaveArray.getPrice()+ "," +
                    MicrowaveArray.getMaterial() + "," + MicrowaveArray.getSize() + "," + MicrowaveArray.getWeight());   
        }
     
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
    }
    public static void writeJSONmicrowave() throws IOException, Exception{
        
        float size;
        float weight;
        String material;
        float price;
        String model;
        int serialnumber;
        ArrayList<Microwave>microwaves=new ArrayList<Microwave>();
        Microwave MicrowavesArray[] = new Microwave[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to Json");
              
                            
        System.out.println("Enter the serial number :");
        serialnumber=sc.nextInt();
        System.out.println("Enter the model :");
        model=sc.nextLine();
        System.out.println("Enter the price :");
        price=sc.nextFloat();
        System.out.println("Enter the material :");
        material=sc.nextLine();
        System.out.println("Enter the size :");
        size = sc.nextFloat();
        System.out.println("Enter the weight :");
        weight = sc.nextFloat();
        
        
        Microwave microwave = new Microwave();
        System.out.println("Microwave object -> " + microwave);
        
        microwave = new Microwave(size, weight, material, price, model, serialnumber);
        System.out.println("Microwave object -> " + microwave);
                   
        microwaves.add(microwave);
               
        System.out.println("Microwaves -> " + microwaves + "\n");
        MicrowavesArray[0] = microwave;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonMicrowave;
        jsonMicrowave = gson.toJson(microwave);
        
        
        gson = new GsonBuilder().setPrettyPrinting().create();
             try (Writer writer = new FileWriter("ApplianceStore.json")) {
                 writer.write(gson.toJson(microwaves));
             }
    }
    public static void readJSONmicrowave() throws Exception , ParseException {
        ArrayList<Microwave>microwaves=new ArrayList<Microwave>();
        JSONParser parser = new JSONParser();
        try {
           
        FileReader reader = new FileReader("ApplianceStore.json");
        Object obj = parser.parse(reader);
        JSONObject jsonObj = (JSONObject)obj;
             
            int serialnumber = (int) jsonObj.get("serialnumber");
            String model =(String) jsonObj.get("model");
            float price =(float) jsonObj.get("price");
            String material =(String) jsonObj.get("material");
            float size =(float) jsonObj.get("size");
            float weight =(float) jsonObj.get("weight");
            
            System.out.println("SerialNumber" + serialnumber);
             System.out.println( "Model: " + model);
            System.out.println( "Price: " + price);
            System.out.println( "Material: " + material);
            System.out.println( "Size: " + size);
            System.out.println( "Weight: " + weight);
            
            Iterator iterator = microwaves.iterator();
            while (iterator.hasNext()) {
               System.out.println(iterator.next());
               }
        }catch (FileNotFoundException e) {
        e.printStackTrace();
        }	
    }
    
=======


    public static void writeJSONcomputer() throws IOException, Exception{
        int power;
        String brand;
        float price;
        int storage;
        int serialNumber;
        ArrayList<Computer>computers=new ArrayList<Computer>();
        Computer computersArray[] = new Computer[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to Json");

        System.out.println("Enter the amount of RAM: ");
        power=sc.nextInt();
        System.out.println("Enter brand: ");
        brand=sc.nextLine();
        System.out.println("Enter the price: ");
        price=sc.nextInt();
        System.out.println("Enter storage capacity: ");
        storage=sc.nextInt();
        System.out.println("Enter the serialNumber: ");
        serialNumber=sc.nextInt();

        Computer computer = new Computer();
        System.out.println("Computer Object -> " + computer);
    
        computer = new Computer(power, brand, price, storage, serialNumber);
        System.out.println("Computer object -> " + computer);
        computers.add(computer);
    
        System.out.println("Computer -> " + computers + "\n");
        computersArray[0] = computer;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonComputer;
        jsonComputer = gson.toJson(computer);
    
        gson = new GsonBuilder().setPrettyPrinting().create();
             try (Writer writer = new FileWriter("ApplianceStore.json")) {
                 writer.write(gson.toJson(computers));
             }
>>>>>>> 4ff8e5a91ef04626cf14f29faa4bb823768d9976
    }
<<<<<<< HEAD

=======
    
    public static void readJSONcomputer() throws Exception , ParseException {
        ArrayList<Computer>computers=new ArrayList<Computer>();
        JSONParser parser = new JSONParser();
        try {
           
        FileReader reader = new FileReader("ApplianceStore.json");
        Object obj = parser.parse(reader);
        JSONObject jsonObj = (JSONObject)obj;
             
            int power =(int) jsonObj.get("power");
            String brand =(String) jsonObj.get("brand");
            float price =(float) jsonObj.get("price");
            String storage =(String) jsonObj.get("storage");
            int serialNumber = (int) jsonObj.get("serialNumber");
            
            System.out.println( "Power: " + power);
            System.out.println(" Brand: " + brand);
            System.out.println( "Price: " + price);
            System.out.println( "Storage: " + storage);
            System.out.println("SerialNumber" + serialNumber);
            Iterator iterator = computers.iterator();
            while (iterator.hasNext()) {
               System.out.println(iterator.next());
               }
        }catch (FileNotFoundException e) {
        e.printStackTrace();
        }
    }
    

    }




        
        
                
>>>>>>> b93768261956ca0aa0665faf4520ba472614dade

    }
        
 


 