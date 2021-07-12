/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractclass.view;

import ec.edu.espe.abstractclass.model.B;
import ec.edu.espe.abstractclass.model.D;
import ec.edu.espe.abstractclass.model.E;
import java.util.ArrayList;

/**
 * @author Portilla Diego  NullPointers ESPE-DCC
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class Abstract {  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<B>bs = new ArrayList<>();
    
        B b = new D(0, 0, 0.F, 0);
        b = new E(1.5F, 1.2F, 1.3F, 7.0);
        System.out.println("E->"+ b);
        b = new D(1, 1, 1.1F, 1.1); 
         System.out.println("D->"+ b);
         b.operation1(0);
         b.operation2(0.0F);
    }
   
}

