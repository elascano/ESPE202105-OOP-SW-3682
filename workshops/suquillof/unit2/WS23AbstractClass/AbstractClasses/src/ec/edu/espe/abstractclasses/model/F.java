/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclasses.model;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class F {
    //10 /10 
    //Excellent
    private String r;//2

    @Override
    public String toString() {//2
        return "F{" + "r=" + r + '}';
    }

    public F(String r) {//2
        this.r = r;
    }

    public F(){//!!
        r="";
    }
    /**
     * @return the r
     */
    public String getR() {//2
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(String r) {//2
        this.r = r;
    }

}
