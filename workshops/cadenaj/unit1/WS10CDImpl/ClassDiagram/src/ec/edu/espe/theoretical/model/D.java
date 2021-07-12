/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

import java.util.ArrayList;

/**
 *
 * @author jejoc
 */
public class D {
    private boolean b;
    private ArrayList<E> es = new ArrayList<>();

    public D(boolean b, ArrayList es) {
        this.b = b;
        this.es = es;
    }

    public B m(){
        System.out.println("Inside D.m() method tha returns B object.");
        return B(0, 0, es);
    }
    
    public int m(F f){
        System.out.println("Inside D.m(f) method that receives f -> " + f);
        return 0; 
    }

    /**
     * @return the b
     */
    public boolean isB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(boolean b) {
        this.b = b;
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
