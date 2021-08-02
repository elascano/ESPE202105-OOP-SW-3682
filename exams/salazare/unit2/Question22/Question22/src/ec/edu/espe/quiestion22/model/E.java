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
public class E {
    private float f;
    private double d;

    public E(float f, double d) {
        this.f = f;
        this.d = d;
    }

    @Override
    public String toString() {
        return "E{" + "f=" + getF() + ", d=" + getD() + '}';
    }

    /**
     * @return the f
     */
    public float getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(float f) {
        this.f = f;
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
