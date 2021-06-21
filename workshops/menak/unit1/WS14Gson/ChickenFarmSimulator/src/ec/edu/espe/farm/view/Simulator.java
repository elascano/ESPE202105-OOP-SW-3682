/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;





/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class Simulator {
    public static void main(String[] args) {
        
        int chickenId;
        String name;
        String color;
        
        boolean isMolting; 
        ArrayList<Chicken> chickens = new ArrayList<>();
        Chicken chickensArray[] = new Chicken[10];
        
        Calendar bornOn=new GregorianCalendar(2015,01,01);
        Calendar currentDate = Calendar.getInstance();
        int yearBornon=bornOn.get(Calendar.YEAR);
        int yearCurrent=currentDate.get(Calendar.YEAR);
        int age;
        
        
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonChicken;
        
        
        //input by keayboard
        chickenId = 1;
        name = "Lucy";
        color = "White";
        isMolting = true;
        age = yearCurrent - yearBornon;
        
        Chicken chicken = new Chicken();
        System.out.println("Chicken object -> " + chicken);
        
        chicken = new Chicken(chickenId, name, color, age, isMolting);
        System.out.println("Chicken object -> " + chicken);
        
        Chicken chicken2 = new Chicken(2, "Bryan", "Berown", age, false);
        Chicken chicken3 = new Chicken(3, "Sebastian", "Brown", age , true);
        Chicken chicken4 = new Chicken(4, "Paul", "White", age , false);
        Chicken chicken5 = new Chicken(5, "Axel", "Yellow", age , true);
        Chicken chicken6 = new Chicken(6, "Kevin", "Brown", age , false);
        Chicken chicken7 = new Chicken(7, "Daniela", "White", age , true);
        Chicken chicken8 = new Chicken(8, "Camila", "Brown", age , false);
        Chicken chicken9 = new Chicken(9, "Jennifer", "White", age , true);
        Chicken chicken10 = new Chicken(10, "Becky", "Yellow", age , false);
        
        chickens.add(chicken);
        chickens.add(chicken2);
        chickens.add(chicken3);
        chickens.add(chicken4);
        chickens.add(chicken5);
        chickens.add(chicken6);
        chickens.add(chicken7);
        chickens.add(chicken8);
        chickens.add(chicken9);
        chickens.add(chicken10);
        
        chickensArray[0] = chicken;
        chickensArray[1] = chicken2;
        chickensArray[2] = chicken3;
        chickensArray[3] = chicken4;
        chickensArray[4] = chicken5;
        chickensArray[5] = chicken6;
        chickensArray[6] = chicken7;
        chickensArray[7] = chicken8;
        chickensArray[8] = chicken9;
        chickensArray[9] = chicken10;
        
        for(Chicken Chickens:chickensArray){
            System.out.println("chickensArray -> " + Chickens.toString());
        }
        
        
        /*
        jsonChicken = "{\"id\""+chicken.getId()+"\"}";
        System.out.println("");
        System.out.println("");
        System.out.println("jsonString" + jsonChicken);
        */
        
        
                
        jsonChicken = gson.toJson(chicken);
        System.out.println("jsonChicken -> " + jsonChicken);
        
        Chicken Chicken2;
        chicken2 = gson.fromJson(jsonChicken,Chicken.class);
        System.out.println("Chicken2 name ->" + chicken2.getName());
        
        
                 
    }
}
