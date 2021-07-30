/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public class Tax {
    static float ivaPercentage=12.00F;
    
    public static float computeIva(float price){
        float ivaValue;
        ivaValue =price *ivaPercentage/100;
        return ivaValue;
    }
    public static float computeTotalPrice(float price){
        float totalPrice;
        totalPrice =price +computeIva(price);
        return totalPrice;
    }
    //TEST CASES 
    //input/s      expected
}
