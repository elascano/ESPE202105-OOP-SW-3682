/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.model;

/**
 *
 * @author AsmalKevin
 */
public class F {
     private String s;
  public  F(){
        s = "print using constructor in F ";
    }
    public F (String s){
        this.s =s;
    
    }  
     public String gets() {
        return s;
    }
    public void sets(String s) {
        this.s = s;
    }
    
    
    
 private double d;

    /**
     * @return the d
     */
   public double getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(double d) {
        this.d = d;
    }
  
} 
