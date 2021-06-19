/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class Simulator {
    
     public static void main(String[] args) {
         
         int chickenId;
         String name;
         String color;
         Calendar bornOn= new GregorianCalendar(2015,Calendar.FEBRUARY,04);
         Calendar currentDay = Calendar.getInstance();
         int yearBornOn = bornOn.get(Calendar.YEAR);
         int yearCurrentDay = currentDay.get(Calendar.YEAR);
         int age;
         boolean isMolting;
         ArrayList<Chicken> chickens = new ArrayList<>();
         Chicken chickensArray[] = new Chicken[10];
        
         
         chickenId = 1;
         name="Lucy";
         color="white";
         age = yearCurrentDay-yearBornOn;
         isMolting=true;
         
         
        Chicken chicken = new Chicken();
        System.out.println("chicken object ->" + chicken);
        
        chicken = new Chicken(chickenId, name, color, age, isMolting);
        System.out.println("chicken object ->" + chicken);
        
        Chicken chicken2 = new Chicken(2, "Maruja", "black", age,false);
        System.out.println("chicken object ->" + chicken2);
        
        Chicken chicken3 = new Chicken(3, "Ipatia", "brown", age, false);
        Chicken chicken4 = new Chicken(4, "Enrique", "white", age, true);
        Chicken chicken5 = new Chicken(5, "Clara", "white", age, true);
        Chicken chicken6 = new Chicken(6, "Yema", "yellow", age, false);
        Chicken chicken7 = new Chicken(7, "Martina", "red", age, true);
        Chicken chicken8 = new Chicken(8, "Hermenegildo", "purple", age, false);
        Chicken chicken9 = new Chicken(9, "Maradona", "white", age, false);
        Chicken chicken10 = new Chicken(10, "Kevin", "black", age, true);
        
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
        
        for(int i=0;i<10;i++){
            System.out.println("chickensArray ->" + chickensArray[i]);
        }
         
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        String jsonChicken;
        
        ChickenCoop chickenCoop = new ChickenCoop(1,chickens);
        System.out.println("ChickenCoop ->"+chickenCoop);
        chickenCoop.removeChicken(10);
        System.out.println("ChickenCoop ->"+chickenCoop); 
        jsonChicken = gson.toJson(chicken);
        
        System.out.println("jsonChicken -> " + jsonChicken);
        Chicken Chicken2;
        Chicken2 = gson.fromJson(jsonChicken,Chicken.class);
        System.out.println("Chicken2 name ->" + chicken2.getName());
        //jsonChicken = "{\"id\":\"" + chicken.getId() +"}";
        //System.out.println("jsonString" + jsonChicken);
        
        //String json;
        //json = 
    }
}