/** Copyright ESPE-DECC
*/

package ec.edu.espe.abstractquiz.model;

import java.util.ArrayList;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class D extends B{   //1
    
    private int x;          //1
    private int y;          //1
    
    public boolean m(int i){    //1 the method is doing nothing, TODO program the algorithm
        boolean flag = false;
        if ((i%2)==0){
            flag = true;
        }
        return flag;
        
        //return true;
    }
    
    @Override
    public int operation1(int n) {  //1 this method should do something different than operation1 from class E
        int result;
        result = n*10;
        System.out.println("inside method operation1 of class D");
        return result;

//          System.out.println("inside method operation1 of class D");
//          return n;

//            System.out.println("inside method operation1 of class D");
//            return 0;

//            return 1;
    }

    @Override
    public float operation2(float f) {  //1
        float result;
        result = f/10.0F;
        return result;
    }

    public D(int x, int y, float f, double d, ArrayList<G> gs) {    //1
        super(f, d, gs);
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {  //1
        return "D{" + super.toString() + ", x=" + x + ", y=" + y + '}';
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
