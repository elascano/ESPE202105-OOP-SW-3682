/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.groseryStore.view;

import ec.edu.espe.groseryStore.model.AlcoholicDrinks;
import java.util.ArrayList;


/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class Simulator {
    
    public static void main(String [] args){
        String type;
        String brand;
        float price;
        int amountproducts;
        ArrayList<AlcoholicDrinks> drinkS = new ArrayList<>();
        
        //input by keyboard
        type = " WHISKY";
        brand = " JACK DANIEL`S";
        amountproducts=1; 
        price=( float) 57.50;
        AlcoholicDrinks alcoholicdrinks = new AlcoholicDrinks();
       
        System.out.println("Alcoholic drinks object -> " + alcoholicdrinks);
        
        alcoholicdrinks = new AlcoholicDrinks(type, brand,amountproducts, (float) price);
        System.out.println("Alcoholic drinks object -> " + alcoholicdrinks);
        
        AlcoholicDrinks alcoholicdrinks2 = new AlcoholicDrinks(" WHISKY", " BUCHANAN`S DELUXE", 1, (float) 48.26);
        System.out.println("Alcoholic drinks2 object -> " + alcoholicdrinks2);
        
        drinkS.add(alcoholicdrinks);
        drinkS.add(alcoholicdrinks2);
        
        System.out.println("Alcoholic drinks -> " + drinkS);
        AlcoholicDrinks[] drinksArray = new AlcoholicDrinks[5];
        drinksArray[0]= alcoholicdrinks;
        
        System.out.println("Alcoholic drinksArray -> " + drinksArray[0]);
    
}
    
}
