/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.harwarestore.view;

import ec.edu.espe.harwarestore.model.Product;
import utils.Tax;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class HardwareStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float price = 100.00F;
        float total;
        total = Tax.computotalPrice(price);
        System.out.println("Total price: " + total);
        
        Product product = new Product(0, "Screw Driver", price);
        System.out.println("The product: " + product.getDescription() + "That cost" + product.getPrice() + "its final price is-> " + product.getTotalPrice());
        
        
    }
    
}
