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
public class D extends B{ //+1
    private int x;        //+1
    private int y;        //+1
    
    public boolean m(int i){ //+1 the method is doing nothing, TODO program the algorithm
        /*
        boolean flag = false;
        if (i%2==0){
            flag = true;
        }
        return flag;
        */
        return true;
    }

    // the two methods inherited from the parent class B are missing -2
    
    public D(int x, int y, float f, double d, ArrayList<G> gs) { //+1
        super(f, d, gs);
        this.x = x;
        this.y = y;
    }
    
    public D(float f, double d, ArrayList<G> gs) {
        super(f, d, gs);
    }

    @Override
    public String toString() { //+1
        return "D{" + super.toString() + "x=" + x + ", y=" + y + '}';
    }

                                //+2 getters and setters
                            
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
