/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incometax;

import ec.edu.espe.utils.Archive;
import java.util.Scanner;
import utils.Tax;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String route = "C:\\Users\\steve\\Desktop\\BookstoreProyect\\06-Code\\Bookstore\\file\\jsonFile.txt";
        
        Scanner scan = new Scanner(System.in);
        int option;
        int op;
        float salary;
        float expensive;
        float anualSalary;
        float incomeTax;
        do{
            System.out.println("\n\n1. Calculate Income Intax");
            System.out.println("0. leave.");
            System.out.println("ingrese una opcion: ");
            option = scan.nextInt();
            switch(option){
            case 1:
                System.out.println("\nEnter the mensual salary: ");
                salary = scan.nextFloat();
                System.out.println("\nEnter the expensives: ");
                expensive = scan.nextFloat();
                anualSalary = Tax.computeAnnualIncome(salary);
                incomeTax = Tax.computeIncomeTax(anualSalary, expensive);
                System.out.println("Your anual salary is: " + anualSalary 
                            + " your total income Tax is: " + incomeTax);
                Archive.writeArchive(route, );
                break;
            case 0:
                System.out.println("thanks");
                break;
            default:
                System.out.println("try agaun principal");
                break;
            }
        }while(option!=0);
    }
    
}
