/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws06ice;

import java.util.Scanner;

/**
 *
 * @author jejoc
 */
public class WS06Ice {

    /**
     * @param args the command line arguments
     */
   
public static void main(String[] args) {
    int box;
    float Ice;
    
    Scanner keyboardinput = new Scanner(System.in);
    System.out.println("WS06 ICE, by Jeremy Cadena");
    System.out.println("=== ICE CALCULATE ===");
    System.out.println("Product to calculate ICE is Cigarettes");
    System.out.println("Consider that each carton of cigarettes contains twenty cigarettes");
    System.out.print("Enter the number of boxes of cigarettes -> ");
    box = keyboardinput.nextInt();
       
    Ice = computeIce(box);
    System.out.println("The ICE is " + Ice);
    
}

public static float computeIce(float amount){
    float Ice;
    
    Ice = (float) ((amount*20)*0.16);
    return Ice;
}
}
