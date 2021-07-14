/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclass.model;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class E extends B {
    private float p;
    private float q;

    public E(float p, float q, float b, double d) {
        super(b, d);
        this.p = p;
        this.q = q;
    }

    @Override
    public String toString() {
        return "E{" + "p=" + p + ", q=" + q +  super.toString()+'}';
    }
    
    
     @Override
    public int operation1(int n){
        System.out.println("the class D heritance class B"); 
        return 0;
    }
    
     @Override
     public float operation2(float f){
         System.out.println("The class D heritance class B");
         return 0.0F;
     }
     
    public int m1(boolean b){
        return 1;
    }

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
