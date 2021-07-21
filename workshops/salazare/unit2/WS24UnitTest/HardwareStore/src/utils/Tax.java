/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class Tax {
    static float ivaPercentage=12.00F;
    
    public static float computeIva(float price){
        if(price<0){
            return 0;
        }
      float ivaValue;
      ivaValue = price *ivaPercentage/100;
      return ivaValue;
    }
    
     public static float computeTotalPrice(float price){
      float totalPrice;
      totalPrice = price + computeIva(price);
      return totalPrice;
    }
    
     //TEST CASES for iva
     //imput   expected result    actusl result 
     //100.00      12.00F             
     //156.25      18.75
     //1789.23     214.71
     
     //TEST CASES  fot total price 
     //100.00      112.00
     //156.25      175.00
     
}
