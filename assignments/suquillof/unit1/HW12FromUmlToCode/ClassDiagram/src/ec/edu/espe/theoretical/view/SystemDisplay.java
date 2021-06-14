/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.view;

import ec.edu.espe.theoretical.model.*;
import java.util.ArrayList;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class SystemDisplay {
    
    public static void main(String[] args) {
        System.out.println("Setters Getters and Constructors Nicolas Suquillo");
        
        int i;
        double d1;
        int a1;
        float f1;
        int b1;
        String s1;
        String s;
        A a; 
        D d;
        E e;
        C c;
        B b;
        F f;
        ArrayList<C> cs;
        ArrayList<E> es;
        boolean b2;
        
        i = 20;
        b1 = 80;
        d1 = 13.3;
        a1 = 60;
        f1 = 23.9F;
        b2 = true;
        s1 = "Hi Edyson";
        cs = new ArrayList<>();
        es = new ArrayList<>();
        b = new B(a1, b1, es);
        a = new A(b, i, cs);   
        c = new C(f1);
        d = new D(b2);
        e = new E(s1);
        f = new F(d1);
        
        d = a.m();
        System.out.println("d->" + d);
        c = a.m(d);
        System.out.println("c->" + c);
        
        //a.i=10; //break the encapsulation because i is private
        a.setI(10);
        System.out.println("object a attributes -> ");
        System.out.println("a.i ->" + a.getI());
        
        System.out.println("object a attributes -> ");
        System.out.println("e.s ->" + e.getS());
        
        s = new String("hello");
        s = "hola";
        
        System.out.println("s -> " + s);
        
        e = new E(s);
        System.out.println("object a attributes -> ");
        System.out.println("e.s - >" + e.getS());
        
        // Constructors
        
        System.out.println("Object A ->");
        System.out.println("A ->" + a);
    }    
}
