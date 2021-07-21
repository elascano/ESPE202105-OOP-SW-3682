/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.harwarestore.view;

import ec.espe.edu.harwarestore.model.Product;
import utils.Tax;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
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
        
        Product product = new Product(0,"Screw Drive" , price);
        System.out.println("the product " + product.getDescription() + "thata cost->" +product.getSalePrice() +
                ", its final price ->" + product.getTotalPrice());
        
    }
    
}
