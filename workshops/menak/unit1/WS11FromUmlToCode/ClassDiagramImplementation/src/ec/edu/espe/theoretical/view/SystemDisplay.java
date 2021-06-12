/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.view;

import ec.edu.espe.theoretical.model.*;


/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class SystemDisplay {
    
    public static void main(String[]args){
        System.out.println("Setters Getters and Constructors Paul Mena");
        
        int i;
        A a; //declaration
        D d;
        C c = new C(); //don´t do it
        E e;
        String s;
        
        
        a = new A();  //instance
        d = new D();
        e = new E();
        
        
        d = a.m();
        System.out.println("d --> "+ d);
        c = a.m(d);
        System.out.println("c --> "+ c);
        
        //a.i=10; //break encapsulation because i is private
        a.setI(10);
        System.out.println("Object a attributes --> ");
        System.out.println("a.i " + a.getI());
        
        System.out.println("Object e attributes --> ");
        System.out.println("e.s " + e.getS());
        
        //String s = new String("hello"); // otra opcion para llamar una variable
        s = "hola";
        System.out.println("s "+ s);
        
        e = new E(s);
        System.out.println("object e attributes --> ");
        System.out.println("e.s --> " + s);
    }
}
