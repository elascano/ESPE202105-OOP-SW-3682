/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberto;

import ec.edu.espe.model.Person;

/**
 *
 * @author Vinicio Guaman The Programers ESPE-DCCO
 */
public class Alberto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Byron Guaman");
        
        Person person = new Person("Alberto Perez", 17323245, 3087121);
        
        System.out.println(person);
    }
}

