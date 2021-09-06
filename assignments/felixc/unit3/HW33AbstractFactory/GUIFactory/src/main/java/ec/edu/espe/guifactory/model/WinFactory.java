/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.guifactory.model;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class WinFactory extends GUIFactory{
     public Button createButton() {
        return(new WinButton());
    }

    public Menu createMenu() {
        return (new WinMenu());
        
    }

    @Override
    public GUIFactory getFactory() {
        return (new WinFactory());
    }

}
