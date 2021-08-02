/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.q22.model;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class C extends A {
    
    private E[] es = new E[3];
    public C(int a, E[] es, A aa) {
       super(a,aa);
        this.es = es;
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
