/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.view;

import ec.edu.espe.theorical.model.A;
import ec.edu.espe.theorical.model.B;
import ec.edu.espe.theorical.model.D;
import ec.edu.espe.theorical.model.C;
import ec.edu.espe.theorical.model.E;
import java.util.ArrayList;
//import ec.edu.espe.theorical.model.*; el asterisco me ayuda a importar todas las clases


/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class SystemDisplay {
    
    public static void main(String[] args) {
        System.out.println("Hello From Display Display");
        
        int i;
        A a;//declaration
        D d;
        C c = new C();// don't do it
        E e;
        B b = new B();
        ArrayList<C> cs = new ArrayList<C>();
        
        a = new A();//instance
        d = new D();
        e= new E();
        
        d = a.m();
        System.out.println("d-> " +d);
        c = a.m(d);
        System.out.println("c-> " +c);
        
        //a.i=10 // break encapsulation because i is a private
        a.setI(10);
        System.out.println("object a atributes -> ");
        System.out.println("a.i: " +a.getI());
        
        System.out.println("object e atributes -> ");
        System.out.println("e.s -> " +e.getS());
        
        String s = new String("Hello");
        //s = "Hola";
        System.out.println("s " +s);
        
        e = new E("Hello");
    }
}
