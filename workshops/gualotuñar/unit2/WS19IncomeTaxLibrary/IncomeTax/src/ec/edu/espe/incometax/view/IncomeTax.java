/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.incometax.view;

import ec.espe.edu.utils.IncomeTaxLi;
import java.util.Scanner;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float salary;
        float deductibleExpenses;
        float incomeTax;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insert your monthly salary: ");
        salary = scan.nextFloat();
        scan.nextLine();
        
        System.out.println("Insert your deductible expenses per year: ");
        deductibleExpenses = scan.nextFloat();
        scan.nextLine();
        
        incomeTax = IncomeTaxLi.calculateIncomeTax(salary, deductibleExpenses);
        System.out.println(incomeTax);
    }
}
