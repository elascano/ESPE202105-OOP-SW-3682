/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.view;

import ec.edu.espe.theoretical.model.*;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class SystemDisplay {
    
    public static void main(String[] args) {
        System.out.println("Setters Getters and Constructors Nicolas Suquillo");
        
        A a; //declaracion 
        D d;
        E e;
        C c = new C(); // don´t do it 
        String s;
        
        a = new A(); //instance
        d = new D();
        e = new E();
        
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
        
        System.out.println("s " + s);
        
        e = new E(s);
        System.out.println("object a attributes -> ");
        System.out.println("e.s - >" + e.getS());
    }    
}
