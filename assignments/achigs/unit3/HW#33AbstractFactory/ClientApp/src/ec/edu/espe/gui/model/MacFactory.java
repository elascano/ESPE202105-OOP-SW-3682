/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.gui.model;

import ec.edu.espe.gui.controller.MacButton;
import ec.edu.espe.gui.controller.MacMenu;
import ec.edu.espe.gui.model.Button;
import ec.edu.espe.gui.model.GUIFactory;
import ec.edu.espe.gui.model.Menu;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class MacFactory extends GUIFactory{

    public Button createButton() {
        return (new MacButton());
    }

    public Menu createMenu() {
        return (new MacMenu());
    }
}
