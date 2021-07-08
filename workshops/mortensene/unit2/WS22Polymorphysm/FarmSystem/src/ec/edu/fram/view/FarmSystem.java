/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.fram.view;

import ec.edu.farm.model.Chicken;
import ec.edu.farm.model.Cow;
import ec.edu.farm.model.FarmAnimal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pc
 */
public class FarmSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date =new Date(2021, 1,20);
       FarmAnimal farmAnimal = new Chicken(0, "breed", date,false);
       ArrayList <FarmAnimal> farmAnimals = new ArrayList<>();
       System.out.println("farmAnimal: "+farmAnimal);
       farmAnimals.add(farmAnimal);
       farmAnimal = new Chicken(0,"guinea",date,true);
       System.out.println("farmAnimal: "+farmAnimal);
       System.out.println("farmAnimal is a: "+farmAnimal.getClass());
       System.out.println("age in Months: "+farmAnimal.getAgeInMonths());
       System.out.println("farmAnimal is a: "+farmAnimal.getClass());
        farmAnimals.add(farmAnimal);
        farmAnimal = new Cow(true,0,"Jersey",new Date(2020,1,25));
        System.out.println("Cow: "+farmAnimal);
        System.out.println("farmAnimal is a: "+farmAnimal.getClass());
        farmAnimals.add(farmAnimal);
        farmAnimal.feed(0);
               
        Chicken chicken = new Chicken (0,"negra",date,true);
           System.out.println("Chicken: "+chicken);
           farmAnimals.add(farmAnimal);
           System.out.println("FarmAnimals"+farmAnimals);
           System.out.println("FarmAnimals that I have"+farmAnimals.size());
        
         Cow cow = new Cow(true,0,"Jersey",new Date(2020,1,25));
        System.out.println("Cow: "+cow);
        System.out.println("farmAnimal is a: "+cow.getClass());
        
        cow.feed(0);
        cow.feed(0, "grass");
        cow.feed(0, 8);
}
}
