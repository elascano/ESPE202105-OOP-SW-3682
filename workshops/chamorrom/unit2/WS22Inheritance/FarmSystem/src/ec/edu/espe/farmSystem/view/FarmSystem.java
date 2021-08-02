/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmSystem.view;

import ec.edu.espe.farmSystem.model.Chicken;
import ec.edu.espe.farmSystem.model.Cow;
import ec.edu.espe.farmSystem.model.FarmAnimal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class FarmSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date(2021, 1, 20);
        FarmAnimal farmAnimal = new Chicken(0, "breed", date,true);
        ArrayList<FarmAnimal> farmAnimals = new ArrayList();
        farmAnimals.add(farmAnimal);

        System.out.println("Farm Animal-> " + farmAnimal);
        System.out.println("--> farm animal is a " + farmAnimal.getClass());
        farmAnimal = new Chicken(0, "guinea", date, true);
        System.out.println("Chicken-> " + farmAnimal);
        System.out.println("--> farm animal is a " + farmAnimal.getClass());
        farmAnimals.add(farmAnimal);
        System.out.println("Age in months of a chicken -> " + farmAnimal.getAgeInMonths());
        farmAnimal = new Cow(0, "Jersey", new Date(2020, 1, 25), true);
        System.out.println("Cow-> " + farmAnimal);
        farmAnimal.feed(0);
        
        System.out.println("--> farm animal is a " + farmAnimal.getClass());
        farmAnimals.add(farmAnimal);

        Chicken chicken = new Chicken(0, "negra", date, true);
        farmAnimals.add(chicken);
        System.out.println("chicken ->" + chicken);
        System.out.println("Farm Animals -> " + farmAnimals);
        
        Cow cow = new Cow(0, "Jersey", new Date(2020, 1, 25), true);
        System.out.println("Cow-> " + farmAnimal);
        System.out.println("--> cow is a " + cow.getClass());   
        farmAnimals.add(cow);
        cow.feed(5);
        cow.feed(7, "Grass");
        cow.feed(3,7);

    }

}
