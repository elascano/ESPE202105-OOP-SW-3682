/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class Tax {
 
   static float  ivaPercentage = 12.00F;
    
    public static float computeIva(float price){
        
        if (price<=0){
            return 0;
        }
        
        float ivaValue;       
        ivaValue = price * ivaPercentage/100;
        return ivaValue;
    }
    
    public static float computeTotalPrice(float price){
        
        float totalPrice;   
        totalPrice = price + computeIva(price);
        return totalPrice;
    }
    
    /*
    
     TEST CASES for iva computeIva(float price)
       imput/s               expected result         actual result 
       price                     ivaValue
       100.00                    12.00                   
       156.25                    18.75
       1789.23                   214.71
       0.00F                    0.0
       -2.45                    0.0
       123.786                   14.86
       0.23                      0.03
    
      TEST CASES for total price price float computeTotalPrice(float price)
      Price                     Total price
      100.00                    112.00
      156.25                    175.00
    
    */
}
