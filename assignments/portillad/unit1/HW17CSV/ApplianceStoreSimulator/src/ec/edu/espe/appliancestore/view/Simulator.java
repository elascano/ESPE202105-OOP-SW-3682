/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.view;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import ec.edu.espe.appliancestore.model.Blender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Simulator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        
        
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
        System.out.println("1-> Enter data to csv");
        System.out.println("2-> read data from CSV"); 
        selection=sc.nextInt();
        
        if (selection==1){
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
        CsvWriter csvWriter = new CsvWriter("Blender.csv");
        for (Blender blenderArray : blenders){
            String [] date = blender.getArray();
            csvWriter.writeRecord(date);
        }
        csvWriter.close();
        }else{
        if (selection==2){
        System.out.println("read data from CSV"); 
        CsvReader csvReader = new CsvReader("Blender.csv");
        csvReader.readHeaders();
        while(csvReader.readRecord()) {
                String date = csvReader.get(0);
                       
                }
        csvReader.close();
        for(Blender blenderArray : blenders) {
                System.out.println(blenderArray.getSerialnumber() + " , "
                    + blenderArray.getPrice() +" , "
                    +blenderArray.getVelocity() + "," +blenderArray.getAbility());
            }
        }  
        }      
        
        
    }

        }
        
        
						
		    
        
    
    
    
