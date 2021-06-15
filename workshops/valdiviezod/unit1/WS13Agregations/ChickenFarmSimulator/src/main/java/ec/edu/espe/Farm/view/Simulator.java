/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Farm.view;

import ec.edu.espe.Farm.model.Chicken;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Darwin Valdiviezo NullPunters ESPE-DCCO
 */
public class Simulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int chickenId;
        String name;
        String color;
        Date date = new Date();
        boolean isMoting;
        ArrayList<Chicken>chickens=new ArrayList<>();
        Chicken chickensArray[] = new Chicken[5];
        
        //input by keayboard
        chickenId = 1;
        name = "Lucy";
        color = "White";
        isMoting = true;
        
        Chicken chicken = new Chicken();
        System.out.println("Chicken object -> " + chicken);
        
        chicken = new Chicken(chickenId, name, color, date, isMoting);
        System.out.println("Chicken object -> " + chicken);
        
        Chicken chicken2 = new Chicken(2, "Maruja", "Black", new Date(), false);
        
        chickens.add(chicken);
        chickens.add(chicken2);
        
        System.out.println("Chickens -> " + chickens);
        
        chickensArray[0] = chicken;
        
        System.out.println("chickensArray -> " + chickensArray[0]);
        
    
    }
    
}