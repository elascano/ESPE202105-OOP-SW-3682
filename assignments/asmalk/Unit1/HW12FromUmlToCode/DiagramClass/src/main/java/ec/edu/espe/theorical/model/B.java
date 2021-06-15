/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.model;

import java.util.ArrayList;

/**
 *
 * @author AsmalKevin
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
    ArrayList<E> es = new ArrayList<>();
    public C ml(F f){
        System.out.println("inside method C.m() reciving paremeter f");
     return new C();  
    }
    
    
}
    

