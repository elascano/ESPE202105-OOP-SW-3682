/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.model;

import java.util.ArrayList;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class A {
    private B b;
    private ArrayList<C> cs = new ArrayList<C>();
    private int i;

    public A() {
    }
    
    
    
    public D m(){
        System.out.println("inside method A.m() that return a D object");
        return new D();
    }
    
    public C m(D d){
        System.out.println("inside method A.m(d) received parameter d --> " +d+ " and returning a C object");
        return new C();
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public ArrayList<C> getCs() {
        return cs;
    }

    public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }
}
