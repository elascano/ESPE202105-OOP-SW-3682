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
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class SystemDisplay {
    
    public static void main(String[] args) {
        System.out.println("Setter Getters and Constructors Matthew Salazar");
        
        int i;
        A a;//declaration
        D d;
        C c = new C();
        E e;
       String s;
        B b =new B();
        ArrayList<C> cs = new ArrayList<>();
        
       i = 20; 
       a = new A(b,i,cs);// instanse 
       
       
       d = new D();
       e = new E();
        d = a.m();
        System.out.println("d-> " + d);
       c =  a.m(d);
        System.out.println("c-> " + c);
        
        a.setI(10);
        System.out.println("objects a attributes ->");
        System.out.println("a.i ->" + a.getI());
        System.out.println("a.s -> " + e.getS());
        
        s = new String("hello");
        s = "hola";
        System.out.println("s " + s);
        
        e = new E(s);
         System.out.println("objects a attributes ->");
         System.out.println("a.s -> " + e.getS()); 
    }
    
    
}
