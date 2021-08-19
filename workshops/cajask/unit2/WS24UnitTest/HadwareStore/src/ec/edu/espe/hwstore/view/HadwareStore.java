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
 * @author Lizbeth Cajas
 */
public class HadwareStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float price = 100.00F;
       float total;
       total = Tax.computeIva(price);
        System.out.println("total price "+ total);
         
        Product product = new Product(0 ,"Screw Driver", price );
        System.out.println("the product"+product.getDescription()+""
                       +"final price is ->"+product.getTotalPrice());
        
    }
    
}
