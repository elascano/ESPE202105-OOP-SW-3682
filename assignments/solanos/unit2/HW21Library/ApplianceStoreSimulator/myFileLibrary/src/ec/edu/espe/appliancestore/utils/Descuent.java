/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.utils;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class Descuent {
    private static float Productdescuent = 0.15F;
    
    public static float computeDescuent(float price){
        float descuent;
        descuent = price * Productdescuent ;
        return descuent;
    }
    
    
    public static float computeTotalPrice(float price){
        float total;
        total = price - computeDescuent(price);
        return total;        
    }
    
}
