/** Copyright ESPE-DECC
*/

package ec.edu.espe.abstractquiz.model;

import java.util.ArrayList;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class C {
    private ArrayList<H> hs = new ArrayList<>(); //2
    
    public void m(F f){     //2
        System.out.println("mehtod m of class C, reveiving a parameter " + f); //-.05
    }
    
    public float m(float f){    //2
        float result;
        result = f*10;
        return result;
    }

    public C(ArrayList<H> hs) { //1
        this.hs = hs;
    }

    @Override
    public String toString() {  //1
        return "C{" + "hs=" + hs + '}';
    }
    
    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {  //1
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) { //1
        this.hs = hs;
    }
}
