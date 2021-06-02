/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws06taxtospecialconsumption;

import java.util.Scanner;
/**
 *
 * @author MILTON
 */
public class WS06taxToSpecialConsumption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float TaxSpecialConsumption;
        int numberOfPacks;
        int cigarettesPerBox;
        int totalUnitQuantityOfCigarettes;
         
        
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("WS 06 Tax on Special Consumption usiong Java by Steven Jossue Achig Toapanta");
        System.out.println("=== CIGARRETTES ===");
        System.out.println("Enter the number of Packs");
        System.out.print("Number of packs: ");
        numberOfPacks = keyboardinput.nextInt();
        System.out.println("Enter the number of cigarettes per box");
        System.out.print("Number of of cigarettes per box: ");
        cigarettesPerBox = keyboardinput.nextInt();
        totalUnitQuantityOfCigarettes = findingTotalCigarettes(numberOfPacks, cigarettesPerBox);
        TaxSpecialConsumption = (float) (totalUnitQuantityOfCigarettes*0.16);
        System.out.println("ICE = " + TaxSpecialConsumption);
    }
    public static int findingTotalCigarettes(int numberOfPacks, int cigarettesPerBox){
        return numberOfPacks*cigarettesPerBox;
    }
}
