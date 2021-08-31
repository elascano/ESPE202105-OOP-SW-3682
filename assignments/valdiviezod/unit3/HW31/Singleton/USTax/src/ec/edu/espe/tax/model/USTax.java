/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax.model;

import utils.Tax;

/**
 *
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
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

        ivaValue = Tax.computeIva(amount);
        totalTax = Tax.computeTotalPrice(amount);

        return totalTax;
    }
    
    public float getTaxPercentage(){
        
        return taxPercentage;
        
    }
    
    
}
