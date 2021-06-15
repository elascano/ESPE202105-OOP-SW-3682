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
public class A {
    private B b;
    private ArrayList<C> cs = new ArrayList<>();
   private int i;
   
  
  public C m(D d){
      System.out.println("inside method A.m() reciving paremeter d and returning a C object");
  return new C();
  } 
  
  public D m(){
      System.out.println("inside method A.m() reuturning object D");
  return new D();
  }
  public int getI() {
        return i;
    }
public void setI( int i) {
        this.i = i;
    }

    /**
     * @return the b
     */
    public B getB() {
        return b;
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
