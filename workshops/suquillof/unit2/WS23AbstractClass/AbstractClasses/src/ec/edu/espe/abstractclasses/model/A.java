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
 */
public class A {
    
    private int a;//1
    private int b;//1
    private B bs[] = new B[5];//1
    private A as[] = new A[1];//1
    private ArrayList<C> cs = new ArrayList<>();//1

    @Override
    public String toString() {//1
        return "A{" + "a=" + a + ", b=" + b + ", bs=" + bs + ", as=" + as + ", cs=" + cs + '}';
    }

    public A(int a, int b) {//0.6
        this.a = a;
        this.b = b;
    }
    //missing the arrayList and strings

    public A(){
        a = 0;
        b = 0;
    }
    
    public A m(int m, int n){//0.5
        return null;
    }
    
    public A m(){//0.5
        return null;
    }
    //not return parameters
    //1
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
