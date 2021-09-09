/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sortapp.model;

import ec.edu.espe.sortapp.controller.SortingStrategy;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class QuickSort implements SortingStrategy {

    public int[] sort(int data[]) {
        int order[];
        order = sortApp(0, (data.length-1), data);
        return order;
    }
    
    public int[] sortApp(int first, int latest, int[] data){
        int order [] = {};
        
        int pivote, aux;
        first = 0; 
        latest = data.length-1;
        
        int i = first;
        int j = latest;
        pivote=data[(first+latest)/2];
        
        do{
            while(pivote>data[i]){
                i++;
            }

            while(pivote<data[j]){
                j--;
            }
            
            if(i<=j){
                aux = data[i];
                data[i] = data[j];
                data[j] = aux;
                i++;
                j--;
            }
        }while(i<=j);
        if(first<j){
            sortApp(first, j, data);
        }
        if(latest>i){
            sortApp(i, latest, data);
        }
        
        for(i=0; i<data.length; i++){
           order[i]=data[i];
        }
        
        System.out.println("Quick Sort");
        return order;
    }
}
