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
public class C extends A{
    private String work;
    private ArrayList<E> es = new ArrayList<>();

    public C(String work, String name, String id) {
        super(name, id);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "C{" + "work=" + work + '}';
    }
    
    public void watchPromotion(){
        E promotion = new E("Promoticion 1");
        System.out.println("El cliente esta viendo " +promotion);
    }

    
    
    
}
