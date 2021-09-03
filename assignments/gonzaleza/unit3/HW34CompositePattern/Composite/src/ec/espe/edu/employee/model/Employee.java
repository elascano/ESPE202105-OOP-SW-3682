/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.employee.model;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public abstract class Employee {
    String name = "not assigned yet";
    String title = "not assigned yet";
    
    public void stateName(){
        System.out.println(title + " " + name);
    }
}
