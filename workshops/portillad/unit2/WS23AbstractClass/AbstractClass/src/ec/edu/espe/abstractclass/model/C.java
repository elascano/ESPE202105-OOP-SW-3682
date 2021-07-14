/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclass.model;

import java.util.ArrayList;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class C extends A{
   private ArrayList<H>hs = new ArrayList<>();
  
   
   public void m(F f){
       
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
