/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.mathemathics.model;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class Decimal {
    private float decimalFactOne;
    private float decimalFactTwo;
    private float result;

    public Decimal(float decimalDataOne, float decimalDataTwo, float result) {
        this.decimalFactOne = decimalDataOne;
        this.decimalFactTwo = decimalDataTwo;
        this.result = result;
    }

    /**
     * @return the decimalDataOne
     */
    public float getDecimalDataOne() {
        return decimalFactOne;
    }

    /**
     * @param decimalDataOne the decimalDataOne to set
     */
    public void setDecimalDataOne(float decimalDataOne) {
        this.decimalFactOne = decimalDataOne;
    }

    /**
     * @return the decimalDataTwo
     */
    public float getDecimalDataTwo() {
        return decimalFactTwo;
    }

    /**
     * @param decimalDataTwo the decimalDataTwo to set
     */
    public void setDecimalDataTwo(float decimalDataTwo) {
        this.decimalFactTwo = decimalDataTwo;
    }

    /**
     * @return the result
     */
    public float getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(float result) {
        this.result = result;
    }
    
    
}
