/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sortapp.controller;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class InsertionSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        int aux;
        int counter1;
        int counter2;
        for (counter1 = 1; counter1 < data.length; counter1++) {
            aux = data[counter1];
            for (counter2 = counter1 - 1; counter2 >= 0 && data[counter2] > aux; counter2--) {
                data[counter2 + 1] = data[counter2];
                data[counter2] = aux;
            }
        }
        return data;
    }
    
    
}
