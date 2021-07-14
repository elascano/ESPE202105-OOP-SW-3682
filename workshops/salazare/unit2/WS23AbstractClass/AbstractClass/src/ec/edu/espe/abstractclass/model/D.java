/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclass.model;

import java.util.ArrayList;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class D extends B {
    private int x;
    private int y;

    public D(int x, int y, float b, double d) {
        super(b, d);
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "D{" + "x=" + x + ", y=" + y  + super.toString()+'}';
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
    
    public boolean m(int i){
        return true;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
}
