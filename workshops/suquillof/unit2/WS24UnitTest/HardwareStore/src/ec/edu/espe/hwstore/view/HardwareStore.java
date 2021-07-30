/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hwstore.view;

import utils.Tax;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class HardwareStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float price = 100.0F;
        float total;
        total = Tax.computeIva(price);
        System.out.println("Total price " + Tax.computeTotalPrice(price));
    }
    
    
}
