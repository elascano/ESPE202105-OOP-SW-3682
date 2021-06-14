/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.model;

/**
 *
 * @author Lizbeth Cajas EMCL. Java ESPE-DCCO
 */
public class C {
    private float f;

    public C(float f) {
        this.f = f;
    }

    public C() {
    }
    
    

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }
    
    public void m(){
        System.out.println("inside C.m() method");
    }
}
