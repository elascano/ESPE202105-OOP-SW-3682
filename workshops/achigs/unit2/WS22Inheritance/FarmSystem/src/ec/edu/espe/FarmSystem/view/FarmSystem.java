/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FarmSystem.view;

import ec.edu.espe.FarmSystem.model.Chicken;
import ec.edu.espe.FarmSystem.model.Cow;
import ec.edu.espe.FarmSystem.model.FarmAnimal;
import java.util.Date;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class FarmSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date date = new Date(2021, 1, 20);
        FarmAnimal farmAnimal = new FarmAnimal(0, "breed", date);
        ArrayList<FarmAnimal> farmAnimals 
        
        System.out.println("farmAnimal -> " + farmAnimal);
        
        farmAnimal = new Chicken(0, "Guinea", date, true);
        System.out.println("farmAnimal -> " + farmAnimal);
        
        farmAnimals.add(farmAnimal);
        
        System.out.println("age in months of a chicken -> " + farmAnimal.getAgeIntMonths());
        
        farmAnimal = new Cow(true, 0, "Jersey", new Date(2020, 1, 25));
        System.out.println("cow -> " + farmAnimal);
        
        Chicken chicken = new Chicken(0, "negra", date, true);
        System.out.println("chicken" + chicken);
    }
    
}
