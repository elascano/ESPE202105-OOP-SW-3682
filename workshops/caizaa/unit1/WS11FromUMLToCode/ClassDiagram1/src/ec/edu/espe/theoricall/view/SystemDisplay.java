/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoricall.view;

import ec.edu.espe.theoricall.model.*;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class SystemDisplay {
    public static void main(String[] args) {
        System.out.println("Setters Getters Alisson Caiza");
    
        int i;
        A a; //declaration
        D d; 
        C c = new C(); // dont do it
        String s;
        E e;
        
        a = new A(); // instance of Object
        d = new D(); // instansce and declaration
        e = new E();
        d = a.m();
        System.out.println("d->"+ d);
        c = a.m(d);
        System.out.println("d->"+ c);
        
        //a.i=10;// break encapsulation because i is provate
        a.setI(10);
        System.out.println("object a atributes -> ");
        System.out.println("a.i->" + a.getI());
        
        System.out.println("object a atributes -> ");
        System.out.println("e.s->" + e.getS());
        
        s = new String("Hello Alisson Caiza");
        s = "hola Alisson Caiza";
        
        System.out.println("s "+ s);
        
        e = new E(s);
        System.out.println("object e atributes -> ");
        System.out.println("e.s->" + e.getS());
    }
}
