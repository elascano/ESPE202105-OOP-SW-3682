/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.quiestion22.model;

import java.util.ArrayList;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class A {
    private int a;
    private int b;
    
    private A a1;
    
    private A[] as = new A[1];
 

    public A(int a, int b, A a1,B[] bs,ArrayList<C> cs ){
        this.a = a;
        this.b = b;
        this.a1 = a1;
       
    }

    @Override
    public String toString() {
        return "A{" + "a=" + getA() + ", b=" + getB() + ", a1=" + getA1() + ", as=" + getAs() + '}';
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
     * @return the a1
     */
    public A getA1() {
        return a1;
    }

    /**
     * @param a1 the a1 to set
     */
    public void setA1(A a1) {
        this.a1 = a1;
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
    
    
}
