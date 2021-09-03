/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.employee.model;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class Teller extends Employee{
     public Teller(String aName){
        name = aName;
     
    }
    
    @Override
    public void stateName(){
        super.stateName();
    }
    public Teller(){
        title = "Teller";
    }
}
