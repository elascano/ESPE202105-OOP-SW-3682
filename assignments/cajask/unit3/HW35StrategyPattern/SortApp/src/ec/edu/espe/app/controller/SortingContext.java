/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.app.controller;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class SortingContext {
    private SortingStrategy ss;
    
    public int[] sort(int data[]){
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int n){
       if(n>0 && n<5)
           System.out.println("BubbleSort:");
            ss = new BubbleSort();
       if(n>=5 && n<10)
           System.out.println("InsertionSort:");
            ss = new InsertionSort();
       if(n>=10)
           System.out.println("QuickSort:");
            ss = new QuickSort();
       
       return ss;
    }
}
