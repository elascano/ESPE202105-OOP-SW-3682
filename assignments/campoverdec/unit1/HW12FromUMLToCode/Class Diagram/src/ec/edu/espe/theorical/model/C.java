/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.model;

/**
 *
 * @author Carlos
 */
public class C {
    private float f;
    
    public C(float f) {
        this.f=f;
    }
    
    public C(){
        
    }
    
    public void m(){
        System.out.println("inside C.m() method");
}

    /**
     * @return the f
     */
    public float getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(float f) {
        this.f = f;
    }
}