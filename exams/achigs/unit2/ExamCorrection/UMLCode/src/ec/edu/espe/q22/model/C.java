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
public class C extends A{
    private ArrayList<E> es;

    @Override
    public String toString() {
        return "C{" + "es=" + es + '}';
    }

    public C(ArrayList<E> es, ArrayList<A> as) {
        super(as);
        this.es = es;
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
