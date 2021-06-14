/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.model;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class D {
     private String s;
  public  D(){
        s = "print using constructor in D ";
    }
    public D (String s){
        this.s =s;
    
    }  
     public String gets() {
        return s;
    }
    public void sets(String s) {
        this.s = s;
    }

    private boolean b;
    
    public B m(){
        System.out.println("inside method D.m() returning and object b");
        return new B();
    }
//public int m(F f) {
   // System.out.println("inside method D.m() that receives f"+f+"");
//return 0;
//}

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
