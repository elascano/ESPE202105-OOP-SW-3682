/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class G {
    private int z; //+2

    public G(int z) { //+2
        this.z = z;
    }

    @Override
    public String toString() { //+2
        return "G{" + "z=" + z + '}';
    }

    /**
     * @return the z
     */
    public int getZ() { //+2
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(int z) { //+2
        this.z = z;
    }
    
}
