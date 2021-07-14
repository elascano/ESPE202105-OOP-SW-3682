/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class E extends B {
    private float p;
    private float q;


    @Override
    public String toString() {
        return "E{" + "p=" + p + ", q=" + q + '}';
    }

    public E(float p, float q, float f, double d, ArrayList<G> gs) {
        super(f, d, gs);
        this.p = p;
        this.q = q;
    }
    
    public boolean m1(boolean b){
        return b;
    }
    
    
}
