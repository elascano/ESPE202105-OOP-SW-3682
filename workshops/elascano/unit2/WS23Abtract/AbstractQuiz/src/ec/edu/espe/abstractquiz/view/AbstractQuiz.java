/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractquiz.view;

import ec.edu.espe.abstractquiz.controller.PI;
import ec.edu.espe.abstractquiz.controller.Q;
import ec.edu.espe.abstractquiz.model.*;

import java.util.ArrayList;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class AbstractQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        A a2 = new A(0, 1, new A(), new B[5], new ArrayList<C>());
        
        A a;
        A a1;
        B[] bs;
        D d;
        E e;
        G g;
        C c;
        H h;
        F f;
        ArrayList<G> gs;
        ArrayList<C> cs;
        ArrayList<H> hs;

        int z = 2;
        int x = 3;
        int y = 4;
        float ff = 5.5F;
        double doub = 6.6F;
        int aa = 7;
        int bb = 8;

        bs = new B[5];
        gs = new ArrayList<>();
        cs = new ArrayList<>();
        hs = new ArrayList<>();

        g = new G(z);
        gs.add(g);
        g = new G(z + 3);
        gs.add(g);
        h = new H();
        hs.add(h);
        hs.add(h);
        hs.add(h);
        f = new F("Hello Edison");

        c = new C(hs);
        c.m(f);

        a1 = new A();

        for (int i = 0; i < 5; i++) {
            //TODO read from keyboard x, y, f, doub
            //TODO loop to read one or more gs with ints
            //TODO how many gs do you need? 
            //for(int i = 0; i<max;i++){ ...(read from keyboard) }
            //TODO When do you need to stop? 
            //while(value<0) { ... (read from keyboard) }
            if (i % 2 == 0) {
                bs[i] = new D(x + i, y + i, ff * i, doub * i, gs);
            } else {
                bs[i] = new E(ff, ff, ff, doub, gs);
            }
            bs[i].m2(i);
        }

        //1
        a = new A(aa, bb, a1, bs, cs);
        System.out.println("a -> " + a);

        //2
//        a = new A(0, 1, new A(), new B[5], new ArrayList<C>());
//        System.out.println("a -> " + a);
//        
//        for(int j = 0;j<5;j++){
//            System.out.println("bs[" +j + "] -> " + bs[j]);
//        }
        PI pi;
        pi = new Q();

        System.out.println(pi.m(ff));
        System.out.println(pi.m(y));
        pi.m2();
        pi.m3(aa, bb, ff);

    }

}
