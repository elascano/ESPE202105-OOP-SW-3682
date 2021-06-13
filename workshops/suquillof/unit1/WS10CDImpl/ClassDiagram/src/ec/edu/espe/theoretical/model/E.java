/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class E {
    
    private String s;

    public E(){
       s = "Empty";
    }
    
    public E(String s){
        this.s = s;
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
