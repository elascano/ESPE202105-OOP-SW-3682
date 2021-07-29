/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractexample.model;

import java.util.ArrayList;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class C {
    private ArrayList<H> hs = new ArrayList<>();

    @Override
    public String toString() {  
        return "C{" + "hs=" + hs + '}';
    }

    public C() {
    }
    //miss the full constructor in C
    public void m(F f){
    //miss the println for simulate the method
    
    }
    
    public float m(float f){
        return 0.0F;
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
