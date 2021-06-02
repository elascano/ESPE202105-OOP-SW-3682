/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice.impuesto.a.los.consumos.especiales;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class WS06DevelopmentEnv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerofcigarrettes;
        int totalcigarettes;
        int ICE;
        
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("Product -> cigarete");
        System.out.println("Ingrese los numeros de paquetes");
        int box = keyboardinput.nextInt();
        System.out.println("Ingrese el total de cajetillas");
        int packs = keyboardinput.nextInt();
        System.out.println("Ingrese el numer de cigarrilos ");
        numerofcigarrettes= keyboardinput.nextInt();
        totalcigarettes= packs * numerofcigarrettes;
        System.out.println("El total de cigarrillo es " + totalcigarettes);
        ICE=
     }
    
}
