/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.factory.model;

/**
 *
 * @author Myckel Chamorro ESPE-POO
 */
public class LinuxMenu extends Menu{

    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu:" + caption);
    }
    
}
