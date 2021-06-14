/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

import java.util.ArrayList;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class B {
    
    private String s;
    
    
    public  B(){
        s = "print using constructor in B";
    }
    
    
    public B (String s){
        this.s =s;
    
    }
    
    
        public String gets() {
        return s;
    }

   
    public void sets(String p) {
        this.s= s;
    }
    
    
    private int a;
    private int b;
    private ArrayList<E> es = new ArrayList<>();
    
    
    public C m1(F f){
        System.out.println("Inside method B.m1(), that receives an object f --> "
                + f + "and returns a C objects" );
        return new C();
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the es
     */
    public ArrayList<E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList<E> es) {
        this.es = es;
    }


    
    
    
}
