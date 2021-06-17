/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farml.view;

import ec.edu.espe.farm.model.Chiken;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lizbeth Cajas
 */
public class Simulator {
    public static void main(String[] args) {
       
       int chikenId;
       String name;
       String color;
       Date date = new Date();
       boolean isMolting;
       ArrayList<Chiken> chikens =new ArrayList<>();
       
       Chiken chikensArray[] = new Chiken[5];
       
       
       
       
        //input by keyboard
        int ChikenId = 1;
        name = "lucy";
        color = "white";
        isMolting = true;

        Chiken chiken =new Chiken();
        System.out.println("chiken object-> "+ chiken);

       
       
        chiken = new Chiken(ChikenId, name, color, date, isMolting);
        System.out.println("chiken object-> "+ chiken);

        Chiken chiken2 = new Chiken(2, "maruja", "black", new Date(), false);
        System.out.println("chiken2 object-> "+ chiken2);
        
        chikens.add(chiken);
        chikens.add(chiken2);
        
        System.out.println("chikens ->"+chikens);
        chikensArray[0]= chiken;
        System.out.println("chikensArray ->"+ chikensArray);
        
    }
    
    
    
}
