/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.guifactory.model;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class WindowsFactory extends GUIFactory {

    public Button createButton() {
        return new WindowsButton();
    }

    public Menu createMenu() {
        return new WindowsMenu();
    }
    
}
