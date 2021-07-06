/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.utils;

/**
 *
 * @author 59399
 */
public class Amount {
    private float taxBase;
    private float annualIncome;
    private float incomeTax;
    private float salary;

    public Amount(float taxBase, float annualIncome, float incomeTax, float salary) {
        this.taxBase = taxBase;
        this.annualIncome = annualIncome;
        this.incomeTax = incomeTax;
        this.salary = salary;
    }
    public Amount() {
        this.taxBase = 0.0F;
        this.annualIncome = 0.0F;
        this.incomeTax = 0.0F;
        this.salary = 0.0F;
    }

    /**
     * @return the taxBase
     */
    public float getTaxBase() {
        return taxBase;
    }

    /**
     * @param taxBase the taxBase to set
     */
    public void setTaxBase(float taxBase) {
        this.taxBase = taxBase;
    }

    /**
     * @return the annualIncome
     */
    public float getAnnualIncome() {
        return annualIncome;
    }

    /**
     * @param annualIncome the annualIncome to set
     */
    public void setAnnualIncome(float annualIncome) {
        this.annualIncome = annualIncome;
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

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
}
