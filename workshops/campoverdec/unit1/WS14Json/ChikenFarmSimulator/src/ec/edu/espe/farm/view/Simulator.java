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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Carlos Campoverde EMCL.java ESPE-DCCO
 */
public class Simulator {
    public static void main(String[] args) {
        int  chickenId;
        String name;
        String color;
        Calendar bornOn= new GregorianCalendar(2018,Calendar.MARCH,25);
        Calendar currentDay = Calendar.getInstance();
        int yearBornOn = bornOn.get(Calendar.YEAR);
        int yearCurrentDay = currentDay.get(Calendar.YEAR);
        int age ;
        boolean isMolting;
        ArrayList<Chicken> chickens = new ArrayList<> (); 
        Chicken chickensArray[] = new Chicken[10];
        String jsonChicken;
        
        //input to keyboard 
        chickenId=1;
        name="Lucy";
        color="white";
        age = yearCurrentDay-yearBornOn;
        isMolting=true;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        
        Chicken  chicken = new Chicken(); 
        //System.out.println("chicken object ->" + chicken);
        
        chicken = new Chicken(chickenId, name, color, age, isMolting); 
        //System.out.println("chicken object ->" + chicken);
        
        //Chicken  chicken2 = new Chicken(2,"maruja","black", age,false); 
        //System.out.println("chicken object ->" + chicken2);
        Chicken chicken3 = new Chicken(3, "lupita", "brown", age, false);
        Chicken chicken4 = new Chicken(4, "paula", "white", age, true);
        Chicken chicken5 = new Chicken(5, "rocio", "yellow", age, true);
        Chicken chicken6 = new Chicken(6, "pancracia", "grey", age, false);
        Chicken chicken7 = new Chicken(7, "filomena", "red", age, true);
        Chicken chicken8 = new Chicken(8, "roberta", "black & white", age, true);
        Chicken chicken9 = new Chicken(9, "carmela", "orange", age, true);
        Chicken chicken10 = new Chicken(10, "nuria", "black", age, true);
        
       // jsonChicken = "{\"id\:"""+ chicken.getId() +"\"}";};
        //chickens.add(chicken);
        //chickens.add(chicken2);
        
        //System.out.println("chikens ->" + chickens);
        
        chickensArray[0] = chicken;
        //chickensArray[1] = chicken2;
        chickensArray[2] = chicken3;
        chickensArray[3] = chicken4;
        chickensArray[4] = chicken5;
        chickensArray[5] = chicken6;
        chickensArray[6] = chicken7;
        chickensArray[7] = chicken8;
        chickensArray[8] = chicken9;
        chickensArray[9] = chicken10;
        
        //for(int i=0;i<10;i++){
         //   System.out.println("chikensArray->" + chickensArray[i]);
        //}
        //jsonChicken = "{\"id\""+chicken.getId()+"\"}";
        //System.out.println("jsonString" + jsonChicken);
        
        
       //serialization 
       jsonChicken = gson.toJson(chicken);
       System.out.println("jasonChicken"+jsonChicken);
        
       Chicken chicken2;
       chicken2 = gson.fromJson(jsonChicken, Chicken.class);
       System.out.println("chicken2 -> " + chicken2.getName());
        
    }
    
}
