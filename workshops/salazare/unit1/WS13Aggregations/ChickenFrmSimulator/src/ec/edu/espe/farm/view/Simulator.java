/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class Simulator {
    
     public static void main(String[] args) {
         
         int chickenId;
         String name;
         String color;
         Date date = new Date();
         boolean isMolting;
         ArrayList<Chicken> chickens = new ArrayList<>();
         Chicken chickensArray[] = new Chicken[10];
         Period edad1 = Period.between(LocalDate.of(1999, 4, 8), LocalDate.now());
         Period edad2 = Period.between(LocalDate.of(2000, 4, 8), LocalDate.now());
         Period edad3 = Period.between(LocalDate.of(2005, 5, 11), LocalDate.now());
         Period edad4 = Period.between(LocalDate.of(2008, 9, 10), LocalDate.now());
         Period edad5 = Period.between(LocalDate.of(2012, 9, 10), LocalDate.now());
         Period edad6 = Period.between(LocalDate.of(2011, 3, 10), LocalDate.now());
         Period edad7 = Period.between(LocalDate.of(2012, 6, 10), LocalDate.now());
         Period edad8 = Period.between(LocalDate.of(2014, 5, 10), LocalDate.now());
         Period edad9 = Period.between(LocalDate.of(2015, 6, 10), LocalDate.now());
         Period edad10 = Period.between(LocalDate.of(2017, 5, 10), LocalDate.now());
         String jsonChicken;
       
         
         
         chickenId = 1;
         name="Lucy";
         color="white";
         isMolting=true;
         
         
        Chicken chiken = new Chicken();
        System.out.println("chicken object ->" + chiken);
        System.out.println(String.format("%d years, %d months y %d days",
        edad1.getYears(),
        edad1.getMonths(),
        edad1.getDays()));   

        
        chiken = new Chicken(chickenId, name, color, date, isMolting);
        System.out.println("chicken object ->" + chiken);
        
        Chicken chicken2 = new Chicken(2, "Maruja","black", new Date(),false);
        System.out.println("chicken object ->" + chicken2);
         System.out.println(String.format("Age: %d years, %d months y %d days",
        edad2.getYears(),
        edad2.getMonths(),
        edad2.getDays())); 
         
        Chicken chicken3 = new Chicken(3, "Pedro","white", new Date(),false);
        System.out.println("chicken object ->" + chicken3);
         System.out.println(String.format("Age: %d years, %d months y %d days",
        edad3.getYears(),
        edad3.getMonths(),
        edad3.getDays())); 
        
        Chicken chicken4 = new Chicken(4, "Juanita","white", new Date(),false);
        System.out.println("chicken object ->" + chicken4);
        System.out.println(String.format("Age: %d years, %d months y %d days",
        edad4.getYears(),
        edad4.getMonths(),
        edad4.getDays()));
        
         Chicken chicken5 = new Chicken(5, "Luisa","black and white", new Date(),false);
        System.out.println("chicken object ->" + chicken5);
        System.out.println(String.format("Age: %d years, %d months y %d days",
        edad5.getYears(),
        edad5.getMonths(),
        edad5.getDays()));
        
        Chicken chicken6 = new Chicken(6, "Luisa","white", new Date(),false);
        System.out.println("chicken object ->" + chicken5);
        System.out.println(String.format("Age: %d years, %d months y %d days",
        edad6.getYears(),
        edad6.getMonths(),
        edad6.getDays()));
        
        Chicken chicken7 = new Chicken(7, "Luisa","black and white", new Date(),false);
        System.out.println("chicken object ->" + chicken5);
        System.out.println(String.format("Age:%d years, %d months y %d days",
        edad7.getYears(),
        edad7.getMonths(),
        edad7.getDays()));
        
        Chicken chicken8 = new Chicken(8, "Luisa","black", new Date(),false);
        System.out.println("chicken object ->" + chicken5);
        System.out.println(String.format("Age: %d years, %d months y %d days",
        edad8.getYears(),
        edad8.getMonths(),
        edad8.getDays()));
        
        Chicken chicken9 = new Chicken(9, "Luisa","white", new Date(),false);
        System.out.println("chicken object ->" + chicken5);
        System.out.println(String.format("Age: %d years, %d months y %d days",
        edad9.getYears(),
        edad9.getMonths(),
        edad9.getDays()));
        
        Chicken chicken10 = new Chicken(10, "Luisa","black and white", new Date(),false);
        System.out.println("chicken object ->" + chicken5);
        System.out.println(String.format("Age: %d years, %d months y %d days",
        edad10.getYears(),
        edad10.getMonths(),
        edad10.getDays()));
        
        
         
        chickens.add(chiken);
        chickens.add(chicken2);
        chickens.add(chicken3);
        chickens.add(chicken4);
        chickens.add(chicken5);
        chickens.add(chicken6);
        chickens.add(chicken7);
        chickens.add(chicken8);
        chickens.add(chicken9);
        chickens.add(chicken10);
        
    
        
        ChickenCoop chickenCoop;
         chickenCoop = new ChickenCoop(1,chickens);
         System.out.println("Chicken Coop -> "+ chickenCoop);  
         chickenCoop.remove(6);
         System.out.println("Chicken Coop -> "+ chickenCoop);  
        
    }
}
