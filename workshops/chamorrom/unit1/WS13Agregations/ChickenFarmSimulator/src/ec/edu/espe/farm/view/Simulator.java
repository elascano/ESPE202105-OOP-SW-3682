/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class Simulator {
    public static void main(String[] args) {
        int chickenId;
        String name;
        String color;
        Date date = new Date();
        boolean isMolting;
        ArrayList<Chicken> chickens = new ArrayList<>();
        //imput keyboard
        chickenId=1;
        name="Lucy";
        color ="white";
        isMolting=true;
        
        Chicken chicken = new Chicken();
        System.out.println("chicken object->"+ chicken);
        chicken = new Chicken(chickenId,name,color,date,isMolting);
        System.out.println("chicken object->"+ chicken);
        
        Chicken chicken2 = new Chicken(2,"Maruja","black",new Date(),false);
        System.out.println("chicken2 object->"+ chicken2);
        
        chickens.add(chicken);
        chickens.add(chicken2);
        
        System.out.println("chickens ->"+chickens);
        Chicken chickensArray[] = new Chicken[5];
                chickensArray[0] = chicken;
        System.out.println("chickensArray->"+ chickensArray[0]);
                

        
    }
         
}
