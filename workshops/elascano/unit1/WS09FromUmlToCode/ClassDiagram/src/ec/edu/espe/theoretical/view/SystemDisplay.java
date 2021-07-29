/** Copyright ESPE-DECC
 */
package ec.edu.espe.theoretical.view;

import ec.edu.espe.theoretical.model.*;
import java.util.ArrayList;

/**
 *
 * @author Edison Lascano Hypertech ESPE-DCCO
 */
public class SystemDisplay {

    public static void main(String[] args) {
        System.out.println("Setters Getters and Constructors Edison Lascano");

        int i;
        A a;//declaration
        D d;
        C c = new C();// don't do it 
        E e;
        String s;
        B b = new B();
        ArrayList<C> cs = new ArrayList<>();
        Float f;

        f = 4.5F;
        i = 20;
        a = new A(b, i, cs); //instance
        
        
        d = new D();
        e = new E();
        d = a.m();
        System.out.println("d-> " + d);
        c = a.m(d);
        System.out.println("c -> " + c);

        //a.i=10; //break encapsulation because i is private
        a.setI(10);
        System.out.println("object a attributes -> ");
        System.out.println("a.i -> " + a.getI());

        System.out.println("object e attributes -> ");
        System.out.println("e.s -> " + e.getS());

        s = new String("hello");
        s = "hola";

        System.out.println("s " + s);

        e = new E(s);
        System.out.println("object e attributes -> ");
        System.out.println("e.s -> " + e.getS());
    }
}
