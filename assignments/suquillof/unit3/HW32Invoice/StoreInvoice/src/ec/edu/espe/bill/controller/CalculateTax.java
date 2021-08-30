/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bill.controller;

import ec.edu.espe.bill.model.USTax;



/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class CalculateTax {
    
    public static float computeIva(float amount){
        float ivaValue;
        USTax usTax = USTax.getInstance();
        
        ivaValue = amount * usTax.getTaxPercentage() / 100;
        return ivaValue;
    }
     public static float computeTotalPrice(float amount,float tax){
        float total;
        total = amount + tax;
        return total;  
     }
}
