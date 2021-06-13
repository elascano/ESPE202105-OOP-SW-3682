/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.view;

import ec.edu.espe.theorical.model.A;
import ec.edu.espe.theorical.model.D;
import ec.edu.espe.theorical.model.C;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class SystemDisplay {
    
    public static void main(String[] args){
        System.out.println("Hello From System Display");
        
        A a = new A();
        D d = new D();
        C c = new C();
        E e;
        
        d = a.m();
        System.out.println("d ->" + d);
        c = a.m(d);
        System.out.println("c ->" + c);
        
        //a.i=10; //break encapsulation because i is private
        a.setI(10);
        
        System.out.println("object a attributes ->");
        System.out.println("a.i ->" + a.getI());
        
        System.out.println("object e attributes ->");
        System.out.println("e.s ->" + e.getS());
        
        String s;
        System.out.println("s" + s);
    }
    
}
