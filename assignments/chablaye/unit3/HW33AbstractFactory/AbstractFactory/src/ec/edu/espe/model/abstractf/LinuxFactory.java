/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model.abstractf;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class LinuxFactory implements GUIFactory{

    @Override
    public void getFactory() {
        System.out.println("Linux Factory");
    }

    @Override
    public Button createButton() {
        LinuxButton linuxB = new LinuxButton();
        linuxB.paint("Gris");
        return linuxB;
    }

    @Override
    public Menu createMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
