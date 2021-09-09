/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax.controller;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class CalculateTax {
    
    private static float taxPercentage = 20.0F;
    
    public static float computeIva(float amount){
        float ivaValue;
        ivaValue = amount * taxPercentage / 100;
        return ivaValue;
    }
     public static float computeTotalPrice(float amount){
        float total;
        total = amount + computeIva(amount);
        return total;  
     }
     
}
