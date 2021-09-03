/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hwstore.view;

import ec.edu.espe.hwstore.model.Product;
import utils.Tax;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class HardwareStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(" HARDWARE STORE pepito");
        System.out.println(" Show products");
        System.out.println(" Sell Products");
        System.out.println(" Pay for products");
        
        
        
        
        float price = 2000.00F;
        float total;
        total = Tax.computeTotalPrice(price);
        System.out.println("total price " + total);
        
        
        Product product = new Product(0, "Screw Driver", price);
        System.out.println("the product " + product.getDescription() + " that costs " + product.getPrice()
                + ", its final price is -> " + product.getTotalPrice() );
        //100.00 -> 120.0 -> 134.40
        
    }
    
}
