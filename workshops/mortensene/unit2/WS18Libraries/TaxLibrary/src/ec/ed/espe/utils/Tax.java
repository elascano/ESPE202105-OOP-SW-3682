/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ed.espe.utils;

/**
 *
 * @author Eduardo Mortensen the programers
 */
public class Tax {
  private static float taxPercentage = 12.0F;
  /**
   * This function computes the IVA value of any product based on
   * the percentage that the goverment has issued, currently 12%
   * @param amount This is the PVP that the system will charge for tax declaration
   */  
    public static float computeIva(float amount){
        float ivaValue;
        ivaValue = amount * taxPercentage / 100;
        return ivaValue;
      /**
   * compute the total price of products that need to add the IVA 
   * @param amount the PVP
   * @RETURN The total pricethat will be charged to the costumer
   */     
    }
    public static float computeTotalPrice(float amount){
        float total;
        total = amount + computeIva(amount);
        return total;
    }
    //read
    
    //write
    
    //add
    
    //find
}
