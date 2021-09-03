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
public abstract class GUIFactory {

    public abstract GUIFactory getFactory();
    public abstract Button createButton();
    public abstract Menu createMenu();
}
