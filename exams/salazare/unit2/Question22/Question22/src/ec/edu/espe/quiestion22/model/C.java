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
public class C extends A {
    private int a;
    private int b;
    private ArrayList<E> es = new ArrayList<>();

    public C(int a, int b, A a1, B[] bs, ArrayList<C> cs) {
        super(a, b, a1, bs, cs);
    }

   

    @Override
    public String toString() {
        return "C{" + "a=" + getA() + ", b=" + getB() + ", es=" + getEs() + '}';
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
    
}
