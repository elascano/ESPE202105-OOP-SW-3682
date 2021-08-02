/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.model;

import java.util.ArrayList;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class B extends A{

    public B(ArrayList<A> as) {
        super(as);
    }
    public void bh(){
        System.out.println("class H ->" + G);
    }
    
}
