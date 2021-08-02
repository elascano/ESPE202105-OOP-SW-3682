/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.examunit2.model;

import java.util.ArrayList;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class D extends A{
    private ArrayList<F> fs = new ArrayList<>();
    private E[] es = new E[5];

    public D(ArrayList<F> fs, E[] es) {
        this.fs = fs;
        this.es = es;
    }

    @Override
    public String toString() {
        return "D{" + "fs=" + fs + ", es=" + es + '}';
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
    
    
}
