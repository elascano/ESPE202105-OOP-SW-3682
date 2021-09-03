/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.guifactory.view;

import ec.espe.edu.guifactory.model.Button;
import ec.espe.edu.guifactory.model.GUIFactory;

/**
 *
 * @ @author Gualotuña Richard INNOVA CODE
 */
public class ClientApp {
    public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        aButton.caption = "Play";
        aButton.paint();
    }
}
