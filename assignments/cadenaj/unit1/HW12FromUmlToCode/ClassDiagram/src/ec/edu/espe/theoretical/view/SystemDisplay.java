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
 * @author jejoc
 */
public class SystemDisplay {
    
    public static void main(String[] args){
        System.out.println("Setters Getters and Constructors Cadena Jeremy");
        
        int i=10;
        ArrayList<C> cs = new ArrayList<>();
        A a; //declaration
        B b;
        D d;
        C c = new C(i); //don't do it
        E e;
        String s;
        
        b = new B(i, i, cs);
        a = new A(b, i, cs); //instance an object
        d = new D(true, cs); 
        e = new E();
        d = a.m();
        System.out.println("d -> " + d);
        c = a.m(d);
        System.out.println("c -> " + c);
        
        
        //a.i = 10; //Break encapsulation because i is private
        a.setI(10);
        System.out.println("Object a attributes -> ");
        System.out.println("a.i -> " + a.getI());
        System.out.println("Object e attributes -> ");
        System.out.println("e.s -> " + e.getS());
        
        s = new String("Hello.");
        s = "Hola";
        System.out.println("s " + s);
        
        e = new E(s);
        System.out.println("Object e attributes -> ");
        System.out.println("e.s -> " + e.getS());
    }
}
