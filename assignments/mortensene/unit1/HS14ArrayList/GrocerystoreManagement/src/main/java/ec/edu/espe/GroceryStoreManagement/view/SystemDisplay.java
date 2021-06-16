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
        ArrayList<Drinks> drinkS = new ArrayList<>();
        
        //input by keyboard
        type = "Soda";
        brand = "CocaCola";
        volume = (float)1.8;
        price=(float)3.25;
        amountperunit=1; 
        Drinks drinks = new Drinks();
       
        System.out.println("drinks object -> " + drinks);
        
        drinks = new Drinks(type, brand, volume, (int) price,amountperunit);
        System.out.println("chicken object -> " + drinks);
        
        Drinks drinks2 = new Drinks("Juice", "Del Valle", (float) 1.5, 1, (float) 1.99);
        System.out.println("chicken2 object -> " + drinks2);
        
        drinkS.add(drinks);
        drinkS.add(drinks2);
        
        System.out.println("drinks -> " + drinkS);
        Drinks[] drinksArray = new Drinks[5];
        drinksArray[0]= drinks;
        
        System.out.println("drinksArray -> " + drinksArray[0]);
    
}
}
