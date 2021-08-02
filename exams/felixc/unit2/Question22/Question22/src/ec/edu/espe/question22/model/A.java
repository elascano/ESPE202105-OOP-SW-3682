/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.question22.model;

/**
 *
 * @author 59399
 */
public class A {
    
    private A a1;
    private A []as = new A[1];

    public A(A a1) {
        this.a1 = a1;
    }

    @Override
    public String toString() {
        return "A{" + "a1=" + a1 + ", as=" + as + '}';
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
