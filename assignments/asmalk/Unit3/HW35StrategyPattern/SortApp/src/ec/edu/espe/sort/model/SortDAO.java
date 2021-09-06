/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sort.model;

import ec.edu.espe.sort.view.SortFrm;

/**
 *
 * @author Asmal Kevin
 */
public class SortDAO {
    public void addNumber(int data[], int numero){
        int size=0;
        size = data.length;
        for(int i=0; i<size; i++){
            data[i] = numero;
        }  
    }
    
    public void orderNumbers(int data[]){
        int size;
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);
        size = sortedList.length;
        for(int i=0;i<size;i++){
            System.out.println(sortedList[i] + " - ");
        }

    }
}
