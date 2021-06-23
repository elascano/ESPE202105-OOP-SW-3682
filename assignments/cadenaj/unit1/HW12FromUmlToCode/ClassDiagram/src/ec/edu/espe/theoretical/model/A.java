/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

import java.util.ArrayList;

/**
 *
 * @author jejoc
 */
public class A {
    private B b;
    private ArrayList<C> cs = new ArrayList<>();
    private int i;

    public A(B b, int i, ArrayList cs) {
        this.b = b;
        this.i = i;
        this.cs = cs;
    }
    
    public C m(D d){
        System.out.println("Inside method A.m(D d), receiving parameter d -> "
                + d + "and returning a C objetc");
        return new C(getI());
    }
    
    public D m(){
        System.out.println("Inside method A.m() that returns a D object");
        return new D(true, getCs());
    }

     /**
     * @return the i
     */
    public int getI() {
        return i;
    }
    
    /**
     * @return the b
     */
    public B getB() {
        return b;
    }

    /**
     * @param i the b to set
     */
    public void setI(int i) {
        this.i = i;
    }
    
    /**
     * @param b the b to set
     */
    public void setB(B b) {
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
}
