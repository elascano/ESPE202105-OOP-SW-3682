/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Tax {
     static float ivaPercentage=12.00F;
    
    public static float computeIva(float price){
    float ivaPrice;
    if (price<=0){
     return ivaPrice=0.0F;
    }
    ivaPrice=price*ivaPercentage/100;
    return ivaPrice;
    
    }
    public static float computeTotalprice(float price){
    float totalPrice;
    totalPrice=price+ price*ivaPercentage/100;
    return totalPrice;
    }
    
    public static float computeAddition(float addend1, float addend2){
float sum;
sum=addend1+addend2;
return sum;
    }
    
    public static float computeSubstract(float minuend, float subtrahend){
        
float difference;
difference=minuend-subtrahend;
return difference;
}
}
    
