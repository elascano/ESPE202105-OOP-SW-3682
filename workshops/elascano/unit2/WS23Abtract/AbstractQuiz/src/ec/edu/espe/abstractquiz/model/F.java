/** Copyright ESPE-DECC
*/

package ec.edu.espe.abstractquiz.model;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class F {
    private String r;   //2

    @Override
    public String toString() {  //2
        return "F{" + "r=" + r + '}';
    }
    
    public F(String r) {    //2
        this.r = r;
    }
    
    /**
     * @return the r
     */
    public String getR() {  //2
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(String r) {    //2
        this.r = r;
    }

}
