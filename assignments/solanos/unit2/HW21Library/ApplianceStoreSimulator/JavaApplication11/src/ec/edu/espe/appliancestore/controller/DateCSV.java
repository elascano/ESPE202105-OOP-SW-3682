/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.controller;

import com.csvreader.CsvWriter;
import ec.edu.espe.appliancestore.model.Blender;
import ec.edu.espe.appliancestore.model.CoffeeMaker;
import ec.edu.espe.appliancestore.model.Computer;
import ec.edu.espe.appliancestore.model.DVD;
import ec.edu.espe.appliancestore.model.Microwave;
import ec.edu.espe.appliancestore.model.TV;
import ec.edu.espe.appliancestore.model.Toaster;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class DateCSV {
    public static void writeBlenderCsv(){
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
    public static void writeCoffeeMarkerCsv(){
        float size;
        int ability;
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
        System.out.println("Enter the price :");
        price=sc.nextFloat();
        System.out.println("Enter the size :");
        size = sc.nextFloat();
        System.out.println("Enter the ability :");
        ability = sc.nextInt();
        System.out.println("Enter the model :");
        model=sc.nextLine();
        System.out.println("Enter the material :");
        material=sc.nextLine();
        
        
        CoffeeMaker coffeemaker = new CoffeeMaker();
        System.out.println("CoffeeMaker object -> " + coffeemaker);
        
        coffeemaker = new CoffeeMaker(serialnumber,price,size, ability, material, model);
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
        
        try {
            
            CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
            
     
            outputCSV.write("Serialnumber"); 
            outputCSV.write("Price");
            outputCSV.write("Size");
            outputCSV.write("ability");
            outputCSV.write("Model");
            outputCSV.write("Material");
            
            
            
            outputCSV.endRecord(); 
            
            
            for(CoffeeMaker CoffeeMakerArray : coffeemakers) {
                outputCSV.write(String.valueOf(CoffeeMakerArray.getSerialnumber()));
                outputCSV.write(String.valueOf(CoffeeMakerArray.getPrice()));
                outputCSV.write(String.valueOf(CoffeeMakerArray.getSize()));
                outputCSV.write(String.valueOf(CoffeeMakerArray.getAbility()));
                outputCSV.write(String.valueOf(CoffeeMakerArray.getModel()));
                outputCSV.write(String.valueOf(CoffeeMakerArray.getMaterial()));
                
                
                              
                outputCSV.endRecord(); 
            }
            
            outputCSV.close(); 
            
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
    public static void writeComputercsv(){
      int power;
      String brand;
      float price;
      int storage;
      int serialNumber;  
      ArrayList<Computer>computers=new ArrayList<Computer>();
      Computer computersArray[] = new Computer[3];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter data to csv");
        System.out.println("Enter the serialNumber: ");
        serialNumber=sc.nextInt();
        System.out.println("Enter the price: ");
        price=sc.nextInt();
        System.out.println("Enter storage capacity: ");
        storage=sc.nextInt();
        System.out.println("Enter the amount of RAM: ");
        power=sc.nextInt();
        System.out.println("Enter brand: ");
        brand=sc.nextLine();
        
        
        Computer computer = new Computer();
        System.out.println("Computer object -> " + computer);
        
        computer = new Computer(serialNumber,price,storage,power, brand);
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
          
            outputCSV.write("SerialNumber");
            outputCSV.write("Price");
            outputCSV.write("Storage");
            outputCSV.write("Power");            
            outputCSV.write("Brand");
            
            
            
            
            outputCSV.endRecord();
            
            for(Computer ComputerArray : computers){
                outputCSV.write(String.valueOf(ComputerArray.getSerialNumber()));
                outputCSV.write(String.valueOf(ComputerArray.getPrice()));
                outputCSV.write(String.valueOf(ComputerArray.getStorage()));
                outputCSV.write(String.valueOf(ComputerArray.getPower()));
                outputCSV.write(String.valueOf(ComputerArray.getBrand()));
                
                
                
                outputCSV.endRecord();  
            }
            outputCSV.close(); 
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void writeDvdcsv(){
        float size;
        float price;
        String model;
        int serialnumber;
        
        ArrayList<DVD>dvds=new ArrayList<DVD>();
        DVD dvdsArray[] = new DVD[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to Json");
        
        System.out.println("Ingrese el SerialNumber:");
        serialnumber=sc.nextInt();
        System.out.println("Ingrese el price:");
        price=sc.nextFloat();
        System.out.println("Ingrese la size:");
        size=sc.nextFloat();
        System.out.println("Ingrese el model :");
        model=sc.nextLine();                    
        
        
               
        DVD dvd = new DVD();
        System.out.println("DVD object -> " + dvd);
        
        dvd = new DVD(serialnumber,price,size,model);
        System.out.println("DVD object -> " + dvd);
                   
        dvds.add(dvd);
               
        System.out.println("DVD -> " + dvds + "\n");
        dvdsArray[0] = dvd;
        String fileOutput = "ApplianceStore.csv"; 
        boolean exists = new File(fileOutput).exists(); 
        
        
        if(exists) {
            File dvdFile = new File(fileOutput);
            dvdFile.delete();
        }
        
        try {
            
            CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
            
     
            outputCSV.write("Serialnumber");            
            outputCSV.write("Price");
            outputCSV.write("Size");
            outputCSV.write("Model");
            outputCSV.endRecord(); 
            
            
            for(DVD DVDArray : dvds) {
                outputCSV.write(String.valueOf(DVDArray.getSerialnumber()));
                outputCSV.write(String.valueOf(DVDArray.getPrice()));
                outputCSV.write(String.valueOf(DVDArray.getSize()));
                outputCSV.write(String.valueOf(DVDArray.getModel()));
                              
                outputCSV.endRecord(); 
            }
            
            outputCSV.close(); 
            
        } catch(IOException e) {
            e.printStackTrace();
        }    
    }
    public static void writeMicrowaveCsv(){
        int serialnumber;
        float price;
        float size;
        float weight;
        String material;
        String model;
        
        
        ArrayList<Microwave>microwaves=new ArrayList<Microwave>();
        Microwave MicrowavesArray[] = new Microwave[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to csv");
                                   
        System.out.println("Enter the serial number :");
        serialnumber=sc.nextInt();
         System.out.println("Enter the price :");
        price=sc.nextFloat();
        System.out.println("Enter the size :");
        size = sc.nextFloat();
        System.out.println("Enter the weight :");
        weight = sc.nextFloat();
        System.out.println("Enter the material :");
        material=sc.nextLine();
        System.out.println("Enter the model :");
        model=sc.nextLine();
        
        
        Microwave microwave = new Microwave();
        System.out.println("Microwave object -> " + microwave);
        
        microwave = new Microwave(serialnumber,price,size, weight, material, model);
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
            outputCSV.write("Price");
            outputCSV.write("Size");
            outputCSV.write("Weight");
            outputCSV.write("Material");
            outputCSV.write("Model");
            
            
            
            
            outputCSV.endRecord(); 
            
            
            for(Microwave MicrowaveArray : microwaves) {
                outputCSV.write(String.valueOf(MicrowaveArray.getSerialnumber()));
                outputCSV.write(String.valueOf(MicrowaveArray.getPrice()));
                outputCSV.write(String.valueOf(MicrowaveArray.getSize()));
                outputCSV.write(String.valueOf(MicrowaveArray.getWeight()));
                outputCSV.write(String.valueOf(MicrowaveArray.getMaterial()));
                outputCSV.write(String.valueOf(MicrowaveArray.getModel()));
                
                
                              
                outputCSV.endRecord(); 
            }
            
            outputCSV.close(); 
            
        } catch(IOException e) {
            e.printStackTrace();
        }    
    }
    public static void writeTVCsv(){
        int serialnumber;
        float price;
        float size;
        String color;
        String definition;
        String model;
        ArrayList<TV>tvs=new ArrayList<TV>();
        TV tvsArray[] = new TV[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to Csv");
              
        System.out.println("Enter the SerialNumber:");
        serialnumber=sc.nextInt();
        System.out.println("Enter the precio:");
        price=sc.nextFloat();
        System.out.println("Enter the size:");
        size=sc.nextFloat();
        System.out.println("Enter the color:");
        color=sc.nextLine();
        System.out.println("Enter the definition:");
        definition=sc.nextLine();
        System.out.println("Enter the model:");
        model=sc.nextLine();                    
        
        
        
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
    public static void writeToasterCsv(){
        int serialnumber;
        float price;
        int power;
        float size;
        float weight;
        String material;
        String model;
        ArrayList<Toaster>toaster=new ArrayList<Toaster>();
        Toaster toasteresArray[] = new Toaster[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to Json");
              
        System.out.println("Enter the SerialNumber:");
        serialnumber=sc.nextInt();
        System.out.println("Enter the price:");
        price=sc.nextFloat();
        System.out.println("Enter the power:");
        power=sc.nextInt();
        System.out.println("Enter the size:");
        size=sc.nextFloat();
        System.out.println("Enter the weight:");
        weight=sc.nextFloat();
        System.out.println("Enter the material:");
        material=sc.nextLine();
        System.out.println("Enter the model:");
        model=sc.nextLine();                    
        
        
        
        Toaster toasters = new Toaster();
        System.out.println("Toaster object -> " + toasters);
        
        toasters = new Toaster(serialnumber, price, power, size, weight, material, model);
        System.out.println("TV object -> " + toaster);
                   
        toaster.add(toasters);
               
        System.out.println("TV -> " + toasters + "\n");
        toasteresArray[0] = toasters;
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
            outputCSV.write("Power");
            outputCSV.write("Size");
            outputCSV.write("Weight");
            outputCSV.write("Material");
            outputCSV.write("Model");
            
            
            outputCSV.endRecord(); 
            
            
            for(Toaster ToasterArray : toaster) {
                outputCSV.write(String.valueOf(ToasterArray.getSerialnumber()));
                outputCSV.write(String.valueOf(ToasterArray.getPrice()));
                outputCSV.write(String.valueOf(ToasterArray.getPower()));
                outputCSV.write(String.valueOf(ToasterArray.getSize()));
                outputCSV.write(String.valueOf(ToasterArray.getWeight()));
                outputCSV.write(String.valueOf(ToasterArray.getMaterial()));
                outputCSV.write(String.valueOf(ToasterArray.getModel()));
                              
                outputCSV.endRecord(); 
            }
            
            outputCSV.close(); 
            
        } catch(IOException e) {
            e.printStackTrace();
        }    
    }
    
    
}
