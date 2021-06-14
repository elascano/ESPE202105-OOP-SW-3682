/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.view;


import ec.edu.espe.theorical.model.*;
/**
 *
 * @author Eduardo Mortensen The Programers
 */
public class Systemdisplay {
 
    public static void main (String[]args){
        System.out.println("Setters Getters and Constructors Eduardo Mortesen");
        A a = new A();
        D d= new D();
        C c = new C();
        E e;
        e= new E();
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


        String s = new String ("hello");
        s ="hello";
         System.out. println ( "s "+s);
         
        e = new E(s);
           System.out. println ( "object e to atributes ->");
        System.out. println ( "e.s-> "+ e.getS());
}
}  
