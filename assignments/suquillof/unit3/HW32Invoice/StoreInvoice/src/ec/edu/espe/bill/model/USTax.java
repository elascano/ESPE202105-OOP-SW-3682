/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bill.model;

import ec.edu.espe.bill.controller.CalculateTax;



/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class USTax {

    private static USTax instance;
    private float taxPercentage;

    private USTax() {
        taxPercentage = 6.1F;
    }

    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public float computeSalesTotal(float amount) {
        
        float ivaValue;
        float totalTax;

        ivaValue = CalculateTax.computeIva(amount);
        totalTax = CalculateTax.computeTotalPrice(amount,ivaValue);

        return totalTax;
    }

    public float getTaxPercentage() {

        return taxPercentage;

    }

}
