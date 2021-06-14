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
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class SystemDisplay {
    public static void main(String[] args) {
        System.out.println("Setters Getters and Consturctors Alisson caiza");
    
        A a; //declaration
        B b;
        C c;
        D d; 
        E e;
        F f;
        
        int m, x, w;
        float q;
        boolean k;
        double l;
  
        
        
        String s;
        ArrayList<C> cs = new ArrayList<>();
        ArrayList<E> es = new ArrayList<>();
        
        
        m = 8;
        x = 0;
        w = 5;
        q = 12;
        l = 121212;
        k = true;
        s = new String("Hello Alisson Lisbeth Caiza ");
  
        b = new B(x, w, es);
        a = new A(b, m, cs); //  Object
        c = new C(q);
        d = new D(k); //  declaration
        e = new E();
        d = a.m();
        f = new F(l);
       
        
        
        System.out.println("d->"+ d);
        c = a.m(d);
        System.out.println("d->"+ c);
        
        // Constructors Class E
        System.out.println("object a atributes -> ");
        System.out.println("e.s->" + e.getS());
        
        System.out.println("s "+ s);
        
        e = new E(s);
        System.out.println("object e atributes -> ");
        System.out.println("e.s->" + e.getS());
        
        //Constructor Class A
        System.out.println("object a atributes -> ");
        System.out.println("a.m->" + a.getI());
        
        System.out.println("object e atributes -> ");
        System.out.println("a.b->" + a.getB());
        
        System.out.println("object e atributes -> ");
        System.out.println("a.cs->" + a.getCs());
        
        
        
        //Cosntructor Class B
        System.out.println("object a atributes -> ");
        System.out.println("b.x->" + b.getA());
        
        System.out.println("object e atributes -> ");
        System.out.println("b.w->" + b.getB());
        
        System.out.println("object e atributes -> ");
        System.out.println("b.es->" + b.getEs());
        
        
        
        
        //Constructor Class C
        System.out.println("object e atributes -> ");
        System.out.println("c.q->" + c.getF());
        
        
        
        
        //Constructor Class F
        System.out.println("object e atributes -> ");
        System.out.println("f.d->" + f.getD());

        //Cosntructor Class D
        //System.out.println("object e atributes -> ");
        //System.out.println("d.b->" + d.setB());
        

    }
}