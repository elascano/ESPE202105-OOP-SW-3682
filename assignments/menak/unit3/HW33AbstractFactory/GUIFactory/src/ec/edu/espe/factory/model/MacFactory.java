/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.factory.model;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class MacFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return(new MacButton());
        
    }

    @Override
    public Menu createMenu() {
       return (new MacMenu());
    }
    
    
}
