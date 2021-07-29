/** Copyright ESPE-DECC
*/

package ec.edu.espe.theoretical.model;

/**
 *
 * @author Edison Lascano Hypertech ESPE-DCCO
 */
public class D {
    private boolean b;
    
    public B m(){
        System.out.println("inside D.m() method that returns a B object");
        return new B();
    }
    
    public int m(F f)
    {
        System.out.println("inside D.m(f) method that receives f -> " + f);
        return 0;
    }

    /**
     * @return the b
     */
    public boolean isB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(boolean b) {
        this.b = b;
    }
}
