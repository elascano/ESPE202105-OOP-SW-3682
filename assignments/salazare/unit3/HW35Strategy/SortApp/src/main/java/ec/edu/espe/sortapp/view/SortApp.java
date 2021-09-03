/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sortapp.view;

import ec.edu.espe.sortapp.controller.SortingContext;
import java.util.Scanner;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class SortApp {

    public static void main(String[] args) {
     int data[] = new int[7];
    Scanner nc = new Scanner(System.in);
    for(int i=0; i<data.length; i++)
        {
            System.out.printf("\nEnter the number %d: ", i+1);
            data[i] = nc.nextInt();
        }
     SortingContext sc = new SortingContext();
    int sortedList[] = sc.sort(data);
     System.out.println("\nsorting out...");
    for (int i=0;i<data.length;i++){
        System.out.println(data[i]);
    }
    }
    
}
