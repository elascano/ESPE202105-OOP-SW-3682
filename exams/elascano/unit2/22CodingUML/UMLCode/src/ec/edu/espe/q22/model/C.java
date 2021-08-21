/** Copyright ESPE-DECC
*/

package ec.edu.espe.q22.model;

import java.util.ArrayList;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class C extends A{       //0.4
    private ArrayList<E> es;    //0.4

    public C(ArrayList<E> es, ArrayList<A> as) {    //0.2
        super(as);
        this.es = es;
    }

    @Override
    public String toString() {
        return "C{" + "es=" + es + '}';
    }
    
    /**
     * @return the es
     */
    public ArrayList<E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList<E> es) {
        this.es = es;
    }
    
    
}
