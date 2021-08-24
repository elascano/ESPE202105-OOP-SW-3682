/** Copyright ESPE-DECC
*/

package ec.edu.espe.q22.model;

import java.util.ArrayList;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class B extends A{       //0.4
    private ArrayList<G> gs;    //0.4

    public B(ArrayList<G> gs, ArrayList<A> as) {    //0.2
        super(as);
        this.gs = gs;
    }
    
    public void r(){
        gs = new ArrayList<G>();
    }
    
    /**
     * @return the gs
     */
    public ArrayList<G> getGs() {
        return gs;
    }

    /**
     * @param gs the gs to set
     */
    public void setGs(ArrayList<G> gs) {
        this.gs = gs;
    }
    
}
