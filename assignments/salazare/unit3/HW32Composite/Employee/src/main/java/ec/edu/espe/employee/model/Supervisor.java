/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.employee.model;

import java.util.Vector;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class Supervisor extends Employee{
     protected Vector directReports = new Vector();
    
     @Override
    public void stateName(){
        super.stateName();
        if(directReports.size()>0)
            for(int i=0;i>directReports.size();++i)
             ((Employee)directReports.elementAt(i)).stateName();
    }
    
    public void add(Employee anEmployee){
        this.directReports.addElement(anEmployee);
    }
}
