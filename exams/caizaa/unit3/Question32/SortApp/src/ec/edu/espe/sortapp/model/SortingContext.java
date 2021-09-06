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
public class SortingContext {

    private SortingStrategy sortingStrategy;
    QuickSort quick = new QuickSort();
    
    public int[] sort(int data[]) {
        int size = data.length;
        sortingStrategy = setSortStrategy(size);
        return sortingStrategy.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 4) {
            sortingStrategy = new BubbleSort();
        }
        if (n >= 4 && n < 8) {
            sortingStrategy = new InsertionSort();
        }
        if (n >= 8) {
            sortingStrategy = new QuickSort();
        }
        return sortingStrategy;
    }
}
