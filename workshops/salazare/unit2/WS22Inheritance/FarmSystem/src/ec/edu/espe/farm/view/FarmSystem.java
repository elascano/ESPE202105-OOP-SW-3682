/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class FarmSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date date = new Date(2021,1,20);
        FarmAnimal farmAnimal = new Chicken(0,"breed",date,false);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal-> "+ farmAnimal);
        
        farmAnimal = new Chicken(0,"Guinea",date,true);
        System.out.println("farmAnimal-> "+ farmAnimal);
        farmAnimals.add(farmAnimal);
        
        System.out.println("age in months of a chicken -> "+ farmAnimal.geyAgeInMonths());
        
        farmAnimal = new Cow(0,"Earsi", new Date(2020,1,25));
        System.out.println("cow -> "+ farmAnimal);
         farmAnimals.add(farmAnimal);
         System.out.println("farmAnimal is a "+ farmAnimal.getClass());
        
        Chicken chicken = new Chicken(0,"negra", date, true);
         farmAnimals.add(farmAnimal);
       
        System.out.println("chickens" + chicken);
        
        System.out.println("farm animals"+ farmAnimals);
        
        System.out.println("I have"+ farmAnimals.size()+ "animals");
        
        Cow cow = new Cow(0,"Jersey", new Date(2020,1,25));
        System.out.println("cow-> "+ cow);
        farmAnimals.add(cow);
        System.out.println("cow is a "+ cow.getClass());
        cow.feed(0);
        cow.feed(0, "grass");
        cow.feed(0, 8);
    }
    
}
