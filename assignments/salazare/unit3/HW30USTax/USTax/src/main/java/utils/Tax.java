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
    private static float taxes = 20.0F;
    
    public static float computeIva(float amount){
        float ivaValue;
        ivaValue = amount * taxes / 100;
        return ivaValue;
    }
     public static float computeTotalPrice(float amount){
        float total;
        total = amount + computeIva(amount);
        return total;  
     }
     
     
}
