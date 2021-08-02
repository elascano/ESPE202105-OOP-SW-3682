/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2.model;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class F {
    private int extras;

    public F() {
    }

    public F(int extras) {
        this.extras = extras;
    }

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "F{" + "extras=" + extras + '}';
    }
    
}
