/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.quiestion22.model;

import ec.edu.espe.quiestion22.controller.H;
import java.util.ArrayList;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class B extends A {
    private int c;
    private int d;
    private ArrayList<H> hs = new ArrayList<>();

    public B(int a, int b, A a1, B[] bs, ArrayList<C> cs) {
        super(a, b, a1, bs, cs);
    }

   

    @Override
    public String toString() {
        return "B{" + "c=" + getC() + ", d=" + getD() + ", hs=" + getHs() + '}';
    }

    /**
     * @return the c
     */
    public int getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(int c) {
        this.c = c;
    }

    /**
     * @return the d
     */
    public int getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(int d) {
        this.d = d;
    }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {
        this.hs = hs;
    }
    
    
}
