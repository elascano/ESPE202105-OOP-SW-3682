/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sortapp.model;

import ec.edu.espe.sortapp.controller.SortingStrategy;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class BubbleSort implements SortingStrategy {

    public int[] sort(int data[]) {

        int i, aux;
        boolean cambios = false;
        int order [] = {};
        
        while (true) {
            cambios = false;
            for (i = 1; i < data.length-1; i++) {
                if(data[i]<data[i-1]){
                    aux = data[i];
                    data[i]=data[i-1];
                    data[i-1] = aux;
                    cambios = true;
                }
                
            }
            if(cambios==false)
                break;
        }
        
        for(i=0; i<data.length-1; i++){
            order[i]=data[i];
        }
            
        System.out.println("Bubble Sort");
        return order;
    }
}
