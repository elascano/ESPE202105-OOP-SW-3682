/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Store.view;


import com.csvreader.CsvWriter;
import ec.edu.espe.Store.model.Kitchen;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class Simulator {
 
    public static void main(String[] args) throws IOException {
        
    int kitchenId;
    String color;
    float weight;
    String material;
    int knobs; 
    int selectedOption;
    CsvWriter writer;
    
    Scanner scanner = new Scanner(System.in);
    ArrayList<Kitchen> kitchenslist = new ArrayList<>();
    writer = new CsvWriter("Csvfile.csv");
    
        System.out.println("Csv Files Nicolas Suquillo \n");    
    
    do{
        System.out.println("\t\t\tAppliance Store");
        System.out.println("1.- Insert Csv");
        System.out.println("2.- Read Csv");
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
                kitchenId= scanner.nextInt();
                System.out.println("Enter the color: ");
                color= scanner.next();
                System.out.println("Enter the weight(kg): ");
                weight= scanner.nextFloat();
                System.out.println("Enter the material: ");
                material = scanner.next();
                System.out.println("Enter the knobs: ");
                knobs= scanner.nextInt();
                Kitchen kitchen  = new Kitchen();
                kitchen.setId(kitchenId);
                kitchen.setColor(color);
                kitchen.setWeight(weight);
                kitchen.setMaterial(material);
                kitchen.setKnobs(knobs);
                kitchenslist.add(kitchen);
                String[] data = kitchen.getArray();
                writer.writeRecord(data);
            break;
            case 2:
                for (int i=0;i<kitchenslist.size();i++){
                    System.out.println("Dryer " + (i+1) + kitchenslist.get(i).toString());
                }
            break;
            case 3:
            writer.close();
            break;
        }    
    }while(selectedOption!=3);  
    
}
}
