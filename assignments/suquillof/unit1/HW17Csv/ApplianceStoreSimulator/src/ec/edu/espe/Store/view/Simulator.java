/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Store.view;

import com.csvreader.CsvReader;
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
 
    public static void main(String[] args) throws IOException, CsvWriter.FinalizedException, CsvReader.FinalizedException, CsvReader.CatastrophicException{
    
    int kitchenId;
    int size;
    String color;
    float weight;
    String material;
    int knobs; 
    int selectedOption;
    ArrayList<Kitchen> kitchens = new ArrayList<>();
    Kitchen kitchensArray[] = new Kitchen[2];
    
    Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t\tAppliance Store");
        System.out.println("1.- Add csv");
        System.out.println("2.- Read csv \n");
        System.out.println("Select an option : ");
        selectedOption = scanner.nextInt();
        while (selectedOption<1 || selectedOption>2){
            System.out.println("Error, choose a correct option : ");
            selectedOption = scanner.nextInt();
        }
        
    if (selectedOption == 1){
        
        System.out.println("Enter the id : ");
        kitchenId = scanner.nextInt();
        System.out.println("Enter de size(cm) : ");
        size = scanner.nextInt();
        System.out.println("Enter de color : ");
        color = scanner.next();
        System.out.println("Enter de weight : ");
        weight = scanner.nextFloat();
        System.out.println("Enter de material : ");
        material = scanner.next();
        System.out.println("Enter de Knobs : ");
        knobs = scanner.nextInt();
        
        Kitchen kitchen = new Kitchen();
        System.out.println("Kitche  object -> " + kitchen);
        
        kitchen = new Kitchen(kitchenId, size, color, weight, material, knobs);
        System.out.println("Kitchen object -> " + kitchen);
        
        kitchens.add(kitchen);
        
        System.out.println("Kitchen - > " + kitchens);
        
        kitchensArray[0]= kitchen;
        CsvWriter fileCsv = new CsvWriter("FileCsv.csv");
        
        for(int i= 0; i<2;i++){
            String data = kitchen.getArray();
            fileCsv.write(kitchen.getArray()); 
        }
        fileCsv.close();
        
    }else{
        if (selectedOption==2){ 
        CsvReader fileCsv = new CsvReader("FileCsv.csv");
        fileCsv.readHeaders();
        while(fileCsv.readRecord()) {
                String data = fileCsv.get(0);       
                }
        
        fileCsv.close();
        
        for(Kitchen kitchenArray : kitchens) {
                System.out.println(kitchenArray.getId()+ " , "
                    + kitchenArray.getSize()+" , "
                    +kitchenArray.getColor()+ "," +kitchenArray.getWeight() + 
                        "," +kitchenArray.getMaterial() + "," + kitchenArray.getKnobs());
            }
        }  
        } 
    }
}
