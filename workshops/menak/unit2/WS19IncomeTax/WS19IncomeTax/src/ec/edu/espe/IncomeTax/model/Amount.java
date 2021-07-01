package ec.edu.espe.IncomeTax.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class Amount {
    
    
    private float mensualAmount;
    private float annualSAmount;
    private float incomeTax;

   
    
    public Amount(float mensualAmount, float annualSAmount, float incomeTax) {
        this.mensualAmount = mensualAmount;
        this.annualSAmount = annualSAmount;
        this.incomeTax = incomeTax;
    }
    
    public Amount(){ 
        
        mensualAmount = 0.0F;
        annualSAmount = 0.0F;  
        incomeTax = 0.0F;
    }
    
    @Override
    public String toString() {
        return "Amount{" + "mensualAmount=" + mensualAmount + ", annualSAmount=" + annualSAmount + ", incomeTax=" + incomeTax + '}';
    }

    /**
     * @return the mensualAmount
     */
    public float getMensualAmount() {
        return mensualAmount;
    }

    /**
     * @param mensualAmount the mensualAmount to set
     */
    public void setMensualAmount(float mensualAmount) {
        this.mensualAmount = mensualAmount;
    }

    /**
     * @return the annualSAmount
     */
    public float getAnnualSAmount() {
        return annualSAmount;
    }

    /**
     * @param annualSAmount the annualSAmount to set
     */
    public void setAnnualSAmount(float annualSAmount) {
        this.annualSAmount = annualSAmount;
    }

    /**
     * @return the incomeTax
     */
    public float getIncomeTax() {
        return incomeTax;
    }

    /**
     * @param incomeTax the incomeTax to set
     */
    public void setIncomeTax(float incomeTax) {
        this.incomeTax = incomeTax;
    }

    public float calculateAnnualAmount(float mensualAmount) {
        
        float Annual;
        Annual = mensualAmount * 12.0F;
        return Annual;
        
    }
    
    
        
  
    
}
