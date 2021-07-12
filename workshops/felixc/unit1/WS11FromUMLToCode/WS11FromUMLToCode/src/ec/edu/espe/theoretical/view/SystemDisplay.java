/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.view;

import ec.edu.espe.theoretical.model.*;

/**
 *
 * @author Cristian Felix InnovaCode ESPE-DCCO
 */
public class SystemDisplay {
    
    public static void main (String[]args){
        System.out.println("Setters, Getters and Constructions Cristian Felix");
        
        int i;
        A a;//declaration
        D d;
        C c = new C();
        E e;
        String s;
        
        a = new A ();//instance
        d = new D ();
        e = new E ();
        
        d = a.m();
        System.out.println("d ->" +d);
        c = a.m(d);
        System.out.println("c ->"+c);
        
        
        //a.i = 10;//break encapsulation because i is private
        a.setI(10);
        System.out.println("object a attributes ->");
        System.out.println("a.i -> " + a.getI());
        
        System.out.println ("object e attribute -> ");
        System.out.println("e.s->" + e.getS());
        
        s = new String ("Hello");
        s =  "Hola";
        System.out.println("s" + s);
        
        e = new E (s);
        System.out.println("object e attribute ->");
        System.out.println("e.s ->" + e.getS());
        
    }
    
}
