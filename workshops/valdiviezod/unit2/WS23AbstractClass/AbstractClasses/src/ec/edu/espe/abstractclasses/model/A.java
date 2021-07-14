/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclasses.model;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public class A {
    
    private int a;
    private int b;
    private B bs[] = new B[5];
    private A as[] = new A[1];
    private ArrayList<C> cs = new ArrayList<>();

    @Override
    public String toString() {
        return "A{" + "a=" + a + ", b=" + b + ", bs=" + bs + ", as=" + as + ", cs=" + cs + '}';
    }

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public A(){
        a = 0;
        b = 0;
    }
    
    public A m(int m, int n){
        return null;
    }
    
    public A m(){
        return null;
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
     * @return the cs
     */
    public ArrayList<C> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }

}
