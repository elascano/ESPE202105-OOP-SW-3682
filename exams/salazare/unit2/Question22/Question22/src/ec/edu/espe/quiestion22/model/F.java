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
public class F {
    private float h;
    private double g;

    public F(float h, double g) {
        this.h = h;
        this.g = g;
    }

    @Override
    public String toString() {
        return "F{" + "h=" + getH() + ", g=" + getG() + '}';
    }

    /**
     * @return the h
     */
    public float getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(float h) {
        this.h = h;
    }

    /**
     * @return the g
     */
    public double getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(double g) {
        this.g = g;
    }
    
    
}
