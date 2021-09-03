/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.gui.controller;

import ec.edu.espe.gui.model.Button;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class MacButton extends Button{
    public void paint() {
        System.out.println("I'm a MacButton: " + caption+ "\n\n");
    }
}
