/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.hardwarestore.view;

import ec.edu.espe.hardwarestore.model.Product;
import ec.espe.edu.hardwarestore.utils.Tax;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class Store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float price = 100.00F;
        float total;
        total = Tax.computeTotalPrice(price);
        System.out.println("total price " + total);
        
        Product product = new Product(0, "Screen Driver", price);
        System.out.println("the product " + product.getDescription() + "  "  
                + " FInal price is -> " + product.getTotalPrice());
    }
    
}
