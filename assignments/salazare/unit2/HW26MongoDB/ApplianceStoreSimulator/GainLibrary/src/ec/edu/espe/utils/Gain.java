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
public class Gain {
    /**
     * This function calculates the total profit of the chosen product
     * @param price This is the price of the product
     * @param minimumGain
     * @return The profit to calculate the net profit
     */
    public static float computeGain(float price,float minimumGain){
        float gain;
        gain = price +(price*minimumGain);
        return gain;
        
    }
    /**
     * Calculate the net price of the product without profit
     * @param price The product
     * @param minimumGain
     * @return netPrice applied to the product
     */
    public static float netPrice(float price,float minimumGain){
        float netPrice;
        netPrice = computeGain(price,minimumGain) - (computeGain(price,minimumGain)* minimumGain);
        return netPrice;
    }

}
