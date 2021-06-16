/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Vinicio Guaman The Programers ESPE-DCCO
 */
public class Simulator {
    public static void main(String[]args){
        int chickenId;
        String name;
        String color;
        Date date = new Date();
        boolean isMolting;
        
        chickenId = 1;
        name="Lucy";
        color="white";
        isMolting = true;         
        
        Chicken chicken = new Chicken();
        System.out.println("chicken object -> " + chicken);
        
        chicken = new Chicken(chickenId, name, color, date, isMolting);
        System.out.println("chicken object -> " + chicken);
        
    }
}
