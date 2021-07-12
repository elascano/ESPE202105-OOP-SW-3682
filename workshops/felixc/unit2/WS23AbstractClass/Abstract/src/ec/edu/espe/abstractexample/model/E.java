/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractexample.model;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class E extends B {
    private float p;
    private float q;

    public E(float p, float q, float f, double d) {
        super(f, d);
        this.p = p;
        this.q = q;
    }

    public E() {
    }
    
    public int m1(boolean b){
        return 0;
    }
    
    @Override
    public String toString() {
        return "E{" + super.toString() + "p=" + p + ", q=" + q + '}';
    }

    @Override
    public int operation1(int n) {
        return 1;
    }

    @Override
    public float operation2(float f) {
        return 0.0F;
    }

    /**
     * @return the p
     */
    public float getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(float p) {
        this.p = p;
    }

    /**
     * @return the q
     */
    public float getQ() {
        return q;
    }

    /**
     * @param q the q to set
     */
    public void setQ(float q) {
        this.q = q;
    }
    
}
