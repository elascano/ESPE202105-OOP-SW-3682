/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ustax.model;

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

    public float computeSalesTotal(float amount) {
        float ivaValue;
        float totalPrice;

        if (amount > 0) {
            ivaValue = amount * taxPercentage / 100;
            totalPrice = ivaValue + amount;
        }else{
            totalPrice = 0;
        }
        return totalPrice;
    }

    public float getTaxPercentage() {
        return taxPercentage;
    }
}
