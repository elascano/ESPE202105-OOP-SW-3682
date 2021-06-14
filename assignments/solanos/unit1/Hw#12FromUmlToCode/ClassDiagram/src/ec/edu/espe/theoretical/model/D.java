/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class D {
    B b;
    private boolean h;
    
    public B m(){
        System.out.println("Inside D.m1() method than a B objects");
        return new B();
    }
    
    public int m(F f){
        System.out.println("Inside B.m1() mewthod recives f -> " +f);
        return 0;
    }

    /**
     * @return the h
     */
    public boolean isH() {
        return h;
    }

    /**
     * @param h the b to set
     */
    public void setH(boolean h) {
        this.h = h;
    }
}
