/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sortapp.controller;

import ec.edu.espe.sortapp.controller.InsertionSort;
import ec.edu.espe.sortapp.controller.QuickSort;
import ec.edu.espe.sortapp.controller.SortingStrategy;

/**
 *
  * @author Karlita
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
           ss = new BubbleSort();
       if(n>=5 && n<10)
           ss = new InsertionSort();
       if(n>=10)
           ss = new QuickSort();
       
       return ss;
        
    }
}
