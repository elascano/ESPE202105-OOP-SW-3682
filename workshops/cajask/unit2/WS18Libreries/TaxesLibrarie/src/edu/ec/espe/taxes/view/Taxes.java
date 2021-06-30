/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ec.espe.taxes.view;

import ec.edu.espe.utls.Tax;



/**
 *
 * @author Lizbeth Cajas
 */
public class Taxes {
    public static void main(String[] args) {
        float amount =10.00F;// iva =$1.20
        float iva;
        
        
        float total;
        
        
        iva = Tax.computeIva(amount);
        
        System.out.println("The iva of -> "+amount+"<- is : "+iva);
        
        total =Tax.computeTotalPrice(amount);
        System.out.println("The total price of ->"+amount+"<- is :"+ total);
    }
}
