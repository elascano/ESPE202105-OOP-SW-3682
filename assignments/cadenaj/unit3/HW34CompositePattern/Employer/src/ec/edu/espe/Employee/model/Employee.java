/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Employee.model;

/**
 *
 * @author jejoc
 */
public abstract class Employee {
    String name = "not assigned";
    String title = "not assigned";
    
    public void stateName(){
        System.out.println(title + "" + name);
    }
}
