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
public class B {
  private int a;
  private int b;
  private ArrayList<E> es = new ArrayList<E>();

    public B(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public B() {
    }
  
    

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public ArrayList<E> getEs() {
        return es;
    }

    public void setEs(ArrayList<E> es) {
        this.es = es;
    }
  
  public C m1(F  f){
      System.out.println("inside method B.m(), that receives an object f -> " +f+ "and returns a C object");
      return new C();
  }
}
