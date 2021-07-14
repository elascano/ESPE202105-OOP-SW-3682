/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class A {
    private int a;
    private int b;
    private A as[] = new A[2];
    private B bs[] = new B[5];
    private ArrayList<C> c = new ArrayList<> ();

    @Override
    public String toString() {
        return "A{" + "a=" + a + ", b=" + b + ", as=" + as + ", bs=" + bs + ", c=" + c + '}';
    }

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void m(int m, int n){
        
    }
    
    public void m(){
        
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
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the as
     */
    public A[] getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(A[] as) {
        this.as = as;
    }

    /**
     * @return the bs
     */
    public B[] getBs() {
        return bs;
    }

    /**
     * @param bs the bs to set
     */
    public void setBs(B[] bs) {
        this.bs = bs;
    }

    /**
     * @return the c
     */
    public ArrayList<C> getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(ArrayList<C> c) {
        this.c = c;
    }
}
