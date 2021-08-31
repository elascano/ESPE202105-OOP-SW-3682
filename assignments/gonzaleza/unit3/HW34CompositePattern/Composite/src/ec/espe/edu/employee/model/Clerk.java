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
public class Clerk extends Employee {
    
    public Clerk(String aName){
        this();
        name = aName;
    }
    
    public void stateName(){
        super.stateName();
    }
    
    public Clerk(){
        title = "Clerk";
    }
}
