/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Vinicio Guaman The Programers ESPE-DCCO
 */
public class Books {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!exit) {
 
            System.out.println("1: Title");
            System.out.println("2: Author");
            System.out.println("3: editorial");
            System.out.println("4: year of publication");
 
            try {
 
                System.out.println("What do you want to find?");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Title");
                        break;
                    case 2:
                        System.out.println("Author");
                        break;
                    case 3:
                        System.out.println("editorial");
                        break;
                    case 4:
                        System.out.println("year of publication");
                        exit = true;
                        break;
                    default:
                        System.out.println("you haven´t choosed any option, please try again");
                }
            } catch (InputMismatchException e) {
                sn.next();
            }
        }
    
}
