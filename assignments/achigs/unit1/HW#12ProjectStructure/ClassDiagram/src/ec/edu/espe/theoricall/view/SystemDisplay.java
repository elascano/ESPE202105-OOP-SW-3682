/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoricall.view;

import ec.edu.espe.theoricall.model.*;
import java.util.ArrayList;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class SystemDisplay {
    public static void main(String[] args) {
        System.out.println("Setters Getters and Consturctors Steven Achig");
    
        int i, g, h;
        float j;
        boolean k;
        double l;
        A a; //declaration
        B b;
        C c;
        D d; 
        E e;
        F f;
        String s;
        ArrayList<C> cs = new ArrayList<>();
        ArrayList<E> es = new ArrayList<>();
        
        
        i = 20;
        g = 15;
        h = 25;
        j = 35;
        l = 9812323;
        k = true;
        s = new String("Hello Steven Achig");
        //s = "Hellow Steven Achig";
        b = new B(g, h, es);
        a = new A(b, i, cs); // instance of Object
        c = new C(j);
        d = new D(k); // instansce and declaration
        e = new E();
        d = a.m();
        f = new F(l);
        System.out.println("d->"+ d);
        c = a.m(d);
        System.out.println("d->"+ c);
        
        //a.i=10;// break encapsulation because i is provate
 
        // Constructors Class E
        System.out.println("object a atributes -> ");
        System.out.println("e.s->" + e.getS());
        
        System.out.println("s "+ s);
        
        e = new E(s);
        System.out.println("object e atributes -> ");
        System.out.println("e.s->" + e.getS());
        
        //Constructor Class A
        System.out.println("object a atributes -> ");
        System.out.println("a.i->" + a.getI());
        
        System.out.println("object e atributes -> ");
        System.out.println("a.b->" + a.getB());
        
        System.out.println("object e atributes -> ");
        System.out.println("a.cs->" + a.getCs());
        
        //Cosntructor Class B
        System.out.println("object a atributes -> ");
        System.out.println("b.a->" + b.getA());
        
        System.out.println("object e atributes -> ");
        System.out.println("b.b->" + b.getB());
        
        System.out.println("object e atributes -> ");
        System.out.println("b.es->" + b.getEs());
        
        //Constructor Class C
        System.out.println("object e atributes -> ");
        System.out.println("c.f->" + c.getF());
        
        //Constructor Class F
        System.out.println("object e atributes -> ");
        System.out.println("f.d->" + f.getD());

        //Cosntructor Class D
        //System.out.println("object e atributes -> ");
        //System.out.println("d.b->" + d.setB());
        

    }
}