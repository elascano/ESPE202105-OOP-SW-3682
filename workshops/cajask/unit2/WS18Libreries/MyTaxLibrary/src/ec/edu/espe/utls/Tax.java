/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utls;


/**
 *
 * @author Lizbeth Cajas
 */
public class Tax {
     private static float taxPercentage =12.0F;
     /**
      * 
      * @param amount this is the PVP of the product you are selling
      * @return the iva of the PVP the system will charge fot tax declaration 
      */
    
    public static  float computeIva(float amount){
        float ivaValue;
        ivaValue = amount * taxPercentage/100;
        return ivaValue;        
    }
    /**
     * 
     * @param amount the PVP 
     * @return 
     */
    public static float computeTotalPrice(float amount){
        float total;
        total = amount +computeIva(amount);
        return total;
    }
    
   
}
