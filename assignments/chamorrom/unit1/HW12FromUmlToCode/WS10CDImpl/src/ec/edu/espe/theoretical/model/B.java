/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

import java.util.ArrayList;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class B {
 private int a;
 private int b;
 private ArrayList<E> es = new ArrayList<>();

    public B(int a, int b, ArrayList<E> es) {
        this.a = a;
        this.b = b;
        this.es = es;
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
     * @return the es
     */
    public ArrayList<E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList<E> es) {
        this.es = es;
    }
 
 public C m1(F f){
     System.out.println("inside B.method1(f), receiving parameter F ->"
            + f + " and returning a C object ");
     return new C(0);
 }
 
}
