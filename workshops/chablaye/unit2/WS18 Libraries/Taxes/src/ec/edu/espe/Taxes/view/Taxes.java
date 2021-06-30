/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Taxes.view;

import ec.edu.espe.utils.Tax;


/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class Taxes {
    public static void main(String[] args) {
        
        float amount = 10.00F;//$1.20
        float iva;
        float total;
        Tax taxController = new Tax();
        
        iva = Tax.computeIva(amount);
        
        System.out.println("The iva of -> " +amount+ " is " +iva);
        
        total = Tax.totalPrice(amount);
        System.out.println("The total price is: " +total);
        
    }
    
}
