/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.json;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Descuent {
    private static float Productdescuent = 0.15F;
    /**
     * The function generates the discount that is generated when making a payment
     * @param price entered or read of each product to make your payment
     * @return  the descuent
     */
    public static float computeDescuent(float price){
        float descuent;
        descuent = price * Productdescuent ;
        return descuent;
    }
    
    /**
     * The function generates the calculation for the respective discount
     * @param price entered or read of each product to make your payment
     * @return a total 
     */
    public static float computeTotalPrice(float price){
        float total;
        total = price - computeDescuent(price);
        return total;        
    }
    
}
