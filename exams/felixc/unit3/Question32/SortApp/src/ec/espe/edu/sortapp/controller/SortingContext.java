/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.sortapp.controller;

/**
 *
 * @author Cristian Félix InnovaCode ESPE-DCCO
 */
public class SortingContext {

    private SortingStrategy ss;

    public int[] sort(int data[]) {
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {
        if (n > 0 && n < 5) {
            ss = new BubbleSort();
        }
        if (n >= 5 && n < 10) {
            ss = new InsertionSort();
        }
        if (n >= 10) {
            ss = new QuickSort();
        }
        return ss;
    }

    public String getSortStrategy(int n, int data[]) {
        String sort = "";
        if (n >= 0 && n <= 3) {
            ss = new BubbleSort();
            sort = "Bubble Sort";

        } else if (n >= 4 && n <= 7) {
            ss = new InsertionSort();
            sort = "Insertion Sort";
        } else if (n >= 7) {
            ss = new QuickSort();
            sort = "Quick Sort";
        }

        return sort;
    }
}
