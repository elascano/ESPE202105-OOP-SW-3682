/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fquestion.controller;

import ec.edu.espe.fquestion.controller.QuickSort;
import ec.edu.espe.fquestion.controller.InsertionSort;
import ec.edu.espe.fquestion.controller.BubbleSort;

/**
 *
 * @author jejoc
 */
public class SortingContext {
    private SortingStrategy ss;
    
    public int[] sort(int data[]){
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
    }
    
     public SortingStrategy setSortStrategy(int n){
       if(n>0 && n<3)
           System.out.println("BubbleSort:");
            ss = new BubbleSort();
       if(n>=4 && n<7)
           System.out.println("InsertionSort:");
            ss = new InsertionSort();
       if(n>=7)
           System.out.println("QuickSort:");
            ss = new QuickSort();
       
       return ss;
    }
    
}
