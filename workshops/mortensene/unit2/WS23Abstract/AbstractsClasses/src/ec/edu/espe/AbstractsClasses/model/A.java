/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.AbstractsClasses.model;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class A {
   private int a;
   private int b;
   private A asArray []=new A[1];
   private ArrayList<C>cs=new ArrayList<>();
   private B bsArray []= new B[5];

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" + "a=" + a + ", b=" + b + '}';
    }
    
    
   
   public static void m(int m, int n){
  
   }
   public static void m(){
  
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
}
