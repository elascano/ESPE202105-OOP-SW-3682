/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclass.model;

import java.util.ArrayList;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public abstract class B {
    private float b;
    private double d;
    private ArrayList<G>gs = new ArrayList<>();
   

    public B(float b, double d) {
        this.b = b;
        this.d = d;
    }

    @Override
    public String toString() {
        return "B{" + "b=" + b + ", d=" + d + ", gs=" + gs + '}';
    }
    
   
    
    public abstract int operation1(int n);
    
    public abstract float operation2(float f);

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
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

    /**
     * @return the gs
     */
    public ArrayList<G> getGs() {
        return gs;
    }

    /**
     * @param gs the gs to set
     */
    public void setGs(ArrayList<G> gs) {
        this.gs = gs;
    }
}
