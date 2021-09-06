/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.GUIFactory.view;

import ec.edu.espe.GUIFactory.model.Button;
import ec.edu.espe.GUIFactory.model.GUIFactory;

/**
 *
 * @author Asmal Kevin
 */
public class ClientApp {
    /**
     */
    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
    }
    
}
