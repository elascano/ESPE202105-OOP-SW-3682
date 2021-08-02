/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.question22.model;

/**
 *
 * @author 59399
 */
public class F {
    
    private float p;
    private int t;

    public F(float p, int t) {
        this.p = p;
        this.t = t;
    }

    @Override
    public String toString() {
        return "F{" + "p=" + p + ", t=" + t + '}';
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
     * @return the t
     */
    public int getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(int t) {
        this.t = t;
    }
    
    
    
}
