/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.q22.model;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class A {
    private int a;
    private A aa;

    public A(int a,A aa) {
        this.a = a;
        this.aa = aa;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the aa
     */
    public A getAa() {
        return aa;
    }

    /**
     * @param aa the aa to set
     */
    public void setAa(A aa) {
        this.aa = aa;
    }
}
