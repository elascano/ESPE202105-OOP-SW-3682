/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.incomeTax.model;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class FinancialPerson {
    
    private String name;
    private float mensualSalary;
    private float anualSalary;
    private float incomeTax;

    public FinancialPerson() {
    }
    
    

    public FinancialPerson(String name, float mensualSalary, float anualSalary, float incomeTax) {
        this.name = name;
        this.mensualSalary = mensualSalary;
        this.anualSalary = anualSalary;
        this.incomeTax = incomeTax;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the mensualSalary
     */
    public float getMensualSalary() {
        return mensualSalary;
    }

    /**
     * @param mensualSalary the mensualSalary to set
     */
    public void setMensualSalary(float mensualSalary) {
        this.mensualSalary = mensualSalary;
    }

    /**
     * @return the anualSalary
     */
    public float getAnualSalary() {
        return anualSalary;
    }

    /**
     * @param anualSalary the anualSalary to set
     */
    public void setAnualSalary(float anualSalary) {
        this.anualSalary = anualSalary;
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
    
    
}
