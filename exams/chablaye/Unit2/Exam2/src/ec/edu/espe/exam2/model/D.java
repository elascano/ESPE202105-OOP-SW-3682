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
public class D extends A{
    private int age;
    E esArray[] = new E[5];
    private ArrayList<F> fs = new ArrayList<>();

    public D(int age, String name, String id) {
        super(name, id);
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "D{" + "age=" + age + '}';
    }
    
    public void watchProotion(){
        System.out.println("Esta viendo la promcion");
    }
    
    public void extra(){
        System.out.println("Se ha ganado un extra.");
    }
    
}
