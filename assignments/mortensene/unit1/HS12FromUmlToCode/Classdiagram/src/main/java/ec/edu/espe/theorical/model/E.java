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
public class E {
    private String S;
   
    
    public  E(){
        S = "empty";
    }
    public E (String s){
        this.S =s;
    
    }

    /**
     * @return the S
     */
    public String getS() {
        return S;
    }

    /**
     * @param S the S to set
     */
    public void setS(String S) {
        this.S = S;
    }
    
}
