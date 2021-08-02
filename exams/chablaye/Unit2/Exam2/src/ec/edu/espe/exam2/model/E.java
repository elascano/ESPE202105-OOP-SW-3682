/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2.model;

import java.util.ArrayList;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class E {
    private String promotion;

    public E() {
    }

    public E(String promotion) {
        this.promotion = promotion;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "E{" + "promotion=" + promotion + '}';
    }
    
}
