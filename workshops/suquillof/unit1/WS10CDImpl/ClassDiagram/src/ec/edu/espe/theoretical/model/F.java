/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class F {
    
    private double d;

    public F(double d) {
        this.d = d;
        
        System.out.println("The value of f.a is : " + d);
    }

    
    /**
     * @return the d
     */
    public double getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(double d) {
        this.d = d;
    }
    
}
