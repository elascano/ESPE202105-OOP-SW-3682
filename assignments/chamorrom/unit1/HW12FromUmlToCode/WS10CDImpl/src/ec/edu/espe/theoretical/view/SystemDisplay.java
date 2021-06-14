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
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class SystemDisplay {
    
    public static void main(String[] args) {
        System.out.println("Setters Getters and Constructors  by Myckel Chamorro");    
        
        
        A a; 
        D d; 
        E e;
        B b;
        C c;
        String s;
        ArrayList<C> cs;
        ArrayList<E> es;
        s = new String("hola");
        
        es = new ArrayList();
        b = new B(0,0,es);
        cs = new ArrayList();
        a = new A(0, b, cs);
        d = new D(true);
        c = new C(0);//dont do it
        e = new E(s);
        
        
        d = a.m();
        System.out.println("d->" + d);
        c = a.m(d);
        System.out.println("c->" + c);
        
        a.setI(10);
                
        System.out.println("Object attributes");
        System.out.println("a.i->"+a.getI());
        System.out.println("e.s->"+e.getS());
        
        
       
        System.out.println("Object attributes");
        System.out.println("e.s->"+e.getS());
    }
    
}
