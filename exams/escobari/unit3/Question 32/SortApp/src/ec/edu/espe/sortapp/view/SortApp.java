/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sortapp.view;

import ec.edu.espe.sortapp.controller.SortingContext;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class SortApp {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int data[] = {5,7,8,2};
    SortingContext sc = new SortingContext();
    int sortedList[] = sc.sort(data);
    
    for (int i=0;i<data.length;i++){
        System.out.println(data[i]);
    }
    }    
    
}
