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
public class A {
    private ArrayList<A> as;

    @Override
    public String toString() {
        return "A{" + "as=" + as + '}';
    }

    public A(ArrayList<A> as) {
        this.as = as;
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
