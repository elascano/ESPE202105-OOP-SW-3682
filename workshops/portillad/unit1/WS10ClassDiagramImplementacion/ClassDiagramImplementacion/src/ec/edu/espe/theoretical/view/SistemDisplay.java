/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.view;

import ec.edu.espe.theoretical.model.*;



/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class SistemDisplay {
    
    public static void main(String[] args) {
        System.out.println("Setters Getters and Constructor Diego Portilla ");
        
        A a = new A();
        D d = new D();
        C c = new C();
        E e;
        String s;
        
        e =new E(); 
        
        d= a.m();
        System.out.println("d->" + d);
        c= a.m(d);
        System.out.println("c->" + c);
        
        //a.i=10; //break encapsulation because i is private 
        a.setI(10);
        System.out.println("object a atributes -> ");
        System.out.println("a.i"+ a.getI());
        
        System.out.println("object a atributes -> ");
        System.out.println("a.s"+ e.getS());
        
        s = new String("hello");
        System.out.println("s " + s);
        
        e = new E(s);
        System.out.println("object a atributes -> ");
        System.out.println("e.s " + e.getS());
    }
    
}
