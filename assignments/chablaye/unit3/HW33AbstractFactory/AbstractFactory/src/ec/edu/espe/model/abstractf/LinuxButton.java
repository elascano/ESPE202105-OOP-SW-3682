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
public class LinuxButton implements Button{

    @Override
    public void paint(String color) {
        System.out.println("El boton ha sido pintado de color: " +color);
    }

    
}
