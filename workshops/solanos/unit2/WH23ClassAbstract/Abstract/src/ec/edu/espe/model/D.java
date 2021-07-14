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
public class D extends B {
    int x; 
    int y;

    public D(int x, int y, float f, double d, ArrayList<G> gs) {
        super(f, d, gs);
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "D{" + "x=" + x + ", y=" + y + '}';
    }
    
    public int m(int i){
        return i;
    }
    
}
