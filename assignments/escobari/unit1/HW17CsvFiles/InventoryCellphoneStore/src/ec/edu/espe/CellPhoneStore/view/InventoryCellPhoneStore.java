/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CellPhoneStore.view;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import ec.edu.espe.CellPhoneStore.model.Cellphone;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class InventoryCellPhoneStore {
    
    public static void main(String[] args){
        float price;
        float size;
        String color;
        float weight;
        String id;
        String model;
        
        ArrayList<Cellphone> cellPhones = new ArrayList<>();
        Cellphone cellPhoneArray[] = new Cellphone[10];
        
        //Input by keyboard
        id= "20";
        price= 670.40F;
        size = 6.1F;
        color = "Black";
        weight= 163F;
        model= "Samsung S20";
        
        Cellphone cellPhone = new Cellphone(id, price, size, color, weight, model);
        System.out.println("cellPhone object ->" + cellPhone);
        
        Cellphone cellPhone2 = new Cellphone("11", 810.50F , 6.1F , "white", 194F, "Iphone 11");
        System.out.println("cellPhone2 object ->" + cellPhone2);
        
        cellPhones.add(cellPhone);
        cellPhones.add(cellPhone2);
        cellPhoneArray[0]= cellPhone;
        
        System.out.println("cellPhones -> " + cellPhones);
        System.out.println("cellPhoneArray -> " +cellPhoneArray[0]);
        
        ExportCSV(cellPhones);
        ImportCSV();
        
    }
    public static void ExportCSV(List<Cellphone> cellPhones){
        String fileOutput = "Cellphones.cvs"; // Name file
        boolean exists = new File(fileOutput).exists();
        
        // There is the name
        if(exists) {
            File cellPhonesFile = new File(fileOutput);
            cellPhonesFile.delete();
        }
        try {
            CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
            
            outputCSV.write("Price");
            outputCSV.write("Size");
            outputCSV.write("Color");
            outputCSV.write("Weight");
            outputCSV.write("Id");
            outputCSV.write("Model");
            
            outputCSV.endRecord(); // Stop writting the file
            
            for(Cellphone cellPhone : cellPhones){
                outputCSV.write(String.valueOf(cellPhone.getPrice()));
                outputCSV.write(String.valueOf(cellPhone.getSize()));
                outputCSV.write(cellPhone.getColor());
                outputCSV.write(String.valueOf(cellPhone.getWeight()));
                outputCSV.write(cellPhone.getId());
                outputCSV.write(cellPhone.getModel());
                
                outputCSV.endRecord(); //Stop writting the file
                
            }
            
            outputCSV.close(); //Close
            
            
        } catch(IOException e) {
            e.printStackTrace();
        }
        
        
    }
    
    public static void ImportCSV(){
        try{
            List<Cellphone> cellPhones = new ArrayList<Cellphone>();
            CsvReader readCellphones = new CsvReader("Cellphones.csv");
            readCellphones.readHeaders();
            
            while(readCellphones.readRecord()){
                String price = readCellphones.get(0);
                String size = readCellphones.get(1);
                String color = readCellphones.get(2);
                String weight = readCellphones.get(3);
                String id = readCellphones.get(4);
                String model = readCellphones.get(5);
                
                cellPhones.add(new Cellphone(id, Float.parseFloat(price), Float.parseFloat(size), 
                        color, Float.parseFloat(weight),model));//Information
                
            }
            
            readCellphones.close(); //Close
            
            for(Cellphone cellPhone : cellPhones){
                System.out.println(cellPhone.getModel() + " , " +
                        cellPhone.getPrice() + " , " +
                        cellPhone.getSize() + " , " +
                        cellPhone.getColor() + " , " +
                        cellPhone.getWeight() + " , " +
                        cellPhone.getId());
                        
            }
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
            
        }catch(IOException e){
            e.printStackTrace();
        } 
    }


    

   
    
    
}
