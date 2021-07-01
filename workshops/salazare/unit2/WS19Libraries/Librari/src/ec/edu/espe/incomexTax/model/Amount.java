/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.incomexTax.model;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Amount {
    private float totalamount;
    private float amountAnual;
    private float totalPayment;

    public Amount(float totalamount, float amountAnual, float totalPayment) {
        this.totalamount = totalamount;
        this.amountAnual = amountAnual;
        this.totalPayment = totalPayment;
    }
    public Amount() {
        this.totalamount = 0.0F;
        this.amountAnual = 0.0F;
        this.totalPayment = 0.0F;
    }

        
    @Override
    public String toString() {
        return "Amount{" + "totalamount=" + totalamount + ", amountAnual=" + amountAnual + ", totalPayment=" + totalPayment + '}';
    }

    
        
    
    public float getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(float totalamount) {
        this.totalamount = totalamount;
    }

    public float getAmountAnual() {
        return amountAnual;
    }

    public void setAmountAnual(float amountAnual) {
        this.amountAnual = amountAnual;
    }

    public float getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(float totalPayment) {
        this.totalPayment = totalPayment;
    }
}
