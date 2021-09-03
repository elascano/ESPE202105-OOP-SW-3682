/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Employee.view;

import ec.edu.espe.Employee.model.Clerk;
import ec.edu.espe.Employee.model.Client;
import ec.edu.espe.Employee.model.Manager;
import ec.edu.espe.Employee.model.President;
import ec.edu.espe.Employee.model.Teller;

/**
 *
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public class Setup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Make manager Able's organization
        Teller lonny = new Teller("Lonny");
        Clerk cal = new Clerk("Cal");
        Manager able = new Manager("Able");
        able.add(lonny);
        able.add(cal);
        
        //Make manager Becky's organization
        Teller juanita = new Teller("Juanita");
        Teller tina = new Teller("Tina");
        Teller thelma = new Teller("Thelma");
        Manager becky = new Manager("Becky");
        becky.add(juanita);
        becky.add(tina);
        becky.add(thelma);
        
        
        //Create the president's direct reports
        President pete = President.getPresident("Pete");
        pete.add(able);
        pete.add(becky);
        
        //Initiate client
        Client.employee = pete;
        Client.doClientTasks();
        
    }
    
}
