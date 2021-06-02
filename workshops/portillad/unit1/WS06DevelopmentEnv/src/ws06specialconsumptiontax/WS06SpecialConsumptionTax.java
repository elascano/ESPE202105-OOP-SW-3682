/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws06specialconsumptiontax;

import java.util.Scanner;
/**
 *
 * @author Diego Portilla
 */
public class WS06SpecialConsumptionTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int box;
        int packs;
        float TotalICE;
        
        
        System.out.println("WS 06 SSpecial Comsumption Tax Diego Portilla");
        System.out.println("ingrese el producto");
        System.out.println("Cigarrillos");
          
        tobaccotax();
    }
       
    public static void tobaccotax(){
        float box;
        float packs;
        float numberofcigarettes;
        float totalcigarettes;
        float ICE;
        float Descuent= 0.16F;
        
        
        Scanner Keyboardinput = new Scanner(System.in);
        System.out.println("Producto -> Tabacos");
        System.out.println("Ingrese el numero de paquetes");
        box = Keyboardinput.nextFloat();
        System.out.println("Ingrese el total de cajetillas por paquete");
        packs = Keyboardinput.nextFloat();
        System.out.println("Ingrese el numero de cigarrillos por cagetilla");
        numberofcigarettes = Keyboardinput.nextFloat();
        totalcigarettes=packs*numberofcigarettes;
        System.out.println("El total de cigarrillos es " + totalcigarettes);
        ICE= totalcigarettes * Descuent;
        System.out.println("El total del ICE causado es: " + ICE);
    }
}

