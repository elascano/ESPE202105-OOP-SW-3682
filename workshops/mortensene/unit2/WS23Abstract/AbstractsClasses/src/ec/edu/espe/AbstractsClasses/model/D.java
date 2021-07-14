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
public class D extends B { //1
    private int x;          //1
    private int y;          //1

    public D(float f, double d) {//Worng constructor implementation, the class must have the father's class atributes.
        super(f, d);
    }

    //operation 1 and operation2 methods are missing.

    @Override
    public String toString() {
        return "D{" + "x=" + getX() + ", y=" + getY() + '}';
    }
    
    public static void m(int i){//Wrong method implementation.
    
    }

    //2
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
