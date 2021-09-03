/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax.view;

import ec.edu.espe.tax.model.USTax;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Calculator {
    public static void main(String [] args){
        float price = 100.0F;
        float total;
        
        USTax usTax = USTax.getInstance();
        
        total=usTax.computeSalesTotal(price);
        System.out.println("SalesTotal->" + total);
        
    }
}
