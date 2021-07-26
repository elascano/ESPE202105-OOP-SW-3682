/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.hardwarestore.utils;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO

 */
public class Tax {
    static float ivaPercentage = 12.00F;
    
    public static float computeIva(float price){
        if(price<0){
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
    
    //TEST CASES for float computeIva(float price);
    //Input/s           expected result         actual result
    //100                   12.00F  
    //156.25                18.75F
    //1789.23               214.71
    //0.00                  0
    //-2.45                 0
    //123.876               14.86
    //0.23                  0.03
    
    //TEST CASES for total price float computeTotalPrice(price);
    //price                 total price
    //100.00                112.00
    //156.25                175.00
}   
