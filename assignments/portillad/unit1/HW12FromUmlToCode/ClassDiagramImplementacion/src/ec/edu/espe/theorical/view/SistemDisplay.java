/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.view;


import ec.edu.espe.theoretical.model.*;
import java.util.ArrayList;
/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class SistemDisplay {
    public static void main(String[] args) {
        System.out.println("Setter Getters and Constructors Diego Portilla");
        
        int i;
        A a;
        D d;
        C c;
        E e;
        F f;
        
        String s;
        B b =new B();
        ArrayList<C> cs =new ArrayList<>();
        
        i=20;
        a= new A(b,i,cs);
        b = new B();
        d = new D();
        e = new E();
        f = new F();
        
        d = a.m();
        
        System.out.println("d-> " + d);
        
        System.out. println ( "object a to atributes ->");
        System.out. println ( "a.i-> "+ a.getI());
        System.out. println ( "object e to atributes ->");
        System.out. println ( "e.s-> "+ e.getS());
        System.out. println ( "object b to atributes ->");
        System.out. println ( "b.s-> "+ b.getS());
        System.out. println ( "object d to atributes ->");
        System.out. println ( "d.s-> "+ d.getS());
        System.out. println ( "object f to atributes ->");
        System.out. println ( "f.s-> "+ f.gets());
        
        a.setI(10);
        System.out.println("objects a attributes ->");
        System.out.println("a.i ->" + a.getI());
        System.out.println("a.s -> " + e.getS());
        
        s = new String("hello");
        s = "hello";
        System.out.println("s " + s);
        
        e = new E(s);
        System.out.println("objects a attributes ->");
        System.out.println("a.s -> " + e.getS()); 
    }

    private static class F {
         private String s;
    
    public F() {
           s = "using constructor in F ";
    }
        
        
    public F(String s){
        this.s =s;
    }  
    public String gets() {
        return s;
    }
    public void sets(String s) {
        this.s = s;
    }
    
    
    
 private double d;

    /**
     * @return the d
     */
   public double getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(double d) {
        this.d = d;
    }   
        
   }
}
