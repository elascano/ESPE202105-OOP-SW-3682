/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.model;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class D {
    private boolean b;
    
    public B m(){
        System.out.println("inside D.m() method that returns a B object");
        return new B();
    }
    
    public int m(F f){
        System.out.println("inside D.m() method that receives f -> " +f);
        return 0;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }
}
