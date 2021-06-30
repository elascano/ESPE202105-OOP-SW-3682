/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class Tax {

    private static float taxPercentege = 12.0F;

    /**
     * This function computes the IVA value of any product based on the
     * percentege that government has issued, currently 12%
     *
     * @param amount This is the pvp of the product you are selling
     * @return Yhe iva of the pvp that the system will charge for tax
     * declaration
     */
    public static float computeIva(float amount) {
        float ivaValue;
        ivaValue = amount * taxPercentege / 100;
        return ivaValue;
    }
    /**
     * Compute the total price of products that need to add the IVA
     * @param amount the PVP
     * @return The total price that will be charged to the customer
     */
    public static float totalPrice(float amount) {
        float total;
        total = amount + computeIva(amount);
        return total;
    }
}
