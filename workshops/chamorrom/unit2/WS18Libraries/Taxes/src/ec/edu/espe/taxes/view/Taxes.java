/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.taxes.view;

import ec.edu.espe.utils.Tax;


/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float amount = 10.00F; //1.2
        float iva;
        float total;
        
        
        iva = Tax.computeIva(amount);
      
       
        
        System.out.println("The iva of ->"+ amount + "<- is "+ iva);
        total = Tax.totalPrice(amount);
        System.out.println("The total price of ->"+ amount + "<- is "+ total);
    }
    
}
