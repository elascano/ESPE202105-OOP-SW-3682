/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wso6incometax;

import java.util.Scanner;
/**
 *
 * @author Matthew Salazar
 */
public class WSO6InComeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       float totalAmount;
        float computeTax;
        float totalPayment;
Scanner keyboardinput = new Scanner(System.in);
System.out.println("WS 06 Tax calculation using java, by Salazar Matthew");
System.out.println("Enter the amount to be calculated: ");
System.out.print("Total amount ->" );
totalAmount = keyboardinput.nextFloat();
computeTax = computeIncometax(totalAmount);
totalPayment = totalAmount + computeTax;
System.out.print("The tax for " + totalAmount + " is " + computeTax);
System.out.print("\nYour total to pay is: " + totalPayment);
                  
          
    }
    
    public static float computeIncometax(float amount) {
     float totalAmount=0;
     float excessUp;
    if ( amount < 11212){
        totalAmount=0;
    }else if (amount >11212 && amount<14258 ){ 
        excessUp = amount - 11212; 
        totalAmount= (excessUp *5)/100;
    }else if(amount >14258 && amount<17954 ){
        excessUp = amount - 1258;
        totalAmount= 154+((excessUp*10)/100);
    } else if (amount >17854 && amount<21442 ){
        excessUp = amount - 17854;
        totalAmount= 511+((excessUp*12)/100);
    }else if (amount >21442 && amount<42874 ){
        excessUp = amount - 21442;
        totalAmount=  941+((excessUp*15)/100);
    } else if (amount >42874 && amount<64297 ){
        excessUp = amount - 42874;
        totalAmount= 4156+((excessUp*20)/100);
    }else if (amount >64297 && amount<85729 ){
        excessUp = amount - 64297; 
        totalAmount= 8440+((excessUp*20)/100);
    }else if (amount >85729 && amount<114288 ){
        excessUp = amount - 85729; 
        totalAmount= 13798+((excessUp*30)/100);
    }else if (amount >114288){
        excessUp = amount - 114288; 
        totalAmount= 22366+((excessUp*35)/100);
    }
    return totalAmount; 
    }
    
}