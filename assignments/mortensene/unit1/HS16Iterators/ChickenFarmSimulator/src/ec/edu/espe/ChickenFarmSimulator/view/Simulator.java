/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ChickenFarmSimulator.view;


import ec.edu.espe.ChickenFarmSimulator.model.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author Eduardo Mortesen The Programers
 */
public class Simulator {
    public static void main(String [] args){
        int chickenId;
        String name;
        String color;
        Calendar now = Calendar.getInstance();
        Calendar bornOn = new GregorianCalendar();
        int Birthyear = bornOn.get(Calendar.YEAR);
        int today = now.get(Calendar.YEAR);
        int age = today - Birthyear;
        
        boolean isMolting;
        ArrayList<Chicken> chickens = new ArrayList<>();
        
       GsonBuilder gsonBuilder= new GsonBuilder();
        Gson gson= gsonBuilder.create();
        
        //jsonChicken = "{\"id\":\""+chicken.getId()+"\"}";
        //System.out.println("jsonString" + jsonChicken);
           Chicken chicken11;
        String jsonChicken = null;
        chicken11= gson.fromJson(jsonChicken, Chicken.class);
         System.out.println("choen10 name -> " + chicken11.getName());
        
        Chicken chicken = new Chicken(1, "Lucy", "black", Calendar.getInstance(),new GregorianCalendar(), false);
        
        Chicken chicken2 = new Chicken(2, "Maruja", "black",Calendar.getInstance(),new GregorianCalendar(), false);
        
        Chicken chicken3 = new Chicken(3, "Karla", "white", Calendar.getInstance(),new GregorianCalendar(), false);
        
        Chicken chicken4 = new Chicken(4, "Celia", "brown",Calendar.getInstance(),new GregorianCalendar(),true);
        
        Chicken chicken5 = new Chicken(5, "Maria", "brown",Calendar.getInstance(),new GregorianCalendar(),true);
        
        Chicken chicken6 = new Chicken(6, "Meli", "white", Calendar.getInstance(),new GregorianCalendar(),false);
   
         Chicken chicken7 = new Chicken(7, "Pau", "brown",Calendar.getInstance(),new GregorianCalendar(),false);
        
        Chicken chicken8 = new Chicken(8, "Camila", "black and white",Calendar.getInstance(),new GregorianCalendar(),true);
        
        Chicken chicken9 = new Chicken(9, "Luna", "brown and white",Calendar.getInstance(),new GregorianCalendar(),true);
    
        Chicken chicken10 = new Chicken(10, "Lisa", "brown and black",Calendar.getInstance(),new GregorianCalendar(),true);
  
        
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
        
       
        Chicken[] chickensArray = new Chicken[10];
        
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
            
        System.out.println("chickenArray->" + Chickens.toString());
            System.out.println("");
            
            System.out.println("jsonString"+jsonChicken);
    
     
        chicken2 = gson.fromJson(jsonChicken, Chicken.class);
        
        System.out.println("jsonString"+chicken2.getName());
    }
    }
    
}
