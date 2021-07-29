/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class Tax {
    static float ivaPercentage=12.00F;
    
    public static float computeIva(float price){
        
        float ivaValue;
        ivaValue = price * ivaPercentage/100;
        return ivaValue;
    }
    
    public static float computeTotalPrice(float price){
        
        float totalPrice;
        totalPrice = price * ivaPercentage/100;
        return totalPrice;
    }
    
    //test cases
    // input/s      expected result         actual result
    // 100.00            12.00                 
    // 156.25            18.75
    // 1789.23           214.71
    //      0.00
    // -2.45             0.0
    //123.876
    //0.23
    
    //Test Cases fot total price
    //100.00             112.00
    //156.25             175.00
    
    
}
