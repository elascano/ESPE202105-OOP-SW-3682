/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.guifactory.model;

/**
 *
 * @author Cristian Félix InnovaCode ESPE-DCCO
 */
public class LinuxFactory extends GUIFactory {
    
    public Button createButton() {
        return new LinuxButton();
    }

    public Menu createMenu() {
        return new LinuxMenu();
    }
    
}
