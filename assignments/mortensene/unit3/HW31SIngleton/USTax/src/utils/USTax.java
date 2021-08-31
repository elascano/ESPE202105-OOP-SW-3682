/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Eduardo
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
    

    public float ComputeSalesTotal(float amount) {
        float ivaValue;
        float total;

        ivaValue = amount * getTaxPercentage() / 100;
        total = amount + ivaValue;

        return total;
    }

    public float getTaxPercentage() {

        return taxPercentage;

    }

    /**
     * @param aInstance the instance to set
     */
    public static void setInstance(USTax aInstance) {
        instance = aInstance;
    }

    /**
     * @param taxPercentage the taxPercentage to set
     */
    public void setTaxPercentage(float taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

}
