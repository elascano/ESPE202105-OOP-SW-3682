/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellphonestore.cvs;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import ec.edu.espe.CellPhoneStorecvs.model.DataCable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59399
 */
public class CellPhoneStoreCvs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float priceRange;
        float size;
        String color;
        String brand;
        String model;
        String material;
        ArrayList<DataCable> dataCables = new ArrayList<>();
        DataCable dataCableArray[] = new DataCable[5];
        
        //Input by keyboard
        priceRange = 10.45F;
        size = 10.5F;
        color = "Rose Gold";
        brand = "Xiamomi";
        model = "Type C";
        material = "plastic";
        
        DataCable dataCable = new DataCable(model, priceRange, size, color, brand, material);
        System.out.println("DataCable object -> " + dataCable);
        
        DataCable dataCable2 = new DataCable("Type C",15.25F, 20.5F, "Blue", "Xiaomi", "laminate");
        
        dataCables.add(dataCable);
        dataCables.add(dataCable2);
        dataCableArray[0] = dataCable;
        
        System.out.println("dataCables -> " + dataCables);
        System.out.println("dataCableArray -> " + dataCableArray[0]);
        
        ExportCSV(dataCables);
        ImportCSV();
    }
    
    public static void ExportCSV(List<DataCable> dataCables) {
        String fileOutput = "DataCables.csv"; 
        boolean exists = new File(fileOutput).exists(); 
        
        
        if(exists) {
            File dataCablesFile = new File(fileOutput);
            dataCablesFile.delete();
        }
        
        try {
            
            CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
            
     
            outputCSV.write("Model");            
            outputCSV.write("PriceRange");
            outputCSV.write("Size");
            outputCSV.write("Color");
            outputCSV.write("Brand");
            outputCSV.write("Material");
            
            
            outputCSV.endRecord(); 
            
            
            for(DataCable dataCable : dataCables) {
                outputCSV.write(dataCable.getModel());
                outputCSV.write(String.valueOf(dataCable.getPriceRange()));
                outputCSV.write(String.valueOf(dataCable.getSize()));
                outputCSV.write(dataCable.getColor());
                outputCSV.write(dataCable.getBrand());
                outputCSV.write(dataCable.getMaterial());
                
                outputCSV.endRecord(); 
            }
            
            outputCSV.close(); 
            
        } catch(IOException e) {
            e.printStackTrace();
        }    
    }
    
    public static void ImportCSV() {
        try{
            List<DataCable> dataCables = new ArrayList<DataCable>(); 
            
            CsvReader readDataCables = new CsvReader("DataCables.csv");
            readDataCables.readHeaders();
            
           
            while(readDataCables.readRecord()) {
                String model = readDataCables.get(0);
                String priceRange = readDataCables.get(1);
                String size = readDataCables.get(2);
                String color = readDataCables.get(3);
                String brand = readDataCables.get(4);
                String material = readDataCables.get(5);
                
                dataCables.add(new DataCable(model, Float.parseFloat(priceRange), 
                        Float.parseFloat(size), color, brand
                        , material)); 
            }
            
            readDataCables.close(); 
            
           
            for(DataCable dataCable : dataCables) {
                System.out.println(dataCable.getModel() + " , " + 
                        dataCable.getPriceRange() + " , " + 
                        dataCable.getSize() + " , " +
                        dataCable.getColor() + " , " +
                        dataCable.getBrand() + " , " +
                        dataCable.getMaterial());
            }
            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }    
    
}
