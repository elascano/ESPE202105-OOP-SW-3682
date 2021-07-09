/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.veiw;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.util.Date;

/**
 *
 * @author Lizbeth Cajas
 */
public class FarmSystem {
    
    public static void main(String[] args) {
        Date date = new Date(2021,1,20);
        FarmAnimal farmAnimal = new FarmAnimal(0, "breed",date);
        System.out.println("farmAnimal -> "+farmAnimal);
        farmAnimal = new Chicken(0, "Guinea",date,true);
        System.out.println("farmAnimal ->"+farmAnimal);
        
       
        farmAnimal = new Chicken(0,"Guinea",date,true);
        System.out.println("age in months of chicken"+farmAnimal.getAgeInMonths());
    }
    
    
}
