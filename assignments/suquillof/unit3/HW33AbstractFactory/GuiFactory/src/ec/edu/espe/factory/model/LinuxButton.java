/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.factory.model;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class LinuxButton extends Button{
    @Override
    public void paint() {
        System.out.println("LinuxButton:" + caption);
    }
    
}
