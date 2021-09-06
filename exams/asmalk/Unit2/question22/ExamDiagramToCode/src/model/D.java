package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class D extends A {
    private List<F> fs = new ArrayList<>();
    private E es[] = new E[5];
    
    public D() {
        System.out.println("D::D()");
        fs.add(new F());
        
        es[0] = new E();
        es[1] = new E();
        es[2] = new E();
        es[3] = new E();
        es[4] = new E();
    }
}
