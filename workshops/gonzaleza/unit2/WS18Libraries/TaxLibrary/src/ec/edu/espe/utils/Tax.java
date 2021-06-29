/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class Tax {
    private static float taxPercentage = 12.0F;
    
    /**
     * This function computes the IVa value of any product based on 
     * the percentage that the government has issued, currently 12%.
     * @param amount This is the PVP of the product you are selling
     * @return The IVA of the PVP that the system will charge for taxes declaration
     */
    public static float computeIva(float amount){
        float ivaValue;
        ivaValue = amount * taxPercentage / 100;
        return ivaValue;
    }
    
    /**
     * Compute the total price of products thtat need to add the IVA.
     * @param amount The PVP
     * @return The total price that will be charged to the customer
     */
    public static float computeTotalPrice(float amount){
        float total;
        total = amount + computeIva(amount);
        return total;
    }
}
