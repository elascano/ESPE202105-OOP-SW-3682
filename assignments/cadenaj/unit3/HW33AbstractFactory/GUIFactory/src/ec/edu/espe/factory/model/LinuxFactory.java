/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.factory.model;

/**
 *
 * @author jejoc
 */
public class LinuxFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return(new LinuxButton());
    }

    @Override
    public Menu createMenu() {
        return(new LinuxMenu());
    }
    
    
}
