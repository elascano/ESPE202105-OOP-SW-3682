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
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class FarmSystem {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date(2021,1,20);
        FarmAnimal farmAnimal = new FarmAnimal(0, "breed", date) {};
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        
        farmAnimals.add(farmAnimal);
        
        System.out.println("farmAnimal->" + farmAnimal);
        
        farmAnimal = new Chicken(0, "Guinea", date , true);
        System.out.println("farmAnimal->" + farmAnimal);
        
        farmAnimals.add(farmAnimal);
        System.out.println("age in months->" + farmAnimal.getAgeInMonths());
        
        farmAnimal = new Cow(true, 0, "Earsi", new Date(2020, 1, 25) );
        System.out.println("cow->" + farmAnimals);
        farmAnimals.add(farmAnimal);
        
        Chicken chicken = new Chicken(0, "negra", date, true);
        System.out.println("chicken->" + chicken);
        farmAnimals.add(chicken);
        
        System.out.println("chicken" + chicken);
        System.out.println("farm animal" + farmAnimals);
        System.out.println("I have" + farmAnimals.size() + "animals");
    } 
}
