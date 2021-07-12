/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class Tax {
     private static float taxPercentage = 12.0F;
     
     /**
      * This function computes the IVA value of any product based on
      * the percentage that the goverment has issued, currently 12%
      * @param amount This is PVP of the product you are selling
      * @return The IVA of the PVP that the system will charge fot tax declaration 
      */
    
    public static float computeIva(float amount){
        float ivaValue;
        ivaValue = amount * taxPercentage/100;
        return ivaValue;
    }
    
    /**
     * compute the total price of products that need to add the IVA
     * @param amount the PVP
     * @return The total price that will be charged to the costumer
     */
    
    public static float totalPrice(float amount){
        float total;
        total = amount + computeIva(amount);
        return total;
    }
}
