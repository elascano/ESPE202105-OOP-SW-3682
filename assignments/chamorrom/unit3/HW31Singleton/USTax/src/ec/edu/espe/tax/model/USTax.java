/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax.model;

import utils.Tax;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class USTax {

    private static USTax instance;

    public static USTax getInstace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
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
