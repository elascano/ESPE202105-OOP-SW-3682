/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.GroceryStoreManagement.view;

import ec.edu.espe.GroceryStoreManagement.model.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author pc
 */
public class SystemDisplay {
    public static void main(String [] args){
        String type;
        String brand;
        float volume;
        float price;
        int amountperunit;
        ArrayList<Drinks> drinkss = new ArrayList<>();
        
        //input by keyboard
        type = "Soda";
        brand = "CocaCola";
        volume = 1;
        price=3;
        amountperunit=1; 
        Drinks drinks = new Drinks();
       
        System.out.println("drinks object -> " + drinks);
        
        drinks = new Drinks(type, brand, volume, (int) price,amountperunit);
        System.out.println("chicken object -> " + drinks);
        
        Drinks drinks2 = new Drinks("Juice", "Del Valle", 1, 1, 1);
        System.out.println("chicken2 object -> " + drinks2);
        
        drinkss.add(drinks);
        drinkss.add(drinks2);
        
        System.out.println("drinks -> " + drinkss);
        Drinks[] drinksArray = new Drinks[5];
        drinksArray[0]= drinks;
        
        System.out.println("drinksArray -> " + drinksArray);
    
}
}
