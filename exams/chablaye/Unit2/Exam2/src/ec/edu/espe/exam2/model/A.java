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
public class A {
    private ArrayList<A> as = new ArrayList<>();
    private String name;
    private String id;

    public A(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public ArrayList<A> getAs() {
        return as;
    }

    public void setAs(ArrayList<A> as) {
        this.as = as;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
}
