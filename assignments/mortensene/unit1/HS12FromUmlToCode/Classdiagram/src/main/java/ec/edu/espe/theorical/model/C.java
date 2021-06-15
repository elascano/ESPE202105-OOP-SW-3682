/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.model;

/**
 *
 * @author pc
 */
public class C {
    private String s;
  public  C(){
        s = "print using constructor in C ";
    }
    public C (String s){
        this.s =s;
    
    }  
     public String gets() {
        return s;
    }
    public void sets(String s) {
        this.s = s;
    }

    
private float f;  
public void m (){
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
