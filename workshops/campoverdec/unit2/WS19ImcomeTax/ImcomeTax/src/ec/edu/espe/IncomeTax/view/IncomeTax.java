/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.IncomeTax.view;

import ec.edu.espe.utils.IncomeTaxes;

public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float amount=3200.0F;
        float incomeTax;
      
        
        incomeTax = IncomeTaxes.computeIncomeTax(amount);
        System.out.println("the income tax is ->" + incomeTax);
       
    }
    
}
