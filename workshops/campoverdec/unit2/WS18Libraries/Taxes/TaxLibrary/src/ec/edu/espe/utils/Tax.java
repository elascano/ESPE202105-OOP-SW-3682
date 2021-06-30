/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

/**
 *
 * @author Carlos Campoverde EMCL.java ESPE-DCCO
 */
public class Tax {
    /**
     * this funtion computes the iva value of any product based on 
     * the percentage that thhe goverment has issued, currently 12%
     * @param amount This is de PVP of the product you are sellign
     * @return The iva of the PVP the the system will charge fot tax declaration 
     */
    private static float taxPercentage = 12.0F;
    
    public static  float computeIva(float amount){
        float ivaValue;
        ivaValue = amount * taxPercentage /100;
        return ivaValue;
    
    }
    /**
     * compute the total price of products that need to add the IVA 
     * @param amount  the PVP 
     * @return The total price that will be charged to the costumer 
     */
    
    public static float computerTotalPrice(float amount){
        float total;
        total= amount + computeIva(amount);
        return total;
    }
}
