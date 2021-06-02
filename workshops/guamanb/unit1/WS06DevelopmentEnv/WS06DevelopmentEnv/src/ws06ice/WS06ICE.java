/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws06ice;

/**
 *
 * @author Vinicio
 */
public class WS06ICE {

    public static void main(String[] args) {
        double price = 0.0F;
        double IVA = 0,12;
        double ICE = 0.75;
        double Operacion;
        double TotalICE;
        
        Scanner keyboardinput = new Scanner (System.in);
        System.out.println("WS06 Structured Progrmming using Java, by Byron Guaman");
        System.out.println("===Fee payable by ICE===");
        System.out.print("value of the purchase made ");
        price = keyboardinput.nextFloat(); 
        
        Operacion = Total(double price,);
        System.out.println("is de te betalen waarde" Operacion);
        
}
    
    public static float Total(double price,){
         float pice;
         TotalIce = price/((1 + IVA)*(1 + ICE));
         return product;
     }
}
