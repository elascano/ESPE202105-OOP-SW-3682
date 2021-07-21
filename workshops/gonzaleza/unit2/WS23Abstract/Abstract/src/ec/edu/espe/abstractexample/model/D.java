/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractexample.model;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class D extends B {
    private int x;
    private int y;

    @Override
    public String toString() {
        return "D{" + super.toString() + "x=" + x + ", y=" + y + '}';
    }

    public D(int x, int y, float f, double d) {
        super(f, d);
        this.x = x;
        this.y = y;
    }

    public D() {
    }
    
    public boolean m(int i){
        return true;
    }
    
    @Override
    public int operation1(int n) {
        return 1;
    }

    @Override
    public float operation2(float f) {
        return 1.1F;
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
