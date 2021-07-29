/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.incometax.model;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class Amount {
    
    private float monthly;
    private float annual;
    private float amountPayable;

    @Override
    public String toString() {
        return "Amount{" + "monthly=" + monthly + ", annual=" + annual + ", amountPayable=" + amountPayable + '}';
    }

    public Amount(float annual, float monthly, float amountPayable) {
        this.monthly = monthly;
        this.annual = annual;
        this.amountPayable = amountPayable;
    }

    public Amount(){        
        monthly = 0.0F;
        annual = 0.0F;  
        amountPayable = 0.0F;
    }
    
    public float calculateAnnual(float monthly){ 
        float amountAnnual;
        amountAnnual = monthly * 12.0F;
        return amountAnnual;
    }
  
    /**
     * @return the annual
     */
    public float getAnnual() {
        return annual;
    }

    /**
     * @param annual the annual to set
     */
    public void setAnnual(float annual) {
        this.annual = annual;
    }

    /**
     * @return the monthly
     */
    public float getMonthly() {
        return monthly;
    }

    /**
     * @param monthly the monthly to set
     */
    public void setMonthly(float monthly) {
        this.monthly = monthly;
    }

    /**
     * @return the amountPayable
     */
    public float getAmountPayable() {
        return amountPayable;
    }

    /**
     * @param amountPayable the amountPayable to set
     */
    public void setAmountPayable(float amountPayable) {
        this.amountPayable = amountPayable;
    }

   
}
