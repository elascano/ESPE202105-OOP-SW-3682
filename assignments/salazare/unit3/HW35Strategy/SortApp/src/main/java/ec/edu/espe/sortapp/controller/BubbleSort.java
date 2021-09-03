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
public class BubbleSort implements SortingStrategy {

    public BubbleSort() {
    }

    @Override
    public int[] sort(int[] data) {
         boolean sorted = false;
    int temp;
    while(!sorted) {
        sorted = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i+1]) {
                temp = data[i];
                data[i] = data[i+1];
                data[i+1] = temp;
                sorted = false;
            }
        }
    }
    return null;
    }
    
}
