/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class Tax {
      private static float taxPercentaje = 12.0F;
    
    /**
     * This function compute the IVA value of any product bases on the percentage
     * that the goverment has issued,currently 12%
     * @param amount this is the PVP of the product you are selling
     * @return the IVA of the PVP that the system will charge for tax declaration.
     *
     */
    
    public static float computeIva(float amount){
        float ivaValue;
        ivaValue = amount * taxPercentaje /100;
        return ivaValue;
    
    }
    /**
     * compute the toal price of products that need to add the IVA
     * @param amount the PVP
     * @return The total price that will be charged to the costumer
     */
    
    public static float computeTotalPrice(float amount){
        float total;
        total = amount + computeIva(amount);
        return total;
    
    }

    
}
