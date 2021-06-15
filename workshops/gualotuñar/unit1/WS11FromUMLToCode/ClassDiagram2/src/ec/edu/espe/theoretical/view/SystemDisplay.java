/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.view;

import ec.edu.espe.theoretical.model.*;

/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class SystemDisplay {
    
    public static void main(String[] args) {    
        System.out.println("Setters Getters an Constructors Richard Gualotuña");
        
        int i;
        A a; //declaration
        D d;
        C c = new C(); // dont do it
        E e;
        
        a = new A();
        d = new D();
        e = new E();
        
        d = a.m();
        System.out.println("d->" +d);
        c = a.m(d);
        System.out.println("c->" +c);
        
        //a.i=10; //break encapsulation because i is private 
        a.setI(10);
        System.out.println("object a attributes ->");
        System.out.println("a.i ->" + a.getI());
        
        System.out.println("object a attributes ->");
        System.out.println("a.s ->" + e.getS());
        
        String s = new String("Hello");
        s= "Hello";
               
        System.out.println("s" + s);
        
        e = new E(s);
        System.out.println("object a attributes ->");
        System.out.println("e.s ->" + e.getS());
        
    }
    
}
