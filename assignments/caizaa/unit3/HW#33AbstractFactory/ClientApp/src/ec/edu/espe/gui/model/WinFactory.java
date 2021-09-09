/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.gui.model;

import ec.edu.espe.gui.controller.WinButton;
import ec.edu.espe.gui.controller.WinMenu;
import ec.edu.espe.gui.model.Button;
import ec.edu.espe.gui.model.GUIFactory;
import ec.edu.espe.gui.model.Menu;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class WinFactory extends GUIFactory {

    public Button createButton() {
        return (new WinButton());
    }

    public Menu createMenu() {
        return (new WinMenu());
    }
}
