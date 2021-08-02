/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.utils;

/**
 *
 * @author Asmal Kevin 
 */
public class Tax {
    static float ivaPercentage = 12.00F;
    static float gainPercentage = 8.00F;
    
    public static float computeIva(float price){
        if(price<=0){
            return 0;
        }
        float ivaValue;
        ivaValue = price * ivaPercentage/100;
        return ivaValue;
    }
    
    public static float computeTotalPrice(float price){
        if(price<=0){
            return 0;
        }
        float totalPrice;
        totalPrice = price + computeIva(price);
        return totalPrice;
    }
    
    public static float computeGain(float price){
        if(price<=0){
            return 0;
        }
        float gain;
        gain = computeTotalPrice(price)*gainPercentage/100;
        return gain;
    }
    
    public static float computePVP(float price){
        if(price<=0){
            return 0;
        }
        float totalPaid;
        totalPaid = computeTotalPrice(price)+computeGain(price);
        return totalPaid;
    }
}
