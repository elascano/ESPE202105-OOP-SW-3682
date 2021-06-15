/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

/**
 *
 * @author Cristian Felix InnovaCode ESPE-DCC
 */
public class C {
    
    public C(float f){
        this.f = f;
    }

    
    public float getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(float f) {
        this.f = f;
    }
    private float f;
    
    public void m(){
       System.out.println("Inside C.m1() method"); 
    }
}
