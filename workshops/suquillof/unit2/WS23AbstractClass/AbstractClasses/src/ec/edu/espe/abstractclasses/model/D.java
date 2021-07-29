/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclasses.model;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class D extends B{//1
    
    private int x;//1
    private int y;//1

    @Override
    public String toString() {//1
        return "D{" + super.toString() + "x=" + x + ", y=" + y + '}';
    }

    public D(int x, int y, float f, double d) {//0.80
        super(f, d);
        this.x = x;
        this.y = y;
        //missing the arrayList 
    }
    
    public boolean m(int i){//1 the method is doing nothing, TODO,program the algoritm
        return false;
    }

    @Override
    public int operation1(int n) {//1 the method is should do something differnet that open 
        System.out.println("class D Inherits operation1 from class B");
       return 0;
    }

    @Override
    public float operation2(float f) {//1 the method is should do something different that open 
        System.out.println("class D Inherits operation2 from class B");
        return 0;
    }

    /**
     * @return the x
     */
    public int getX() {//1
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
