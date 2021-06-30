/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.taxes.view;

import ec.edu.espe.utils.Tax;


/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class Taxes {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float amount = 10.00F;
        float iva;
        Tax taxController = new Tax();
        float total;
        
        iva= taxController.computeIva(amount);
        
        
        
        
        System.out.println("The iva of ->" + amount + " <- is :" + iva);
        
        total = taxController.computeTotalPrice(amount);
        System.out.println("The total price of ->" + amount + "<- Is : " + total);
        
    }
    
}
