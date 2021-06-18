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
 * @author Lizbeth Cajas EMCL.java ESPE-DCCO
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
        chicken = new Chicken(chickenId,name,color,"17/03/2019",isMolting);
        System.out.println("chicken object->"+ chicken);
        
        Chicken chicken2 = new Chicken(2,"Maruja","brown","10/03/2021",false);
        Chicken chicken3 = new Chicken(3,"Violeta","white","02/12/2020",false);
        Chicken chicken4 = new Chicken(4,"Karla","pinck","22/08/2019",false);
        Chicken chicken5 = new Chicken(5,"Lupe","red","26/10/2013",false);
        Chicken chicken6 = new Chicken(6,"Josefa","red","18/03/2012",false);
        Chicken chicken7 = new Chicken(7,"Maria","green","02/09/2009",false);
        
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
