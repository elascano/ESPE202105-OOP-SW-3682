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
public class E {
    
    private int s;
    private float q;

    public E(int s, float q) {
        this.s = s;
        this.q = q;
    }

    @Override
    public String toString() {
        return "E{" + "s=" + s + ", q=" + q + '}';
    }

    
    
    /**
     * @return the s
     */
    public int getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(int s) {
        this.s = s;
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
