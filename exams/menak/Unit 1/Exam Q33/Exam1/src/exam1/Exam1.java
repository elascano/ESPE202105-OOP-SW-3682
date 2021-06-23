/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class Exam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int opcion;
        

        while (!exit) {

            System.out.println("PRESS 1: All books");
            System.out.println("PRESS 2: Total number of books stored");
            System.out.println("PRESS 3: EXIT");
            

            try {

                System.out.println("Choose one option");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        
                        break;

                    case 2:
                        System.out.println("");

                        break;
                    case 3:
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
    
}
