/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farm.view;

import ec.espe.edu.farm.model.Chicken;
import ec.espe.edu.farm.model.Cow;
import ec.espe.edu.farm.model.FarmAnimal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class FarmSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date(2021, 1, 20);
        FarmAnimal farmAnimal = new Chicken(0, "breed", date, false);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal -> " + farmAnimal);
        System.out.println("--> Farm animal is a " + farmAnimal.getClass());
        
        farmAnimal = new Chicken(0, "Guinea", date, true);
        System.out.println("farmAnimal -> " + farmAnimal);
        System.out.println("--> Farm animal is a " + farmAnimal.getClass());
        
        farmAnimals.add(farmAnimal);
        
        System.out.println("Age in months of a chicken -> " + farmAnimal.getAgeInMonths());
        
        farmAnimal = new Cow(true, 0, "Earsi", new Date(2020, 1, 25));
        System.out.println("Cow -> " + farmAnimal);
        System.out.println("--> Farm animal is a " + farmAnimal.getClass());
        farmAnimal.feed(0);
        
        farmAnimals.add(farmAnimal);
        
        Chicken chicken = new Chicken(0, "Negra", date, true);
        System.out.println("Chicken -> " + chicken);
        
        farmAnimals.add(chicken);
        System.out.println("Farm animals -> " + farmAnimals);
        System.out.println("I have " + farmAnimals.size() + " animals.");
        
        Cow cow = new Cow(true, 0, "Earsi", new Date(2020, 1, 25));
        System.out.println("Cow -> " + farmAnimal);
        farmAnimals.add(cow);
        System.out.println("--> Farm animal is a " + farmAnimal.getClass());
        cow.feed(0);
        cow.feed(0, "grass");
        cow.feed(0, 8);
    }
}
