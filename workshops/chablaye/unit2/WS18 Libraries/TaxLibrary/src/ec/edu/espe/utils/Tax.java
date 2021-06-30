/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class Tax {
    private static float taxPercentage = 12.00F;
    
    /**
     * This function computes the IVA value of any product based on the percentage that the governsent has issued, currently 12%
     * @param amount This is the PVP of the product ypu are selling
     * @return  The iva of the PVPO that the system willl charge for tax declaration
     */
    
    public static float computeIva (float amount){
        float ivaValue;
        ivaValue = amount * taxPercentage/100;
        return ivaValue;
    }
    
    /**
     * Compute the total price of products that need to add the IVA
     * @param amount the PVP
     * @return The total price that will be charged
     */
    public static float totalPrice(float amount){
        float total;
        total = amount + computeIva(amount);
        return total;
    }
       
}
