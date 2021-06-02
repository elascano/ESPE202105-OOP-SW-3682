/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuredprograming;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class WS05StructuredPrograming {
    public static void main(String[] args) {
       //add()
        float addend1;
       float addend2;
       float sum;
       
       //multiply()
       float multiplicand;
       float multiplier;
       float product;
       
       //substract
       float minuend;
       float substrahen;
       float difference;
       
       //divide()
       float dividend;
       float divisor;
       float quotient;
       
       //calculeIncomeTax
       float annualIncome;
       
       Scanner keyboardinput = new Scanner(System.in);
       System.out.println("WS 05 Structured Programming using Java, by Esteban Chablay");
       
       //-----------------------------------------------------------------------------------
       System.out.println("--ADITTION--");
       System.out.println("Enter de addends: ");
       System.out.println("Addend1 -> ");
       addend1 = keyboardinput.nextFloat();
       System.out.println("Addend2 -> ");
       addend2 = keyboardinput.nextFloat();
       sum = add(addend1, addend2);
       System.out.println("The addition of " +addend1+ " + " +addend2+ " = " +sum);
       
       //-----------------------------------------------------------------------------------
       System.out.println("--DIVITTION--");
       System.out.println("Enter the dividend and divisor: ");
       System.out.println("Dividend -> ");
       dividend = keyboardinput.nextFloat();
       System.out.println("Divisor -> ");
       divisor = keyboardinput.nextFloat();
       
       quotient = divide(dividend, divisor);
       System.out.println("The division of " +dividend+ " + " +divisor+ " = " +quotient);
       
    }
    
    public static float add(float addend1, float addend2){
      return addend1+addend2;  
    }
    
    public static float multiply(Float multiplicand ,float multiplier){
        float product;
        product = multiplicand*multiplier;
        return product;
    }
    
    public static float divide(Float dividend,float divisor){
        float quotient;
        quotient = dividend/divisor;
        return quotient;
    }
    
    public static float calculateIncomeTax(){
        return 0;
    }
    
}
