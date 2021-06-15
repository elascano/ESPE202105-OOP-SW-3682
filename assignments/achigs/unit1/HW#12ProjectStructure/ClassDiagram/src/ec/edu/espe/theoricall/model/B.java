/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoricall.model;

import java.util.ArrayList;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
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
    
    
    
    public C m1(F f){
        int j = 35;
        System.out.println("inside method B.m1, that receives an object f->"
                + f + "adn returns a C object");
        return new C(j);
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
