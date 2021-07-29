/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class C {
    private ArrayList<H> hs = new ArrayList<>(); //+2
    
    public C(ArrayList<H> hs) { //1
        this.hs = hs;
    }
    
    public void m(F f){ //-0.5 not printing anything
        // System.out.println("method m of class C, reveiving a parameter + f");
    }
    
    public float m(float f){ //-0.5 not printtig anything in two methods
        /* float result;
        result = f*10;
        return result;
        */
        return 0;
    }

    @Override
    public String toString() { //1
        return "C{" + "hs=" + hs + '}';
    }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() { //1
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) { //1
        this.hs = hs;
    }
    
}
