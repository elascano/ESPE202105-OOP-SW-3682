/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoricall.model;

import java.util.ArrayList;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class D {
    private boolean b;

    public D(boolean b) {
        this.b = b;
    }
   
    
    public B m(){
        
    ArrayList<E> es = new ArrayList<>();
    int x , w;
    x = 0;
    w = 5;
        
        System.out.println("iside D.m( nethod that returns a B object");
        return new B(x, w, es);
    }
    
    public int m(F f){
        System.out.println("inside D.() method that receive f ->" + f);
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
}
