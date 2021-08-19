/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.q22.model;

import java.util.ArrayList;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class B extends A { //0.5
    
 private ArrayList<H> hs; //0.5

    public B(int a, ArrayList<H> hs,A aa) {
        super(a,aa);
        this.hs= hs;
    }

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
