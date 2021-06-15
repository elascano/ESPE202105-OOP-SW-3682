/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

import java.util.ArrayList;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class A {
    private B b;
    private ArrayList<C> cs = new ArrayList<>();
    private int i;
    
    public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }
    
    public A(B b,int i,ArrayList<C> cs){  //constructor
          this.b = b;
          this.i = i;
          this.cs = cs;
      }
     
     
    public C m(D d){
         System.out.println("Inside method m(d) reciving parameter d -> " 
                 + d + "adn returning a C object");
        return new C();
     }
    
     public D m(){
         System.out.println("Inside method m() that returns a D object");
         return new D();
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
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }
    
}
