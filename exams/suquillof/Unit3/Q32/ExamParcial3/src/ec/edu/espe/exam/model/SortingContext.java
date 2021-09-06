/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.model;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class SortingContext {

    private SortingStrategy ss;

    public void sort(int data[]) {
        
        int size = data.length;
        ss = setSortStrategy(size);
        ss.sort(data); 
        
    }

    public SortingStrategy setSortStrategy(int matrixSize) {

        if (matrixSize > 0 && matrixSize <= 3) {
            ss = new BubbleSort();
        }
        if (matrixSize >= 4 && matrixSize <= 7) {
            ss = new InsertionSort();
        }
        if (matrixSize > 7) {
            ss = new QuickSort();
        }

        return ss;
    }
}
