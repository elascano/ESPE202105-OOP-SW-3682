/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

import java.util.ArrayList;

/**
 *
 * @author Cristian Felix InnovaCode ESPE-DCC
 */
public class A {

     private B b; //Attributes
     private ArrayList<C> cs = new ArrayList<>();
      private int i;
      
      public A(B b,int i,ArrayList cs){  //constructor
          this.b = b;
          this.i = i;
          this.cs = cs;
      }
     
     
     public C m(D d){
         System.out.println("Inside method m(d) reciving parameter d -> " 
                 + d + "and returning a C object");
         return new C(i);
     }
    
     public D m(){
         System.out.println("Inside method m() that returns a D object");
         return new D(true, cs);
     }
    /**
     * @return the b
     */
    public B getB() {
        return b;
    }
    
    
     public int getI() {
        return i;
    }

    /**
     * @param b the b to set
     */
    public void setB(B b) {
        this.b = b;
    }

     public void setI(int i) {
        this.i = i;
    }
    /**
     * @return the cs
     */
    public ArrayList<C> getCs() {
        return cs;
    }
    
     public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }

    /**
     * @param cs the cs to set
     */
    
}
