
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.AbstractsClasses.model;

/**
 *
 * @author pc
 */
public class E extends B {
    private float p;
    private float q;

    public E(float f, double d) {
        super(f, d);
    }

    

    @Override
    public String toString() {
        return "E{" + "p=" + getP() + ", q=" + getQ() + '}';
    }
    
    public static void m1(boolean b){
    
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
