/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws05structureprogramming;


import java.util.Scanner;
/**
 *
 * @author Myck
 */
public class WS05StructureProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float addend1;
       float addend2;
       float sum;
       
       float dividend;
       float divisor;
       float quotient;
       
       Scanner keyboardinput = new Scanner(System.in);
       System.out.println("WS 05 Structured Programming using Java Myckel Chamorro");
       System.out.println("Enter the addens");
       System.out.print("Addend1--> ");
       addend1 = keyboardinput.nextFloat();
       System.out.print("Addend2--> ");
       addend2 = keyboardinput.nextFloat();
       sum = add(addend1, addend2);
       System.out.println("The addition of " + addend1 + "+ "+ addend2 + " = " + sum);
       System.out.println("--DIVISION--");
       System.out.print("Dividend--> ");
       dividend = keyboardinput.nextFloat();
       System.out.print("Divisor--> ");
       divisor = keyboardinput.nextFloat();
       quotient= divide(dividend, divisor);
       System.out.println("The division of " + dividend + "/ "+ divisor + " = " + quotient);
       
     
              
      
    }
    
    public static float add(float addend1, float addend2){
       return addend1+addend2;
    }
    public static float divide(float dividend, float divisor){
       float quotient;
       quotient= dividend / divisor; 
       return quotient;
    }
    
    
        
}
