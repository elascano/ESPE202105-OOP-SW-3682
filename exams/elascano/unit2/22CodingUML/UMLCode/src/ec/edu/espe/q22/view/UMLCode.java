/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.q22.view;

import ec.edu.espe.q22.model.*;
import ec.edu.espe.q22.model.E;
import java.util.ArrayList;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class UMLCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a;    //0.1
        B b;    //0.1
        C c;    //0.1
        D d;    //0.1
        ArrayList<A> as = new ArrayList<>();    //0.2
        ArrayList<B> bs = new ArrayList<>();    //0.2
        C[] cs = new C[3];    //0.2
        D[] ds = new D[4];    //0.2
        
        
        ArrayList<E> ees = new ArrayList<>();    //0.1
        ArrayList<F> fs = new ArrayList<>();    //0.1
        ArrayList<G> gs = new ArrayList<>();    //0.1
        G g = new G();    //0.1
        J j = new J();    //0.1
        E[] es = new E[5];    //0.1
        H h = new G();    //0.1

        a = new A(as);    //0.1
        b = new B(gs, as);    //0.1
        c = new C(ees, as);    //0.1
        d = new D(es, fs, as);    //0.1
        
        bs.add(b);    //0.1
        bs.add(b);    //0.1

        for(int i = 0 ; i < cs.length ; i++){    //0.1
            cs[i] = c;
        }
        
        for(int i = 0 ; i < ds.length ; i++){    //0.1
            ds[i] = d;
        }
        
        
        System.out.println("bs -> " + bs);    //0.1
        System.out.println("cs ->");    //0.1
        for(int i = 0 ; i < cs.length ; i++){
            System.out.println("cs[" + i + "] -> " + cs[i]);
        }
        
        System.out.println("ds ->");    //0.1
        for(int i = 0 ; i < cs.length ; i++){
            System.out.println("ds[" + i + "] -> " + ds[i]);
        }
        
        g.m(j);
        
    }
    
}
