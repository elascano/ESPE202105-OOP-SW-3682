/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sortapp.model;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class BubbleSort implements SortingStrategy {

    public int[] sort(int data[]) {
        int i, j, aux;
        
        for(i=0; i<data.length; i++){
            for(j=0; j<data.length; j++){
                if(data[j]>data[j+1]){
                    aux=data[j];
                    data[j]=data[j+1];
                    data[j+1]=aux;
                }
            }
        }
        return data;
    }
    
}
