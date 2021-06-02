/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w05structuredprogramming;

import java.util.Scanner;
/**
 *
 * @author P C
 */
public class W05StructuredProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //add{}
        float addend1;
        float addend2;
        float sum;
        //multiply{}
        float multiplicand;
        float multiplier;
        float product;
        //substract{}
        float minuend;
        float subtrahen;
        float difference;
        //divide{}
        float dividend;
        float divisor;
        float quotient;
        
        Scanner keyboardinput = new /*inicialice*/Scanner(System.in);
        System.out.println("WS 05 Structured Programming using Java, by Nicolas Suquillo ");
        System.out.println("=== ADDITION ===");
        System.out.println("Enter the addends ");
        System.out.print("Addend 1 -> ");
        addend1 = keyboardinput.nextFloat();
        System.out.print("Addend 2 -> ");
        addend2 = keyboardinput.nextFloat();
        
        sum = add(addend1, addend2);
        System.out.println("The addition of " + addend1 + " + " + addend2 + " = " + sum);
        
        System.out.println("=== DIVITION ===");
        System.out.println("Enter the dividend and divisor ");
        System.out.print("Dividend -> ");
        dividend = keyboardinput.nextFloat();
        System.out.print("Divisor -> ");
        divisor = keyboardinput.nextFloat();
        
        quotient = divide(dividend, divisor);
        System.out.println("The divition of " + dividend + " / " + divisor + " = " + quotient);
    }
    
    public static float add(float addend1,float addend2){
        return addend1+addend2;
    } 
    
     public static float multiply(float multiplicand, float multiplier){
         float product;
         product = multiplicand * multiplier;
         return product;
     }
     
     public static float divide(float dividend, float divisor){
         float quotient;
         quotient = dividend / divisor;
         return quotient;
     }
}
