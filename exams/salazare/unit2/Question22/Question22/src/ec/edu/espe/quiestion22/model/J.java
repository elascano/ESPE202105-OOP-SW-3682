/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.quiestion22.model;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class J {
    private String i;

    public J(String i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "J{" + "i=" + getI() + '}';
    }

    /**
     * @return the i
     */
    public String getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(String i) {
        this.i = i;
    }
    
}
