/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Store.view;

import com.google.gson.*;
import ec.edu.espe.Store.model.Dryer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class Simulator {
    
    public static void main(String[] args) throws IOException {
        
    int dryerId;
    String color;
    float weight;
    String material;
    int knobs; 
    int selectedOption;
    String jsonDryer;
    File fileJson; 
    FileWriter writer;
    
    Scanner scanner = new Scanner(System.in);
    ArrayList<Dryer> dryerslist = new ArrayList<>();
    GsonBuilder gsonBuilder = new GsonBuilder();
    Gson gson = gsonBuilder.create();
    fileJson = new File("Jsonfile.json");
    writer = new FileWriter(fileJson,true);
    
        System.out.println("Json Files Nicolas Suquillo \n");    
    
    do{
        System.out.println("\t\t\tAppliance Store");
        System.out.println("1.- Insert Json");
        System.out.println("2.- Read Json");
        System.out.println("3._ Exit\n");
        System.out.println("Select an option : ");
        selectedOption = scanner.nextInt();
            while(selectedOption<1 || selectedOption>3){
                System.out.println("Error, Choose a correct option : ");
                selectedOption = scanner.nextInt();
            }
        switch(selectedOption){
            case 1:
                System.out.println("Enter the id: ");
                dryerId= scanner.nextInt();
                System.out.println("Enter the color: ");
                color= scanner.next();
                System.out.println("Enter the weight(kg): ");
                weight= scanner.nextFloat();
                System.out.println("Enter the material: ");
                material = scanner.next();
                System.out.println("Enter the knobs: ");
                knobs= scanner.nextInt();
                Dryer dryer = new Dryer();
                dryer.setId(dryerId);
                dryer.setColor(color);
                dryer.setWeight(weight);
                dryer.setMaterial(material);
                dryer.setKnobs(knobs);
                dryerslist.add(dryer);
                jsonDryer = gson.toJson(dryer);
                writer.write("Dryer" + jsonDryer + "\n");
            break;
            case 2:
                writer.close();
                for (int i=0;i<dryerslist.size();i++){
                    System.out.println("Dryer " + (i+1) + dryerslist.get(i).toString());
                }
            break;
            case 3:
            writer.close();
            break;
        }    
    }while(selectedOption!=3);  
    
}
}
