package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class A {
    private List<A> as = new ArrayList<>();
    
    public A() {
        System.out.println("A::A()");
    }
    
    public void addA(A a) {
        as.add(a);
    }

    @Override
    public String toString() {
        return "A{" + "as=" + as + '}';
    }
}
