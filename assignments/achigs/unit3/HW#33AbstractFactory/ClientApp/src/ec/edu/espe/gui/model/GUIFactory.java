/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.gui.model;

import ec.edu.espe.gui.model.Menu;
import ec.edu.espe.gui.model.Button;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public abstract class GUIFactory {

    public static GUIFactory getFactory(int option) {
        GUIFactory factory = null;

        if (option == 0)
            factory = new WinFactory();
        else if (option == 1)
            factory = new LinuxFactory();
        else if(option == 2)
            factory = new MacFactory();
        else
            System.out.println("ingrese un numero dentro de las opciones");
        
        return factory;
    }

    public abstract Button createButton();

    public abstract Menu createMenu();
}
