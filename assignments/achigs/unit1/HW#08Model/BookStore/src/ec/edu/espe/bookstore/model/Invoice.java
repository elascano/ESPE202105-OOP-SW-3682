/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

/**
 *
 * @author MILTON
 */
public class Invoice {
    private boolean mandatoryIssuance;
            
            
    public void broadcast(){
        
    }
    public void cancel(){
        
    }

    /**
     * @return the mandatoryIssuance
     */
    public boolean isMandatoryIssuance() {
        return mandatoryIssuance;
    }

    /**
     * @param mandatoryIssuance the mandatoryIssuance to set
     */
    public void setMandatoryIssuance(boolean mandatoryIssuance) {
        this.mandatoryIssuance = mandatoryIssuance;
    }

}
