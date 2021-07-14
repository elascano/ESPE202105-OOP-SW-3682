/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclasses.model;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public class G {
    
    private int z;

    @Override
    public String toString() {
        return "G{" + "z=" + z + '}';
    }

    public G(int z) {
        this.z = z;
    }

    public G(){
        z=0;
    }
    /**
     * @return the z
     */
    public int getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(int z) {
        this.z = z;
    }

}
