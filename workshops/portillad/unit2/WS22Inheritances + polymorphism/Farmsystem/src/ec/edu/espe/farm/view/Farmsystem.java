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
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Farmsystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date(2021,1,20);
        FarmAnimal farmAnimal = new Chicken(0,"bred",date,false);
        ArrayList <FarmAnimal> farmAnimals  = new ArrayList<>();
        
        farmAnimals.add(farmAnimal);
        System.out.println("farmAnimal ->" + farmAnimal);
        System.out.println("farmAnimal is a->" + farmAnimal.getClass());
        
        
        farmAnimal = new Chicken(0,"Guinea",date, true);
        System.out.println("farmAnimal  ->" + farmAnimal);
        farmAnimals.add(farmAnimal);
        
        System.out.println("age in months of a chichen ->" +farmAnimal.getAgeInInMonths());    
    
        farmAnimal = new Cow(true, 0,"Jersey", new Date(202,1,25));
        System.out.println("Cow ->" + farmAnimal);
        farmAnimals.add(farmAnimal);
        System.out.println("farm Animals -> " + farmAnimals);
        System.out.println("I have " + farmAnimals.size() + " animals");
        farmAnimal.feed(0);
        
        Cow cow= new Cow(true, 0,"Jersey", new Date(202,1,25));
        System.out.println("Cow is a  ->" + cow.getClass());
        farmAnimal.feed(0);
        cow.feed(0, " Grass");
        cow.feed(0, 8);
    
    }   
    
    
}
