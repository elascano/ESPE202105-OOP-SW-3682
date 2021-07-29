
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.AbstractsClasses.model;

/**
 *
 * @author pc
 */
public class E extends B { //1
    private float p; //1
    private float q; //1

    public E(float f, double d) {//p and q are missing.
        super(f, d);
    }

    //Does not have the abstract methods of the father's class.
    

    @Override
    public String toString() {//0.5 super toString part is missing
        return "E{" + "p=" + getP() + ", q=" + getQ() + '}';
    }
    
    public static void m1(boolean b){//Wrong method implementation.
    
    }

    //2
    /**
     * @return the p
     */
    public float getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(float p) {
        this.p = p;
    }

    /**
     * @return the q
     */
    public float getQ() {
        return q;
    }

    /**
     * @param q the q to set
     */
    public void setQ(float q) {
        this.q = q;
    }
}
