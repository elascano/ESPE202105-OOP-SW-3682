package com.mycompany.ws05structuredprogramming;
import java.util.Scanner;
public class WS05StructuredProgramming {
    public static void main(String[] args) {
        
        float addend1;
        float addend2;
        float sum;
        
        float multiplicand;
        float multiplier;
        float product;
        
        float minuend;
        float subtrahen;
        float difference;
        
        float dividend;
        float divisor;
        float quotient;
        
        Scanner Keyboardinput;
        Keyboardinput = new Scanner(System.in);
        System.out.println("WS 05 Structured Programing using Java, by Darwin Valdiviezo");
        System.out.println("=== ADDITION ===");
        System.out.println("Entere the addends ->");
        System.out.println("Addend 1 ->");
        addend1 = Keyboardinput.nextFloat();
        System.out.println("Addend 2 ->");
        addend2 = Keyboardinput.nextFloat();
        
        sum = add(addend1,addend2);
        System.out.println("the addition of " +addend1 + " + "+addend2 +" = " +sum);
        
        System.out.println("=== DIVITION===");
        System.out.println("Entere the dividend and divisor ->");
        System.out.println("Dividend ->");
        dividend = Keyboardinput.nextFloat();
        System.out.println("Divisor ->");
        divisor = Keyboardinput.nextFloat();
        
        quotient = divide(dividend,divisor);
        System.out.println("the division of " + dividend + " + " + divisor +" = " + quotient);
        
        }
    public static float add(float addend1, float addend2){
        return addend1 + addend2;
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
