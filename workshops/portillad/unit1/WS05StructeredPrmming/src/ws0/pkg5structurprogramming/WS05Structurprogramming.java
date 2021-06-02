/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws0.pkg5structurprogramming;

import java.util.Scanner;
/**
 *
 * @author Diego Portilla
 */
public class WS05Structurprogramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float addend1;
        float addend2;
        float sum;
        
        float multiplicand;
        float multiplier;
        float product;
        
        float minued;
        float subtrahen;
        float differrence;
        
        float dividend;
        float divisor;
        float quotient;
                
        Scanner Keyboardinput = new Scanner(System.in);
        System.out.println("WS 05 Structured Programming Diego Portilla");
        System.out.println("Enter the addends");
        System.out.print("Addend 1 -> ");
        addend1 = Keyboardinput.nextFloat();
        System.out.print("Addend 2 -> ");
        addend2 = Keyboardinput.nextFloat();
        
        sum=add(addend1,addend2);
        System.out.println("the addition of " + addend1 + "+" + addend2 + "=" + sum);
        
        System.out.println("DIVISION");
        System.out.println("Enter the dividend");
        System.out.print("dividend -> ");
        dividend = Keyboardinput.nextFloat();
        System.out.print("divisor  -> ");
        divisor = Keyboardinput.nextFloat();
        
        quotient=divide(dividend ,divisor);
        System.out.println("the quotient of " + dividend + "/" + divisor + "=" + quotient );
    }
    public static float add(float addend1 , float addend2){
    
        return addend1+addend2;
    }
    public static float multiply(float multiplicand , float multiplier){
        float product;
        product  =  multiplicand * multiplier;
        return product;
    }
    public static float divide(float dividend , float divisor){
        float quotient;
        quotient  = dividend/divisor;
        return quotient;
    }
}
