/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class B {
    private int a;
    private int b;
    private ArrayList<E> es = new ArrayList<>();
    
    public B(int a, int b){
        this.a = a;
        this.b = b;
        
    }

        
    public void showData(){
        System.out.println("The a is: " +a);
        System.out.println("The b is: " +b);
        System.out.println("The ES is: " +es);
               
    }

       
    public C m1(F f){
        System.out.println("inside mothod B.m1(), that receives and object f ->"
        +f+ "and returning a C object");
        return new C();
    }

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
     * @return the es
     */
    public ArrayList<E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList<E> es) {
        this.es = es;
    }
   
    B() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
