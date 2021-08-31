/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.employee.model;

/**
 *
 * @author Cristian Félix InnovaCode ESPE-DCCO
 */
public class Manager extends Supervisor {
    public Manager(String aName){
        this();
        name = aName;
    }
    
    public Manager(){
        super();
        title = "Manager";
    }
    
    @Override
    public void stateName(){
        super.stateName();
    }
}
