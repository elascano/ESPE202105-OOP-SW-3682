/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclass.model;

import java.util.ArrayList;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class E extends B { //1

    private float p; //1
    private float q; //1

    @Override
    public String toString() {
        return "E{"+super.toString()+ "p=" + p + ", q=" + q + '}';
    }

    public E() {
    }


    public E(float p, float q, float f, double d, ArrayList<G> gs) { //1
        super(f, d, gs);
        this.p = p;
        this.q = q;
    }
    

    public int m1(boolean b) {  //1
        return 0;
    }

    @Override
    public int operation1(int n) {  //1
        return n;

    }

    @Override
    public float operation2(float f) { //1
        return f;
    }
//2
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
