/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

import java.util.Scanner;
import ec.edu.espe.utils.Gain;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Profit {

    
    public static void calculateProfit(){
    float price;
    float gain;
    float netPrice;
    float minimumGain;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\nEnter the Unit Cost");
      price=sc.nextFloat();
     do{
      System.out.println("\nEnter the profit Percentage");
      minimumGain=sc.nextFloat();   
     }while(minimumGain<0 || minimumGain>0.99);
      gain = Gain.computeGain(price,minimumGain);
         System.out.println("The gain of-> " + price +"<- is: "+ gain);
         
         netPrice = Gain.netPrice(price,minimumGain);
         System.out.println("The Net Price of-> " + gain +"<- is: "+ netPrice);
         
    
} 
}
