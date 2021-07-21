/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclasses.model;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class C {
    
    private ArrayList<H> hs = new ArrayList<>();//2
    //missing to string 
    public C() {//0.5
    }

    
    public void m(F f){ //1.5
        //missing println
    }
    
    public float m(float f){//2
        return 0;
    }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {//1
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {
        this.hs = hs;
    }

}
