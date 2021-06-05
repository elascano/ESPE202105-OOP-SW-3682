/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws05structuredprogramming;

import java.util.Scanner;

/**
 *
 * @author jejoc
 */
public class WS05StructuredProgramming {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
        //add()
        float addend1;
        float addend2;
        float sum;
        
        //multiply()
        float muliplicand;
        float multiplier;
        float product;
        
        //subtract()
        float minuend;
        float subtrahen;
        float difference;
        
        //divide()
        float dividend;
        float divisor;
        float quotient;
        
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("WS05 Structured Programming using JAVA, by Jeremy Cadena");
        System.out.println("=== ADITION ===");
        System.out.println("Enter the addends ");
        System.out.print("Addend 1 -> ");
        addend1 = keyboardinput.nextFloat();
        System.out.print("Addend 2 -> ");
        addend2 = keyboardinput.nextFloat();
        
        sum = add(addend1, addend2);
        System.out.println("The addition of " + addend1 + " + " + addend2 + " = " + sum);
        
        System.out.println("=== DIVITION ===");
        System.out.println("Enter de dividend an divisor ");
        System.out.print("Dividend -> ");
        dividend = keyboardinput.nextFloat();
        System.out.print("Divisor -> ");
        divisor = keyboardinput.nextFloat();
        
        quotient = divide(dividend, divisor);
        System.out.println("The divition of " + dividend + " /2 " + divisor + " = " + quotient);
    }
    
    public static float add(float addend1,float addend2){
        float sum;
        sum = addend1 + addend2;
        return sum;
    }
    
    public static float multiply(float multiplicand,float multiplier){
        float product;
        product = multiplicand * multiplier;
        return product;
    }
    
    public static float divide(float dividend,float divisor){
        float quotient;
        quotient = dividend/divisor;
        return quotient;
    }
}
