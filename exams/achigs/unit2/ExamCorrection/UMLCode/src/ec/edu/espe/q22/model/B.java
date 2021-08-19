/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.q22.model;

import java.util.ArrayList;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class B extends A{
    private ArrayList<H> hs;

    public B(ArrayList<H> hs, ArrayList<A> as) {
        super(as);
        this.hs = hs;
    }

    //public void r(){
    //    hs = new ArrayList<G>();
    //}
    
    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {
        this.hs = hs;
    }
    
}
