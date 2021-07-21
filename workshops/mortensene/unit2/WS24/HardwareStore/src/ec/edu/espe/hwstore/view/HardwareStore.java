/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hwstore.view;

import Utils.Tax;

/**
 *
 * @author Eduardo Mortensen ESPE-
 */
public class HardwareStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float price =1.5F;
        float total;
        total= Tax.computeTotalprice(price);
        System.out.println("total "+total);
        // TODO code application logic here
    }
    
    //TEST CASES
    // input/s     expected result
}
