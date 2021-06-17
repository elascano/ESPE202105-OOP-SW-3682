/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class Simulator {
    public static void main(String [] args){
        int chickenId;
        String name;
        String color;
        Date date = new Date();
        boolean isMolting;
        ArrayList<Chicken> chickens = new ArrayList<>();
        
        //input by keyboard
        chickenId = 1;
        name="Lucy";
        color="White";
        isMolting = true;
        
        
        Chicken chicken = new Chicken();
        System.out.println("chicken object -> " + chicken);
        
        chicken = new Chicken(chickenId, name, color, date, isMolting);
        System.out.println("chicken object -> " + chicken);
        
        Chicken chicken2 = new Chicken(2, "Pamela", "black", new Date(), false);
        System.out.println("chicken2 object -> " + chicken2);
        
        Chicken chicken3 = new Chicken(3, "Sofia", "black", new Date(), true);
        System.out.println("chicken3 object -> " + chicken3);
        
        Chicken chicken4 = new Chicken(4, "Maria", "black", new Date(), false);
        System.out.println("chicken4 object -> " + chicken4);
        
        Chicken chicken5 = new Chicken(5, "Luisa", "black", new Date(), false);
        System.out.println("chicken5 object -> " + chicken5);
        
        Chicken chicken6 = new Chicken(6, "Andrea", "black", new Date(), false);
        System.out.println("chicken6 object -> " + chicken6);
        
        Chicken chicken7 = new Chicken(7, "Emilia", "black", new Date(), false);
        System.out.println("chicken7 object -> " + chicken7);
        
        Chicken chicken8 = new Chicken(8, "Alejandra", "black", new Date(), true);
        System.out.println("chicken8 object -> " + chicken8);
        
        Chicken chicken9 = new Chicken(9, "Karina", "black", new Date(), true);
        System.out.println("chicken9 object -> " + chicken9);
       
        chickens.add(chicken);
        chickens.add(chicken2);
        chickens.add(chicken3);
        chickens.add(chicken4);
        chickens.add(chicken5);
        chickens.add(chicken6);
        chickens.add(chicken7);
        chickens.add(chicken8);
        chickens.add(chicken9);
        
        
        System.out.println("chickens -> " + chickens);
        Chicken[] chickensArray = new Chicken[10];
        chickensArray[0]= chicken;
        chickensArray[1]= chicken;
        chickensArray[2]= chicken;
        chickensArray[3]= chicken;
        chickensArray[4]= chicken;
        chickensArray[5]= chicken;
        chickensArray[6]= chicken;
        chickensArray[7]= chicken;
        chickensArray[8]= chicken;
        chickensArray[9]= chicken;
        
        System.out.println("chickensArray -> " + chickensArray[0]);
        
    }
    
}
