/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.app.view;

import ec.edu.espe.app.controller.SortingContext;
import java.util.Scanner;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class SortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int insert;
    Scanner cs = new Scanner(System.in);
        System.out.println("Enter the quantity");
        insert = cs.nextInt();
        int data[] = new int[insert];
        for(int i=0; i<insert; i++)
        {
            System.out.printf("\nEnter the number %d: ", i+1);
            data[i] = cs.nextInt();
        }
    
       
    SortingContext sc = new SortingContext();
    int sortedList[] = sc.sort(data);
    
    for (int i=0;i<data.length;i++){
        System.out.println(data[i]);
    }
    }    
}
