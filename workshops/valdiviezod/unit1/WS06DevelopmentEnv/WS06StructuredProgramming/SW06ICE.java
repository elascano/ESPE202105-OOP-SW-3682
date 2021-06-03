package com.mycompany.ws05structuredprogramming;
import java.util.Scanner;
public class SW06ICE {
    public static void main(String[] args) {
        float multiplicand;
        float multiplier;
        float product;
        float value;
        
        Scanner Keyboardinput;
        Keyboardinput = new Scanner(System.in);
        System.out.println("WS 05 ICE using Java, by Darwin Valdiviezo");

        System.out.println("=== ICE ===");
        System.out.println("The specific ICE tariff for cigarettes is USD 0.16 per unit ->");
        System.out.println("Total packs per package ->");
        multiplicand= Keyboardinput.nextFloat();
        System.out.println("Number of cigarettes per pack ->");
        multiplier = Keyboardinput.nextFloat();
        
        product = multiply(multiplicand,multiplier);
        System.out.println("Total cigarettes of " + multiplicand + " x " + multiplier + " = " + product);
        
        System.out.println("product ->");
        product= Keyboardinput.nextFloat();
        System.out.println("value ICE cigarrete (0,16) ->");
        value = Keyboardinput.nextFloat();
        
        float ice;
        ice = ICE(product,value);
        System.out.println("Total ICE of " + product + " x " + value +" = " + ice + " USD ");
        }
    public static float multiply(float multiplicand, float multiplier){        
        float product;
        product = multiplicand * multiplier;
        return product;
    }
    public static float ICE(float product, float value){
        float ice;
        ice = product * value;
        return ice;
    }
}
    

