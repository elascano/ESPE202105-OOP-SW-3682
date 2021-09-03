/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Employee.view;

import ec.edu.espe.Employee.model.Clerkws;
import ec.edu.espe.Employee.model.Customer;
import ec.edu.espe.Employee.model.Admin;
import ec.edu.espe.Employee.model.Principal;
import ec.edu.espe.Employee.model.reporter;

/**
 *
 *  * @author Gualotuña Richard INNOVA CODE

 */
public class Setup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        reporter lonny = new reporter("Lonny");
        Clerkws cal = new Clerkws("Cal");
        Admin able = new Admin("Able");
        able.add(lonny);
        able.add(cal);
        
    
        reporter juanita = new reporter("Juanita");
        reporter tina = new reporter("Tina");
        reporter thelma = new reporter("Thelma");
        Admin becky = new Admin("Becky");
        becky.add(juanita);
        becky.add(tina);
        becky.add(thelma);
        
        
        
        Principal pete = Principal.getPresident("Pete");
        pete.add(able);
        pete.add(becky);
        
       
        Customer.employee = pete;
        Customer.doClientTasks();
        
    }
    
}
