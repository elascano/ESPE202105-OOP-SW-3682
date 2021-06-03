/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws06;
import java.util.Scanner;
/**
 *
 * @author Familia Solano
 */
public class WS06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int amount;
        int packsCigarettes;
        int units;
        float importCost;
        
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("***** EXCISE TAX FOR CIGARETTES *****");
        System.out.println("Enter the number of cigarette packs");
        packsCigarettes=keyboardinput.nextInt();
        System.out.println("Enter units per package");
        units=keyboardinput.nextInt();
        amount = packsCigarettes*units;
        importCost=computelce(amount);
        System.out.println("The cost of " + packsCigarettes + " packs with " + units + " units is " + importCost);
    }
    public static float computelce(int amount){
        float importCost;
        importCost = (float) (amount * 0.16);
        return importCost;
    }
}
