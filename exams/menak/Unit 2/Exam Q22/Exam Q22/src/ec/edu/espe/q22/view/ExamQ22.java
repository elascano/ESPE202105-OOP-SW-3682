/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.q22.view;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class ExamQ22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sn = new Scanner(System.in);
        boolean exit = false;

        int opcion; //Guardaremos la opcion del usuario
        
        while (!exit) {

            System.out.println("PRESS 1: VIEW A");
            System.out.println("PRESS 2: VIEW B");
            System.out.println("PRESS 3: VIEW C");
            System.out.println("PRESS 4: D");
            System.out.println("PRESS 5: VIEW E");
            System.out.println("PRESS 6: VIEW F");
            System.out.println("PRESS 7: VIEW G");
            System.out.println("PRESS 8: VIEW H");
            System.out.println("PRESS 9: VIEW I");
            System.out.println("PRESS 10: VIEW J");
            System.out.println("PRESS 11: EXIT");


            try {

            System.out.println("Choose one option");
            opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        A();
                        break;
                    case 2:
                        B();
                        break;
                    case 3:
                        
                        break;
                    case 4:
                                           
                        break;
                    case 5:
                         
                        break;
                    case 6:
                        
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        System.out.println("THANK YOU FOR USING OUR STORE, HAVE A NICE DAY!!");
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

    private static void A() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void B() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
