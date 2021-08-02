/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.controller;

import com.csvreader.CsvReader;
import ec.edu.espe.appliancestore.model.Blender;
import ec.edu.espe.appliancestore.model.CoffeeMaker;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
* @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public class ReadCSV {
    public static void readBlendercsv(){
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
    public static void readCoffeeMarkercsv(){
        try{
        ArrayList<CoffeeMaker>coffeemakers=new ArrayList<CoffeeMaker>();
        System.out.println("read data from CSV"); 
        CsvReader readCoffeeMaker = new CsvReader("ApplianceStore.csv");
        readCoffeeMaker.readHeaders();
        while(readCoffeeMaker.readRecord()){
            String serialnumber = readCoffeeMaker.get(0);
            String price = readCoffeeMaker.get(1);
            String size = readCoffeeMaker.get(2);
            String ability = readCoffeeMaker.get(3);
            String material = readCoffeeMaker.get(4);
            String model = readCoffeeMaker.get(5);
            
            
            
        coffeemakers.add(new CoffeeMaker(Integer.parseInt(serialnumber),Float.parseFloat(price),Float.parseFloat(size)
                    ,Integer.parseInt(ability),(material),(model)));   
        }
        readCoffeeMaker.close();
        
        for(CoffeeMaker CoffeeMakerArray : coffeemakers){
            System.out.println(CoffeeMakerArray.getSerialnumber()+"," +
            CoffeeMakerArray.getPrice()+ "," +CoffeeMakerArray.getSize() + "," + 
                    CoffeeMakerArray.getAbility()+ "," + CoffeeMakerArray.getMaterial()+ "," 
                    +CoffeeMakerArray.getModel());   
        }
     
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void readComputercsv(){
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
            
            
            
        computers.add(new Computer(Integer.parseInt(serialNumber),Float.parseFloat(price),Integer.parseInt(storage),
                Integer.parseInt(power),(brand)));   
        }
        readComputer.close();
        
        for(Computer ComputerArray : computers){
            System.out.println(ComputerArray.getSerialnumber() + "," +
                    ComputerArray.getPrice() + "," + ComputerArray.getPower()+"," +
                    ComputerArray.getStorage() + "," + ComputerArray.getBrand());   
        }
     
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void readDvdcsv(){
        try{
        ArrayList<DVD>dvds=new ArrayList<DVD>();
        System.out.println("read data from CSV"); 
        CsvReader readDVD = new CsvReader("ApplianceStore.csv");
        readDVD.readHeaders();
        while(readDVD.readRecord()){
            String serialnumber = readDVD.get(0);
            String price = readDVD.get(1);
            String size = readDVD.get(2);
            String model = readDVD.get(3);
            
        dvds.add(new DVD(Integer.parseInt(serialnumber), Float.parseFloat(price),Float.parseFloat(size),(model)));   
        }
        readDVD.close();
        
        for(DVD DVDArray : dvds){
            System.out.println( DVDArray.getSerialnumber()+"," + DVDArray.getPrice() + "," + DVDArray.getSize() + "," + DVDArray.getModel());   
        
        }
     
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void readMicrowavecsv(){
        try{
        ArrayList<Microwave>microwaves=new ArrayList<Microwave>();
        System.out.println("read data from CSV"); 
        CsvReader readMicrowave = new CsvReader("ApplianceStore.csv");
        readMicrowave.readHeaders();
        while(readMicrowave.readRecord()){
            String serialnumber = readMicrowave.get(0);
            String price = readMicrowave.get(1);
            String size = readMicrowave.get(2);
            String weight = readMicrowave.get(3);
            String model = readMicrowave.get(4);
            String material = readMicrowave.get(5);
            
            
            microwaves.add(new Microwave(Integer.parseInt(serialnumber),Float.parseFloat(price),
                    Float.parseFloat(size),Float.parseFloat(weight),(material),(model)));
        }
        readMicrowave.close();
        
        for(Microwave MicrowaveArray : microwaves){
            System.out.println(MicrowaveArray.getSerialnumber()+"," +
            MicrowaveArray.getPrice()+ "," + MicrowaveArray.getSize() + "," + MicrowaveArray.getWeight()
                    + "," +MicrowaveArray.getModel()+ "," + MicrowaveArray.getMaterial());   
        }
     
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void readTVcsv(){
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
    public static void readToastercsv(){
        try{
        ArrayList<Toaster>toaster=new ArrayList<Toaster>();
        System.out.println("read data from CSV"); 
        CsvReader readToaster = new CsvReader("ApplianceStore.csv");
        readToaster.readHeaders();
        while(readToaster.readRecord()){
            String serialnumber = readToaster.get(0);
            String price = readToaster.get(1);
            String power = readToaster.get(2);
            String size = readToaster.get(3);
            String weight = readToaster.get(4);
            String material = readToaster.get(5);
            String model = readToaster.get(6);
            
            
            
            
        toaster.add(new Toaster(Integer.parseInt(serialnumber), Float.parseFloat(price), Integer.parseInt(power),
                        Float.parseFloat(size),Float.parseFloat(weight),(material),(model)));
        }
        readToaster.close();
        
        for(Toaster ToasterArray : toaster){
            System.out.println(ToasterArray.getSerialnumber()+"," +
            ToasterArray.getPrice() + "," + ToasterArray.getPower() + "," + 
                    ToasterArray.getSize() + "," + ToasterArray.getWeight()+ ","+ 
                    ToasterArray.getMaterial() + "," + ToasterArray.getModel());   
        
        }
     
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
