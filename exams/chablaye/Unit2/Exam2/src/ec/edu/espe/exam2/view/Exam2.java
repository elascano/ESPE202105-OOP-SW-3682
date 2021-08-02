/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2.view;

import ec.edu.espe.exam2.model.B;
import ec.edu.espe.exam2.model.C;
import ec.edu.espe.exam2.model.D;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class Exam2 {
    public static void main(String[] args) {
        System.out.println("|--TARJETAS BANCARIAS SEGUN EDADES--|");
        B b = new B("ESPE", "Juan", "3123");
        C c = new C("Casher", "Juana", "5126");
        D d = new D(66, "Marco", "6123");
        
        System.out.println("Cliente universitario: ");
        b.pagar();
        
        System.out.println("Cliente trabajador: ");
        c.watchPromotion();
        
        System.out.println("Cliente mayor de edad: ");
        d.extra();
        d.watchProotion();
        
    }
    
}
