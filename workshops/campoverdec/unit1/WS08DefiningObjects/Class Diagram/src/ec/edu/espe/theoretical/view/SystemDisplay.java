/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.view;

import ec.edu.espe.theorical.model.A;
import ec.edu.espe.theorical.model.D;
import ec.edu.espe.theorical.model.C;
import ec.edu.espe.theorical.model.B;
import ec.edu.espe.theorical.model.E;

/**
 *
 * @author Carlos Campoverde EMCL:java
 */
public class SystemDisplay {
    public static void main(String[] args){
        System.out.println("Setters Getters and Costructors Carlos Campoverde");
        
        int i;
        A a;
        B b;
        D d;
        C c;
        E e;
        a=new A();
        b=new B();
        c=new C();
        d=new D();
        e=new E();
        
        
        d=a.m();
        System.out.println("d->" + d);
        c=a.m(d);
        System.out.println("c->" + c);
        
        //a.i=10; rompe el emcapsuamiento 
        a.setI(10);
        System.out.println("object and atributes -> ");
        System.out.println("a.i-> " + a.getI());
        
        System.out.println("object and atributes -> ");
        System.out.println("e.s-> " + e.getS());
        
        String s=new String("Hello");
        
        System.out.println("s" +s);
        
       e=new E("Hello"); 
    }
}
