/** Copyright ESPE-DECC
*/

package ec.edu.espe.q22.model;

import java.util.ArrayList;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class D extends A{   //0.2
    private E[] es;         //0.2
    private ArrayList<F> fs;//0.2

    public D(E[] es, ArrayList<F> fs, ArrayList<A> as) { //0.4
        super(as);
        es = new E[5];
        this.es = es;
        this.fs = fs;
    }
    
    
    /**
     * @return the es
     */
    public E[] getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(E[] es) {
        this.es = es;
    }

    /**
     * @return the fs
     */
    public ArrayList<F> getFs() {
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(ArrayList<F> fs) {
        this.fs = fs;
    }

    
    
}
