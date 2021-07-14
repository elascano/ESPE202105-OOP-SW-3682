/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.model.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a;
        B b;
        C c;
        D d;
        ArrayList<C> cs = null;
        B bs[] = new B[5];
        ArrayList<G> gs;
        gs = null;

        a = new A(30, 40);
        b = new D(12,12,0.9F,0.8,gs);
        System.out.println("-----------Abstract Class----------");
        System.out.println("A--->"+a);
        System.out.println("B--->"+b);
        
        
    }
    
}
