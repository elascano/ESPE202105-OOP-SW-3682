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
public class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
        int current = data[i];
        int j = i - 1;
        while(j >= 0 && current < data[j]) {
            data[j+1] = data[j];
            j--;
        }
        data[j+1] = current;
    }
    return null;
    }
    
}
