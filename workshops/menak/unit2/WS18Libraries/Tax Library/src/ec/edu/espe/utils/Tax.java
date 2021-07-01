/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class Tax {
    
    private static float taxPercentage = 12.0F;
    
    /**
     * This function computes the IVA value of any products based on the percentage
     * that the government has issued, currently 12%
     * @param amount This is the PVP of the products you are selling
     * @return The IVA of the PVP that the system will charge for tax declaration
     */
    public static float computeIva(float amount){
        
        float ivaValue;
        ivaValue = amount * taxPercentage /100;
        return ivaValue;
        
    }
    /**
     * Compute the total price of products that need to add the IVA
     * @param amount the PVP
     * @return The total price that will be tharget to the custimer
     */
    public static float computeTotalPrice(float amount){
        float total;
        total = amount + computeIva(amount);
        return total;
    }
    
}
