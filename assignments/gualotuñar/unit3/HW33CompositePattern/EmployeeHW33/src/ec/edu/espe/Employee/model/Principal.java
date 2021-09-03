/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Employee.model;

/**
 *
 * @@author Gualotuña Richard INNOVA CODE
 */
public class Principal extends Supervisor{
    private static Principal president = new Principal();
    
    private Principal(String aName){
        this();
        name = aName;
    }
    private Principal(){
        super();
        title = "President";
    
    }
    @Override
    public void stateName(){
        super.stateName();
    }
    public static Principal getPresident(String aName){
        president.name = aName;
        return Principal.president;
    }
}
