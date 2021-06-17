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
 * @author Gualotuña Richard INNOVA CODE
 */
public class Simulator {
    public static void main(String[] args){
        int ChickenId;
        String name;
        String color;
        Date date = new Date();
        boolean isMolting;
        ArrayList<Chicken> chicken = new ArrayList<>();
        
        //input by keyboard
        int chickenId = 1;
        name = "Lucy";
        color = "White";
        isMolting = true;
  
        Chicken chicken = new Chicken();
        System.out.println("chicken objet -> " + chicken);
        
         Chicken chicken = new ChickenId();
        System.out.println("chicken objet -> " + chicken);
    
    }
}
