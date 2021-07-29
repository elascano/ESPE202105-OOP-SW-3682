package ec.edu.espe.abstractclass.view;

import ec.edu.espe.abstractclass.model.*;
import java.util.ArrayList;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class AbstractClass {

    public static void main(String[] args) {
        A a;
        B b;
        C c;
        D d;
        ArrayList<C> cs = null;
        B bs[] = new B[5];
        bs=null;
        ArrayList<G> gs = null;
        gs=null;

        a = new A(1, 1, cs, bs);
        b = new D(12,12,0.9F,0.8,gs);
        System.out.println("-----------Abstract Class----------");
        System.out.println("A--->"+a);
    }

}
