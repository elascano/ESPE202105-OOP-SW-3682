/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.guifactory.view;

import ec.edu.espe.guifactory.model.Button;
import ec.edu.espe.guifactory.model.GUIFactory;
import ec.edu.espe.guifactory.model.LinuxButton;
import ec.edu.espe.guifactory.model.MacMenu;
import ec.edu.espe.guifactory.model.WinFactory;
import java.awt.Menu;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class ClientApp {
    
    public static void main(String[] args) {
         WinFactory wfactory = new WinFactory();
         LinuxButton lbutton = new LinuxButton();
         MacMenu mcmenu = new MacMenu();
         wfactory.createButton();
         lbutton.paint();
         mcmenu.paint();
         
    }
    
}
