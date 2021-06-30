/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

import java.util.Scanner;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class Gain {
      
    private static float minimumGain = 200.50F;
    /**
     * This function calculates the total profit of the chosen product
     * @param price This is the price of the product
     * @return The profit to calculate the net profit
     */
    public static float computeGain(float price){
        float gain;
        gain = price - minimumGain;
        return gain;
        
    }
    /**
     * Calculate the net price of the product without profit
     * @param price The product
     * @return netPrice applied to the product
     */
    public static float netPrice(float price){
        float netPrice;
        netPrice = price - computeGain(price);
        return netPrice;
    }
     
}
