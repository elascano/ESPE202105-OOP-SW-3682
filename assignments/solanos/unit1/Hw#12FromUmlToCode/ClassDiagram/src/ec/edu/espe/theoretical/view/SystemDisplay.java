/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.view;

import ec.edu.espe.theoretical.model.A;
import ec.edu.espe.theoretical.model.D;
import ec.edu.espe.theoretical.model.C;
import ec.edu.espe.theoretical.model.E;
import ec.edu.espe.theoretical.model.F;
import ec.edu.espe.theoretical.model.B;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class SystemDisplay {
    public static void main (String[]args){
        System.out.println("Setters Getters and Constructors Sebastian Solano");
        
        A a = new A();
        B b;
        C c = new C();
        D d = new D();
        E e;
        F f;
        
        String s;
        
        b = new B(12,13);
        e = new E();
        f = new F("Sebas",21);
        d = a.m();
        System.out.println("d ->" +d);
        c = a.m(d);
        System.out.println("c ->" +c);
        
        //a.i = 10;//break encapsulation because i is private
        a.seti(10);
        System.out.println("objects a attrivutes -> ");
        System.out.println("a.i -> " +  a.geti());
        
        System.out.println("objects e attrivutes -> ");
        System.out.println("a.s -> " + e.getS());
        
        s = new String("Hello");
        s = "Hola";
        System.out.println("s " + s);
        
        e = new E(s);
        System.out.println("objects e attrivutes -> ");
        System.out.println("a.s -> " + e.getS());
        f.showData();
        b.showData();
        
    }
}
