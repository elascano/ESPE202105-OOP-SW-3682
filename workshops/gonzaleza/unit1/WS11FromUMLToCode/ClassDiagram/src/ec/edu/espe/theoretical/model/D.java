/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class D {
    private boolean b;
    
    public B m(){
        System.out.println("Inside a D.m() method that returns a B object.");
        return new B();
    }
    
    public int m(F f){
        System.out.println("Inside a D.m(f) method that receives f -> " + f);
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
