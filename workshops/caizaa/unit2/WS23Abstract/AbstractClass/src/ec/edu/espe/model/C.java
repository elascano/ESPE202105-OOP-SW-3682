/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class C {
    private ArrayList<H> hs = new ArrayList<>();
    
    public C(ArrayList<H> hs) {
        this.hs = hs;
    }
    
    public void m(F f){
        
    }
    
    public float m(float f){
        return 0;
    }

    @Override
    public String toString() {
        return "C{" + "hs=" + hs + '}';
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
