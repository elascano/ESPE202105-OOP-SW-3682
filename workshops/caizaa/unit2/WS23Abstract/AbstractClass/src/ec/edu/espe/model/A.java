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
public class A {
    private int a; //+1
    private int b; //+1
    private A as[] = new A[2]; //+1
    private B bs[] = new B[5]; //+1
    private ArrayList<C> cs = new ArrayList<>(); //+1

    public A(int a, int b, A[] as, B[] bs, ArrayList<C> cs) { //+1
        this.a = a; //this may not work
        this.b = b;
        this.as = as;
        this.bs = bs; //this may not work
        /*for (int i = 0; i< bs.length; i++){
            this.as[i] = as[i];
        }*/
        this.cs = cs;
    }

    private A() { 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public A m(int m, int n){ //0.5 not return new A(m, n, as, bs, cs);
        return new A();
        //return new A(m, n, as, bs, cs);
    }
    
    public A m(){ //0.5
        //return new A(0, 0, as, bs, cs);
        return new A();
    }
    
    @Override
    public String toString() { //+1
        return "A{" + "a=" + a + ", b=" + b + ", as=" + as + ", bs=" + bs + ", cs=" + cs + '}';
    }

                        //+1 getters and setters
                
    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the as
     */
    public A[] getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(A[] as) {
        this.as = as;
    }

    /**
     * @return the bs
     */
    public B[] getBs() {
        return bs;
    }

    /**
     * @param bs the bs to set
     */
    public void setBs(B[] bs) {
        this.bs = bs;
    }

    /**
     * @return the cs
     */
    public ArrayList<C> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }
    
    
}
