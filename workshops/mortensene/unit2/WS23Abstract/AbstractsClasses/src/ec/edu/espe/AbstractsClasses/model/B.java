/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.AbstractsClasses.model;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public abstract class B {
    private float f;
    private double d;
    private ArrayList<G>gs=new ArrayList<>(1);
    private D dsArray []=new D[1];
    private E esArray []=new E[1];

    public B(float f, double d) {
        this.f = f;
        this.d = d;
    }

    @Override
    public String toString() {
        return "B{" + "f=" + getF() + ", d=" + getD() + ", g=" + getG() + '}';
    }
    
    
    
    public static void operation(int n){
   
   }
   public static void operation2(float f){
  
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
     * @return the g
     */
    public ArrayList<G> getG() {
        return gs;
    }

    /**
     * @param g the g to set
     */
    public void setG(ArrayList<G> g) {
        this.gs = gs;
    }

    public void operation1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void operation1(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
