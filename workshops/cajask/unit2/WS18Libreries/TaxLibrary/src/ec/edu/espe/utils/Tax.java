/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

/**
 *
 * @author Lizbeth Cajas Sanamed ESPE-DCCO
 */
public class Tax {
    private static float taxPercentage = 12.0F;
    
    /**
     * This fnction computes de iva value of any product based on 
     * the porcentage that the goverment has issued, currently 12%
     * @param amount this is the PVP of the prduct you are selling
     * @return The iva of the PVP that the System will charge for taxes declaration
     */
    public static float computeIva(float amount){
        float ivaValue;
        ivaValue = amount * taxPercentage/100;
        return ivaValue;
    }
    
    /**
     * compute the toal price of products that need to add the IVA
     * @param amount the PVP
     * @return The total price that will be charged to the customer
     */
    public static float computeTotalPrice(float amount){
        float total;
        total = amount + computeIva(amount);
        return total;
    }
}
