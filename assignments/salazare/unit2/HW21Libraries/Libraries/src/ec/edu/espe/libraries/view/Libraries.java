/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.libraries.view;

import ec.edu.espe.utils.Gain;
import java.util.Scanner;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class Libraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         float price = 500.50F;
         float gain;
         float netPrice;
         
         gain = Gain.computeGain(price);
         System.out.println("The gain of-> " + price +"<- is: "+ gain);
         
         netPrice = Gain.netPrice(price);
         System.out.println("The Net Price of-> " + price +"<- is: "+ netPrice);
         
    
     }
}
