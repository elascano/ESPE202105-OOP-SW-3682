/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Isaac Escobar Innovacode
 */
public class UsTax {

    private static UsTax instance;
    private float taxPercentage;

    private UsTax() {
        taxPercentage = 6.1F;

    }

    public static UsTax getInstance() {
        if (instance == null) {
            instance = new UsTax();
        }
        return instance;

    }

    public float ComputeSalesTotal(float amount) {
        float ivaValue;
        float total;

        ivaValue = amount * taxPercentage / 100;
        total = amount + ivaValue;

        return total;
    }

    public float getTaxPercentage() {

        return taxPercentage;

    }

    
}
