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
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) {
        Date date = new Date();
        FarmAnimal farmAnimal = new Chicken(0, "Ary", date, true);
        System.out.println("farm animal -> " +farmAnimal);
        
        farmAnimal = new Chicken(0, "Guines", date, true);
        System.out.println("Chicken -> " +farmAnimal);
        
        System.out.println("Date -> " +farmAnimal.getAgeInMonths());
        
        farmAnimal = new Cow(true, 0, "angus", new Date(2020,1,25));
        System.out.println("Cow ->" +farmAnimal);
        farmAnimal.feed(0);
        
        Cow cow = new Cow(true, 0, "Jersey", new Date(2020,1,25));
        System.out.println("Cow ->" +cow);
        cow.feed(0);
        cow.feed(0, "Sugar Cane");
        
    }
    
}
