/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

/**
 *
 * @author Darwin Valdiviezo NullPunters ESPE-DCCO
 */
public class D {
 private boolean b;
    private String s;
    
    public D(){
        s="Constructorn in D";
    }
    
    public B m(){
        System.out.println("Inside D.m1() method than returns a B objects");
        return new B();
    }
    
    public int m(F f){
        System.out.println("Inside B.m1() mewthod recives f ->" + f);
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

    /**
     * @return the s
     */
    public String getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(String s) {
        this.s = s;
    }

}