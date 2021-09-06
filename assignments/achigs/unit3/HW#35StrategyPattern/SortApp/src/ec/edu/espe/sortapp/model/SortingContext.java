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
public class SortingContext {

    private SortingStrategy sortingStrategy;
    QuickSort quick = new QuickSort();
    
    public int[] sort(int data[]) {
        int size = data.length;
        sortingStrategy = setSortStrategy(size);
        return sortingStrategy.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 10) {
            sortingStrategy = new BubbleSort();
        }
        if (n >= 10 && n < 20) {
            sortingStrategy = new InsertionSort();
        }
        if (n >= 20) {
            sortingStrategy = new QuickSort();
        }
        return sortingStrategy;
    }
}
