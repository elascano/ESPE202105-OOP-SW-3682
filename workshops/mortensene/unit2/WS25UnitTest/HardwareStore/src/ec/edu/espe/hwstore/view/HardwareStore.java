/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hwstore.view;

import Utils.Tax;
import ec.edu.espe.hwstore.model.Product;

/**
 *
 * @author Eduardo Mortensen ESPE-
 */
public class HardwareStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float price = 0;
        float total;
        float difference;
        float summ;
        float addend1=0.0000009F;
        float addend2=0.0000001F;
        float minuend=0.0000009F;
        float subtrahend=0.0000001F;
       difference= Tax.computeSubstract(minuend, subtrahend);
       System.out.println("diffence "+difference);
       
       summ= Tax.computeAddition(addend1, addend2);
       System.out.println("summ "+summ);
       total= Tax.computeTotalprice(price);
        System.out.println("total "+total);
        
        Product product = new Product(0,price, "Screw Driver");
        System.out.println(product.getDescription()+" get total price -->"+product.getTotalPrice());
        // TODO code application logic here
    }
    
    //TEST CASES
    // input/s     expected result
}
