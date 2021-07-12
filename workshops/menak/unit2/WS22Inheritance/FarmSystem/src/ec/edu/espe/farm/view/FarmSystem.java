/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.fram.model.Chicken;
import ec.edu.espe.fram.model.Cow;
import ec.edu.espe.fram.model.FarmAnimal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class FarmSystem {
    
    public static void main(String[] args){
        
        Date date = new Date(2021,1,20);
        FarmAnimal farmAnimal = new Chicken(0, "breed", date, false);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal -->" + farmAnimal);
        System.out.println("--> farmAnimal is a " + farmAnimal.getClass());
        
        farmAnimal = new Chicken (0, "Guinea", date, true);
        System.out.println("farmAnimal -->" + farmAnimal);   
        System.out.println("--> farmAnimal is a " + farmAnimal.getClass());
        
        farmAnimals.add(farmAnimal);
        
        System.out.println("age in months of a chicken --> "+ farmAnimal.getAgeInMonths());
        
        farmAnimal = new Cow(true, 0, "Jersey", new Date(2020, 1, 25));
        System.out.println("cow --> " + farmAnimal);
        
        farmAnimals.add(farmAnimal);
        System.out.println("--> farmAnimal is a " + farmAnimal.getClass());
        farmAnimal.feed(0);
       
        
        
        Chicken chicken = new Chicken(0, "silkie", date, true);
        farmAnimals.add(farmAnimal);
        System.out.println("chicken -->" + chicken);
        
        System.out.println("farm Animals --> " + farmAnimals);        
        System.out.println("I have " + farmAnimals.size() +"animals");
        
        
        Cow cow = new Cow(true, 0, "Jersey", new Date(2020, 1, 25));
        System.out.println("cow --> " + cow);
        
        farmAnimals.add(cow);
        System.out.println("--> cow is a " + cow.getClass());
        cow.feed(0);
        cow.feed(0);
        cow.feed(0,"grass");
        cow.feed(0, 8);
        
        
    }
    
}
