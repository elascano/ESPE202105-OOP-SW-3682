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
public class A {

    private int a; //1
    private int b; //1
    //private A a1; 0
    private ArrayList<C> cs; //incomplete  0.5
    private B bs[]= new B[5] ; //1
    
    @Override
    public String toString() {
        return "A{" + "a=" + a + ", b=" + b + ", cs=" + cs + ", bs=" + bs + '}'; //0.7 luck the methods 
    }

    public A(int a, int b, ArrayList<C> cs,B bs[]) { //0.90
        this.a = a;
        this.b = b;
        //this.a1=a1 incomplete
        //this.bs=bs // this may not work 
        this.cs = cs;
        this.bs = bs;
    }

    public A() {
    }
    
    

    public A m(int n, int m) { //1
        return new A();
    }
     public A m() { //1
        return new A();
    }
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
}
