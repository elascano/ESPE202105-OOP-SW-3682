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
public abstract class B { //+1
    private float f; //+1
    private double d; //+1
    private ArrayList<G> gs = new ArrayList<>(); //+1
    
    public int operation1(int n){ //0 the abstract is missing in methods 
        return 0;
    }
    public float operation2(float f){ //0 the abstract is missing in method
        return 0;
    }
    
    public B(float f, double d, ArrayList<G> gs) { //+1
        this.f = f;
        this.d = d;
        this.gs = gs;
    }

    @Override
    public String toString() { //+1
        return "B{" + "f=" + f + ", d=" + d + ", gs=" + gs + '}';
    }
                        //+2 getters and setters
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

    /**
     * @return the gs
     */
    public ArrayList<G> getGs() {
        return gs;
    }

    /**
     * @param gs the gs to set
     */
    public void setGs(ArrayList<G> gs) {
        this.gs = gs;
    }
    
}
