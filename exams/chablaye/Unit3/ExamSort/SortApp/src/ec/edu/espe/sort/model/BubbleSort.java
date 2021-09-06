/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sort.model;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class BubbleSort implements SortingStrategy{
    private int aux;
    @Override
    public int[] sort(int[] data, int size) {
        for(int i=0; i<(size-1); i++){
            for(int j=0; j<(size-1); j++){
                if(data[j]>data[j+1]){
                    aux = data[j];
                    data[j] = data[j+1];
                    data[j+1] = aux;
                }
            }
        }
        return data;
    }

    
}
