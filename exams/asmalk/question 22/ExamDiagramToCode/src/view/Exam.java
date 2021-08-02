package view;

import model.A;
import model.B;
import model.C;
import model.D;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class Exam {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new A();
        a.addA(new A());
        
        List<B> bs = new ArrayList<>();
        bs.add(new B());
        
        C cs[] = new C[]{ new C(), new C(), new C() };
        D ds[] = new D[]{ new D(), new D(), new D(), new D() };
    }
}
