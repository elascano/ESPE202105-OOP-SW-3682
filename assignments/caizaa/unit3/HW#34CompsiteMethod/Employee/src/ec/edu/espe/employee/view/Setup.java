/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.employee.view;

import ec.edu.espe.employee.model.Clerk;
import ec.edu.espe.employee.model.Client;
import ec.edu.espe.employee.model.Manager;
import ec.edu.espe.employee.model.President;
import ec.edu.espe.employee.model.Teller;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
public class Setup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teller lonny = new Teller("Lonny");
        Clerk cal = new Clerk("Cal");
        Manager able = new Manager("Able");
        able.add(lonny);
        able.add(cal);

        Teller juanita = new Teller("Juanita");
        Teller tina = new Teller("Tina");
        Teller thelma = new Teller("Thelma");
        Manager becky = new Manager("Becky");
        becky.add(juanita);
        becky.add(tina);
        becky.add(thelma);

        President pete = President.getPresident("Pete");
        pete.add(able);
        pete.add(becky);

        Client.employee = pete;
        Client.doClientTasks();

    }

}
