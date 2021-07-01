/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incometax;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
        String route = "C:\\Users\\steve\\Desktop\\ESPE202105-OOP-SW-3682\\workshops\\achigs\\unit2\\WS19Libraries\\IncomeTax";
        String jsonTax;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
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
                String printTax= "your salary is: "+ anualSalary + " your income tax is: " +incomeTax;
                System.out.println(printTax);
                jsonTax = gson.toJson(printTax);
                Archive.writeArchive(route, printTax);
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
