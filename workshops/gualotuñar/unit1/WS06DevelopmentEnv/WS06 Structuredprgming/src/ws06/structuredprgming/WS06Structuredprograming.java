/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws06.structuredprograming;
import java.util.Scanner;

/**
 *
 * @author DELL 5470
 */
public class WS06Structuredprograming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float multiplicand;
        float multiplier;
        float product;
        float amount;
        
        Scanner keyboardinput;
        keyboardinput = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("WS-06 ICE CALCULATE in java, by Richard Gualotuña ");
        
        System.out.println("----------ICE CALCULATE------------");
        System.out.println("The ICE tariff for cigarettes is USD 0.16 per unit -> ");
        System.out.println("number of packs per package ->");
        multiplicand= keyboardinput.nextFloat();
        System.out.println("Number of cigarettes por pack ->");
        multiplier = keyboardinput.nextFloat();
        
        product = multiply(multiplicand,multiplier);
        System.out.println("number of cigarettes"+  multiplicand + "x"  + multiplier + "-" + product);
        
        System.out.println("product ->");
        product = keyboardinput.nextFloat();
        System.out.println("amount ICE cigarette -> (0.16)");
        amount = keyboardinput.nextFloat();
        
        float ice;
        ice = ICE(product, amount);
        System.out.println("ICE amount of" + product + "x" + amount + "=" + ice +  "-" + "USD");
    }
    
    public static float multiply(float multiplicand, float multiplier){
        float product;
        product = multiplicand * multiplier;
        return product;
    }

    
    public static float ICE(float product, float amount){
        float ice;
        ice = product * amount;
        return ice;
    }
    
    
}
