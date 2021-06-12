/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.view;

import ec.edu.espe.theoretical.model.A;
import ec.edu.espe.theoretical.model.C;
import ec.edu.espe.theoretical.model.D;
import ec.edu.espe.theoretical.model.E;

/**
 *
 * @author Darwin Valdiviezo NullPunters ESPE-DCCO
 */
public class SystemDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   System.out.println("Setters, getters and constructors Darwin Valdiviezo.");
        
        int i;
        A a; //Declaration
        D d;
        C c = new C();//Don't do it
        E e;
        String s;
        
        a = new A(); //Instance an object
        d = new D(); 
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