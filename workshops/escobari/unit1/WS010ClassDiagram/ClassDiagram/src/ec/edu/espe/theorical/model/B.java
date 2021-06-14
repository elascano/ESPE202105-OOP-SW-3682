/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.model;

import java.util.ArrayList;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
class B {

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
    private int a;
    private int b;
    ArrayList<E> es= new ArrayList();
    
    
    
    public C m1(F f){
        System.out.println("inside method B.m1), that receive an objects f ->"
                + f + "and returns a C object");
        return new C();
    }
    
    
}
