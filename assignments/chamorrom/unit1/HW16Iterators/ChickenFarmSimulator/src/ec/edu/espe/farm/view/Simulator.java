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
       // System.out.println("chicken object->"+ chicken);
        chicken = new Chicken(chickenId,name,color,"07/04/2011",isMolting);
        System.out.println("chicken object->"+ chicken);
        
        Chicken chicken2 = new Chicken(2,"Maruja","black","07/07/2001",false);
        Chicken chicken3 = new Chicken(3,"Perlita","white and Brown","02/11/2005",false);
        Chicken chicken4 = new Chicken(4,"Karen","Brown","26/06/2000",false);
        Chicken chicken5 = new Chicken(5,"Turuleca","White","20/09/2013",false);
        Chicken chicken6 = new Chicken(6,"Marta","yellow","28/03/2010",false);
        Chicken chicken7 = new Chicken(7,"Perlita","white and Brown","02/11/2005",false);
        
       // System.out.println("chicken2 object->"+ chicken2);
        
        chickens.add(chicken);
        chickens.add(chicken2);
        chickens.add(chicken3);
        chickens.add(chicken4);
        chickens.add(chicken5);
        chickens.add(chicken6);
        chickens.add(chicken7);
        
        //System.out.println("chickens ->"+chickens);
        Chicken chickensArray[] = new Chicken[5];
                chickensArray[0] = chicken;
        //System.out.println("chickensArray->"+ chickensArray[0]);
        
        ChickenCoop chickenCoop = new ChickenCoop(1,chickens);
        System.out.println("Chicken Coop 1->"+chickenCoop);
        chickenCoop.remove(6);
        System.out.println("Chicken Coop 1->"+chickenCoop);        

        
    }
         
}
