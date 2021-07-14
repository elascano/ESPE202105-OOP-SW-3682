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
public class E extends B{   //+1
    private float p;        //+1
    private float q;        //+1

    public int m1(boolean b){ //+1 to do use the Boolean B
        /*
        int result = 0;
        if(b){
            result = 1;
        }
        return result;
        */
        return 0;
    }
    
    // the two methods inherited from the parent class B are missing -2
    
    public E(float p, float q, float f, double d, ArrayList<G> gs) { //+1
        super(f, d, gs);
        this.p = p;
        this.q = q;
    }
    
    public E(float f, double d, ArrayList<G> gs) {
        super(f, d,  gs);
    }

    @Override
    public String toString() {
        return "E{" + super.toString() + "p=" + p + ", q=" + q + '}'; //+1
    }

                            //+2 getters and setters
    
    /**
     * @return the p
     */
    public float getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(float p) {
        this.p = p;
    }

    /**
     * @return the q
     */
    public float getQ() {
        return q;
    }

    /**
     * @param q the q to set
     */
    public void setQ(float q) {
        this.q = q;
    }
    
}
