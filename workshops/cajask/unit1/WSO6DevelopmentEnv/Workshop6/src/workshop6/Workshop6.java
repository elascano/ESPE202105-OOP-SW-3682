/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop6;

import java.util.Scanner;

/**
 *
 * @author Karlita
 */
public class Workshop6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int individualcigarette;
        int packcigarette;
        int cigarette;
        int ICE;
        
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("WS  06 ICE USING JAVA BY LIZBETH CAJAS");
        System.out.println("===ICE SPECIAL CALCULATION===");
        System.out.println("cigarette");
        System.out.println("ingrese el numero de paquetes");
        packcigarette = keyboardinput.nextInt();
        System.out.println("ingrese las cagetillas por paquete");
        individualcigarette = keyboardinput.nextInt();
        System.out.println("ingrese el numero de cigarrillos por paquete");
        cigarette = keyboardinput.nextInt();
        float ice = ICE(individualcigarette, cigarette);
        System.out.println(" el valor de ice es " +packcigarette+ " el paquete de cigsrillos es " +ice+ "$" );
        
        
        
        // TODO code application logic here
    }

    private static float ICE(int individualcigarette, int cigarette){
        float ice=0;
        ice = (individualcigarette*cigarette)*0.16F;
        return ice;
    }
    
}
