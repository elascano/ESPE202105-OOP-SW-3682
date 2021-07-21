/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class F { 
    private String r; //+2

    public F(String r) { //+2
        this.r = r;
    }

    @Override
    public String toString() { //+2
        return "F{" + "r=" + r + '}';
    }

    /**
     * @return the r
     */
    public String getR() { //+2
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(String r) { //+2
        this.r = r;
    }
    
}
