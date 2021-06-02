/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w06incometax;

import java.util.Scanner;
/**
 *
 * @author P C
 */
public class W06Incometax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        float income;
        float amountpayable;
        
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("WS 06 Structured Programming using Java, by Nicolas Suquillo ");
        System.out.println("=== Income Tax ===");
        System.out.println("Enter the amount ");
        income = keyboardinput.nextFloat();
        
        amountpayable = incometax(income);
        System.out.println("The amount to pay for the income tax is: " + amountpayable);
    }
    
    public static float incometax(float income){
        
      float amountpayable;
        
        if (income <= 11212){
            
            amountpayable = income; 
            
        }else if(income <= 14285){
            
            amountpayable =((income - 11212)*5) /100;
            
        }else if(income <= 17854){
            
            amountpayable = ((income - 14285)*10) /100;
            amountpayable += 154;
            
        }else if(income <= 21442){
            
            amountpayable = ((income - 17854)*12) /100;
            amountpayable += 511; 
            
        }else if(income <= 42874){    
            
            amountpayable = ((income - 21442)*15) /100;
            amountpayable += 941;
            
        }else if (income <= 64297){
            
            amountpayable = ((income - 42874)*20) /100;
            amountpayable += 4156;
            
        }else if (income <= 85729){
            
            amountpayable = ((income - 64297)*25) /100;
            amountpayable += 8440;
            
        }else if (income <= 114288){
            
            amountpayable = ((income - 85729)*30) /100;
            amountpayable += 13798;
            
        }else {
            
            amountpayable = ((income - 114288)*35) /100;
            amountpayable += 22366;
            
        }
        
        return amountpayable;
        
    }
}
