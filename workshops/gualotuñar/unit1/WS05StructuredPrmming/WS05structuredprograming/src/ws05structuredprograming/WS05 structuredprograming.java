/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws05structuredprograming;

import java.util.Scanner;
/**
 *
 * @author DELL 5470
 */
public class WS05structuredprograming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //add()
        float addend1 = 0.0F;
        float addend2;
        float sum;
        
        //multiply()
        float multiplicand;
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
        System.out.println("WS 05 Structured <programing using java, by Richard Gualotuña");
        System.out.println("=== ADITION ====");
        System.out.println("Enter the addens ->");
        System.out.print("Addend 1 -> ");
        addend1 = keyboardinput.nextFloat();
        System.out.print("Addend 2 -> ");
        addend2 = keyboardinput.nextFloat();
        
        sum = add(addend1, addend2);
        System.out.println("the addition of" + addend1 + "+" + addend2 + "=" + sum);
        
        System.out.println("=== DIVISION ====");
        System.out.println("Enter the adividend and divisor ->");
        System.out.print("Dividend -> ");
        dividend = keyboardinput.nextFloat();
        System.out.print("Divisor -> ");
        divisor = keyboardinput.nextFloat();
        
        quotient = divide(dividend, divisor);
        System.out.println("the division of" + dividend + "+" + divisor + "=" + quotient);
    }
    
    public static float add(float addend1, float addend2){
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
