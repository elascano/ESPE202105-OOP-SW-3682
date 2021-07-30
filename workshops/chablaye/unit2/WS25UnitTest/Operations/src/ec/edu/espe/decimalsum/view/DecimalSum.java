/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.decimalsum.view;

import java.util.Scanner;
import utils.Tax;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class DecimalSum {

    public static void main(String[] args) {
        float num1=5.5F;
        float num2=7.6F;
        float result;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("                     --| SUMA CON DECIMALES |--");
        System.out.println("El resultado de la suma entre el numero " +num1+ " y el numero " +num2+ " es:");
        result = Tax.calculateSum(num1, num2);
        System.out.println("-> " +result);
        
        System.out.println("                    --| RESTA CON DECIMALES |--");
        System.out.println("El resultado de la resta entre el numero " +num1+ " y el numero " +num2+ " es:");
        result = Tax.calculateSubtraction(num1, num2);
        System.out.println("-> " +result);
    }
    
}
