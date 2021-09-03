/** Copyright ESPE-DECC
*/

package ec.edu.espe.q22.model;

import java.util.ArrayList;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class A {                //0.5
    private ArrayList<A> as;    //0.5

    public A(ArrayList<A> as) {
        this.as = as;
    }

    @Override
    public String toString() {
        return "A{" + "as=" + as + '}';
    }

    
    
    /**
     * @return the as
     */
    public ArrayList<A> getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(ArrayList<A> as) {
        this.as = as;
    }
    
    

}
