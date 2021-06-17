/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorycellphonestore;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import ec.edu.espe.inventorycellphonestore.model.Cellphone;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class InventoryCellphoneStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float price;
        float size;
        String color;
        float weight;
        String model;
        String id;
        ArrayList<Cellphone> cellphones = new ArrayList<>();
        Cellphone cellphoneArray[] = new Cellphone[5];
        
        //Input by keyboard
        price = 320.25F;
        size = 15.5F;
        color = "Electric blue";
        weight = 188.0F;
        model = "Redmi Note 8";
        id = "12345";
        
        Cellphone cellphone = new Cellphone(model, price, size, color, weight, id);
        System.out.println("Cellphone object -> " + cellphone);
        
        Cellphone cellphone2 = new Cellphone("Redmi Note 7",260.25F, 15.8F, "Black", 190.1F, "23456");
        
        cellphones.add(cellphone);
        cellphones.add(cellphone2);
        cellphoneArray[0] = cellphone;
        
        System.out.println("cellphones -> " + cellphones);
        System.out.println("cellphoneArray -> " + cellphoneArray[0]);
        
        ExportCSV(cellphones);
        ImportCSV();
    }
    
    public static void ExportCSV(List<Cellphone> cellphones) {
        String fileOutput = "Cellphones.csv"; //Name the file
        boolean exists = new File(fileOutput).exists(); //Verify if there is a file
        
        //If there is a file named the same then it gets deleted
        if(exists) {
            File cellphonesFile = new File(fileOutput);
            cellphonesFile.delete();
        }
        
        try {
            //Creating the file
            CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
            
            //Names to the columns
            outputCSV.write("Model");            
            outputCSV.write("Price");
            outputCSV.write("Size");
            outputCSV.write("Color");
            outputCSV.write("Weight");
            outputCSV.write("Id");
            
            
            outputCSV.endRecord(); //Stop writting the file
            
            //Scan the list and then insert data to the file
            for(Cellphone cellphone : cellphones) {
                outputCSV.write(cellphone.getModel());
                outputCSV.write(String.valueOf(cellphone.getPrice()));
                outputCSV.write(String.valueOf(cellphone.getSize()));
                outputCSV.write(cellphone.getColor());
                outputCSV.write(String.valueOf(cellphone.getWeight()));
                outputCSV.write(cellphone.getId());
                
                outputCSV.endRecord(); //Stop writting the file
            }
            
            outputCSV.close(); //Close the file
            
        } catch(IOException e) {
            e.printStackTrace();
        }    
    }
    
    public static void ImportCSV() {
        try{
            List<Cellphone> cellphones = new ArrayList<Cellphone>(); //List where the data is getting save
            
            CsvReader readCellphones = new CsvReader("Cellphones.csv");
            readCellphones.readHeaders();
            
            //While there are lines, add the information to a list
            while(readCellphones.readRecord()) {
                String model = readCellphones.get(0);
                String price = readCellphones.get(1);
                String size = readCellphones.get(2);
                String color = readCellphones.get(3);
                String weight = readCellphones.get(4);
                String id = readCellphones.get(5);
                
                cellphones.add(new Cellphone(model, Float.parseFloat(price), 
                        Float.parseFloat(size), color, Float.parseFloat(weight)
                        , id)); //Add the information to the list
            }
            
            readCellphones.close(); //Close the file
            
            //Show the list on screen
            for(Cellphone cellphone : cellphones) {
                System.out.println(cellphone.getModel() + " , " + 
                        cellphone.getPrice() + " , " + 
                        cellphone.getSize() + " , " +
                        cellphone.getColor() + " , " +
                        cellphone.getWeight() + " , " +
                        cellphone.getId());
            }
            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
