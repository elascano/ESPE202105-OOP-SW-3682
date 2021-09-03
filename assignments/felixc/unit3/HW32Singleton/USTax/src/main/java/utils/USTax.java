/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
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
    
    public float getTaxPercentage(){
        
        return taxPercentage;
}

    public float computeTotal(float amount) {
        float ivaValue;
        float total;

        ivaValue = amount * taxPercentage / 100;
        total = amount + ivaValue;

        return total;
    }

}
