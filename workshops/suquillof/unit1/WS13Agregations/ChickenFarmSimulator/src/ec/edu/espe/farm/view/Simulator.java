/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class Simulator {
    
     public static void main(String[] args) {
         
         int chickenId;
         String name;
         String color;
         Date date = new Date();
         boolean isMolting;
         ArrayList<Chicken> chickens = new ArrayList<>();
         Chicken chickensArray[] = new Chicken[5];
         
         chickenId = 1;
         name="Lucy";
         color="white";
         isMolting=true;
         
         
        Chicken chicken = new Chicken();
        System.out.println("chicken object ->" + chicken);
        
        chicken = new Chicken(chickenId, name, color, date, isMolting);
        System.out.println("chicken object ->" + chicken);
        
        Chicken chicken2 = new Chicken(2, "Maruja","black", new Date(),false);
        System.out.println("chicken object ->" + chicken2);
        
        chickens.add(chicken);
        chickens.add(chicken2);
        
        System.out.println("chickens ->" + chickens);
        
        chickensArray[0] = chicken;
        System.out.println("chickensArray ->" + chickensArray[0]);
        
    }
}