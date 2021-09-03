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
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        data = firstQuickSort(data);
        return data;
    }

    public int[] firstQuickSort(int[] array) {
        return secondQuickSort(array, 0, array.length - 1);
    }

    public int[] secondQuickSort(int[] array, int left, int right) {
        if (left >= right) {
            return array;
        }
        int l = left;
        int r = right;

        if (left != right) {
            int pivote;
            int aux;

            pivote = left;
            while (left != right) {
                while (array[right] >= array[pivote] && left < right) {
                    right--;
                }
                while (array[left] < array[pivote] && left < right) {
                    left++;
                }

                if (right != left) {
                    aux = array[right];
                    array[right] = array[left];
                    array[left] = aux;
                }
                if (left == right) {
                    secondQuickSort(array, l, left - 1);
                    secondQuickSort(array, left + 1, r);
                }
            }

        } else {
            return array;
        }
        return array;
    }

}
