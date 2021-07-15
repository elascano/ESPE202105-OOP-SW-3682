/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class A {
    private int a;
    private int b;
    private A as[] = new A[2];
    private B bs[] = new B[5];
    private ArrayList<C> cs = new ArrayList<>();

    public A(int a, int b, A[] as, B[] bs, ArrayList<C> cs) {
        this.a = a;
        this.b = b;
        this.as = as; //this may not work
        this.bs = bs; //this may not work
        this.cs = cs;
    }

    private A() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public A m(int m, int n){ //0,5 Object A must receive parameters
        return new A();
    }
    
    public A m(){ //0,5 Object A must receive parameters
        return new A();
    }
    
    @Override
    public String toString() {
        return "A{" + "a=" + a + ", b=" + b + ", as=" + as + ", bs=" + bs + ", cs=" + cs + '}';
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
