/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws06incometax;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class WS06IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    float amountRequiredToCalculate;
    float incomeTaxes;
    float totalYouHaveToPay;
    
    Scanner keyboardinput = new Scanner(System.in);
    System.out.println("****WS06 Icome Tax in java code, by Cristian Felix****");
    System.out.print("Please enter the amount that you wish calculate: \n");
 
    amountRequiredToCalculate = keyboardinput.nextFloat();
    incomeTaxes =  computeIncometax(amountRequiredToCalculate);
    totalYouHaveToPay = amountRequiredToCalculate + incomeTaxes;
    System.out.print("The income tax for: " + amountRequiredToCalculate + "\nIs: "+ incomeTaxes + " \nThe total is: " + totalYouHaveToPay);
    }
    
    public static float computeIncometax(float amount){
        
        float totalAmountDue = 0;
        float surplus;
       
        
        if (amount<= 11212 ){
            totalAmountDue=0;
        }else if (amount <= 14285 && amount >= 11212){
            surplus = amount -11212;
            totalAmountDue = (surplus*5)/100;
        }else if (amount <= 17854 && amount >= 14285){
            surplus = amount-1258;
            totalAmountDue = 154+((surplus*10)/100);
        }else if (amount <=21442 && amount >=17854){
            surplus = amount -17854;
            totalAmountDue = 511+((surplus*12)/100);
        }else if (amount <=42874 && amount >=21442){
            surplus = amount -21442;
            totalAmountDue = 941+((surplus*15)/100);
        }else if (amount <=64297 && amount >=42874){
            surplus = amount -42874;
            totalAmountDue = 4156+((surplus*20)/100);
        }else if (amount <=85729 && amount >=64297){
            surplus = amount-64297;
            totalAmountDue = 8440+((surplus*20)/100);
        }else if (amount <114288 && amount > 85729){
            surplus = amount -85729;
            totalAmountDue = 13798+((surplus*30)/100);
        }else if(amount >114288){
            surplus = amount -114288;
            totalAmountDue = 22366+((surplus*35)/100);    
        }
        return totalAmountDue;
   
    }
}
    
