/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.AbstractsClassses.view;

import ec.edu.espe.AbstractsClasses.model.B;
import ec.edu.espe.AbstractsClasses.model.D;
import ec.edu.espe.AbstractsClasses.model.E;
import static java.awt.PageAttributes.MediaType.B;

/**
 *
 * @author pc
 */
public class AbstractsClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          B b = new D(0, 0.F);
        b = new E(1.2F, 1.6F);
        System.out.println("E->"+ b);
        b = new D(1, 1); 
         System.out.println("D->"+ b);
         b.operation1(0);
         b.operation2(0.0F);
        // TODO code application logic here
    }
    
}
