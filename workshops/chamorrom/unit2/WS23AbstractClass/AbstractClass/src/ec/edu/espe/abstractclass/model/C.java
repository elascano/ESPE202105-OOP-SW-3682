/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclass.model;

import java.util.ArrayList;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class C {
    
   private ArrayList<H> hs; //1     it is incomplete arrayList

    @Override
    public String toString() {
        return "C{" + "hs=" + hs + '}';
    }

    public C(ArrayList<H> hs) { //1
        this.hs = hs;
    }

    public C() {
    }
   
   public void m(F f){  //1  it is incomplete void
   
  }
   public float m(float f){ //1    it is incomplete float
   return f ;
   }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {  //1
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {  //1
        this.hs = hs;
    }
    
}
