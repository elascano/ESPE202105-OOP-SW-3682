/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.question22.model;

import java.util.ArrayList;

/**
 *
 * @author 59399
 */
public class C extends A{
    
    private ArrayList <E> es = new ArrayList <>();

    public C(A a1) {
        super(a1);
    }

    
    

    @Override
    public String toString() {
        return "C{" +super.toString()+ "es=" + es + '}';
    }

    
    
   
    /**
     * @return the es
     */
    public ArrayList <E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList <E> es) {
        this.es = es;
    }
    
    
}
