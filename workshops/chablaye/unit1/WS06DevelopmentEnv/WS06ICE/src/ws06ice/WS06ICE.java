/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws06ice;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class WS06ICE {
    public static void main(String[] args) {
        int packOfCigarettes;
        int individualPacks;
        int cigarettes;
        float ice;
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("WS 06 ICE using Java, by Esteban Chablay");
        System.out.println("--ICE CALCULATION--");
        System.out.println("Cigarrilos");
        System.out.println("Ingrese el No. de paquetes: ");
        packOfCigarettes = keyboardinput.nextInt();
        System.out.println("Ingrese las cajetillas por paquete: ");
        individualPacks = keyboardinput.nextInt();
        System.out.println("Ingrese los cigarrillos por caja: ");
        cigarettes = keyboardinput.nextInt();
        ice = ICE(individualPacks, cigarettes);
        System.out.println("El valor del ICE al comprar " +packOfCigarettes+ " paquete de cigarrillos es: " +ice+ "$");
        
        
    }
    
    public static float ICE(int individualPacks, int cigarettes){
        float ice=0;
        ice = (individualPacks*cigarettes)*0.16F;
        return ice;
    }
    
}
