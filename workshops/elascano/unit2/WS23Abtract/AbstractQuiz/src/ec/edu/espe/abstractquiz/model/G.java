/** Copyright ESPE-DECC
*/

package ec.edu.espe.abstractquiz.model;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class G {
    private int z;

    @Override
    public String toString() {
        return "G{" + "Z=" + z + '}';
    }

    public G(int z) {
        this.z = z;
    }

    /**
     * @return the Z
     */
    public int getZ() {
        return z;
    }

    /**
     * @param z the Z to set
     */
    public void setZ(int z) {
        this.z = z;
    }
    
    

}
