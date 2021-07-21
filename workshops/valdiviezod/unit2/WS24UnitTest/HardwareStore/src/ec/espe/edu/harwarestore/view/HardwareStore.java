/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.harwarestore.view;

import utils.Tax;

/**
 *
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public class HardwareStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        float price =100.00F;
        float total;
        total= Tax.computeTotalPrice(price);
        System.out.println("total price " +total);
        
        
    }
    
}
