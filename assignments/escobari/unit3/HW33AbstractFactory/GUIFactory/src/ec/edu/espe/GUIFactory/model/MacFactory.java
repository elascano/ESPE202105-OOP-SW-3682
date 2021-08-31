/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.GUIFactory.model;

import java.awt.Menu;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class MacFactory extends GUIFactory {

    public Button createButton() {
        return(new MacButton());
        
    }

    public Menu createMenu() {
       return (new MacMenu());
    }
    
    
}
