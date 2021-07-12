/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.taxes.view;
//import utils.Tax;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class Taxes {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        
        float amount = 10.00F;
        float iva;
        float total; 
        
        iva = Tax.computeIva(amount);
        
        
        System.out.println("The iva of ->" + amount + "<- is :" + iva);
        total = Tax.computerTotalPrice(amount);
        System.out.println("The total price of ->" + amount + "<- is :" + total);
    }
    
}
