/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.app.view;

import ec.edu.espe.app.controller.SortingContext;

/**
 *
 * @author Eduardo Mortensen The Programers
 */
public class SortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data[] = {3, 6, 4, 6, 3, 7, 8};
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
