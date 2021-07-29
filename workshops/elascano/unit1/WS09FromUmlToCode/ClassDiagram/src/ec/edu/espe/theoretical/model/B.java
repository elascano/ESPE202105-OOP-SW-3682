/** Copyright ESPE-DECC
*/

package ec.edu.espe.theoretical.model;

import java.util.ArrayList;

/**
 *
 * @author Edison Lascano Hypertech ESPE-DCCO
 */
public class B {
    private int a;
    private int b;
    private ArrayList<E> es = new ArrayList<>();
    
    public C m1(F f){
        System.out.println("inside method B.m1(f), that receives an object f -> " 
                + f + " and returns a C object");
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

}
