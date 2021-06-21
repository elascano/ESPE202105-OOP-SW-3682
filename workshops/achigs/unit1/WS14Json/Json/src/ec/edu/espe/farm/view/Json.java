/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Chicken;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class Json {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int chickenId;
        String name;
        String color;
        Date age = new Date();
        Date bornOn;
        boolean isMolting;
        String jsonChicken;
        int eggCounter;
        //ArrayList<Chicken> chickens = new ArrayList<>();
        Chicken chickensArray[] = new Chicken[5];
        
        
        //Input by Keyboard
        chickenId = 0;
        name="Lucy";
        color="white";
        age = new Date();
        isMolting = true;
        eggCounter = 0;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        
        Chicken chicken = new Chicken();
        System.out.println("chicken object ->" + chicken);
        
        chicken = new Chicken(chickenId, name, color, age, isMolting);
        System.out.println("chicken object ->" + chicken);
        
        //Chicken chicken2 = new Chicken(2, "Maruja", "black", new Date(), false);
                
        //chickens.add(chicken);
        //chickens.add(chicken2);
        //System.out.println("chickens ->" + chickens);
        
        chickensArray[0] = chicken;
        chickensArray[1] = new Chicken(2, "Maruja", "black", new Date(), false);
        //System.out.println("chickensArray -> " + chickensArray[0]);
        
        //jsonChicken = "{\"id\":\""+chicken.getId()+"\"}";
        //System.out.println("jsonString" + jsonChicken);
                
        //Serialization
        jsonChicken = gson.toJson(chicken);
        System.out.println("jsonChicken -> " + jsonChicken);
        
        Chicken chicken2;
        // Deserialization
        chicken2 = gson.fromJson(jsonChicken, Chicken.class);        
        System.out.println("chicken2 name -> " + chicken2.getName());
        //JAR -> Java Archive
        //EAR -> Enterprise Archive
        //WAR -> Web Archive
    }
}
