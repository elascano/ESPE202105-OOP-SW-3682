/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.view;

import ec.edu.espe.theorical.model.*;
import java.util.ArrayList;


/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class SystemDisplay {
    
   public static void main (String[]args){
        System.out.println("Setters Getters and Constructors Isaac Escobar");
        //First method constructors
        A a = new A();
        D d= new D();
        C c = new C();
        E e = new E();
        F f = new F();
        //second method initialized and declaration
        B b = new B();
        d = a.m();
        //a.i=10;
        a.setI(10);
         c = a.m(d);
        System.out. println ( "d ->"+d);
        System.out. println ( "d ->"+c);
        System.out. println ( "object a to atributes ->");
        System.out. println ( "a.i-> "+ a.getI());
        System.out. println ( "object e to atributes ->");
        System.out. println ( "e.s-> "+ e.getS());
        System.out. println ( "object b to atributes ->");
        System.out. println ( "b.s-> "+ b.gets());
        System.out. println ( "object c to atributes ->");
        System.out. println ( "c.s-> "+ c.gets());
        System.out. println ( "object d to atributes ->");
        System.out. println ( "d.s-> "+ d.gets());
        System.out. println ( "object f to atributes ->");
        System.out. println ( "f.s-> "+ f.gets());


        String s = new String ("hello");
        s ="hello";
         System.out. println ( "s "+s);
         
        e = new E(s);
           System.out. println ( "object e to atributes ->");
        System.out. println ( "e.s-> "+ e.getS());
}

    private static class F {
 private String s;
        public F() {
           s = "print using constructor in F ";
    }
    public F (String s){
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

    private static class E {

        public E() {
        }

        private E(String s) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getS() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    }
    