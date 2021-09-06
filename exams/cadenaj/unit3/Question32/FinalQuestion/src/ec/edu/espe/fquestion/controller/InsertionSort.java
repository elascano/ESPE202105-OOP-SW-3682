/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fquestion.controller;

/**
 *
 * @author jejoc
 */
public class InsertionSort implements SortingStrategy{
    
    @Override
    public int[] sort(int[] data) {
        int aux;
        int cont1;
        int cont2;
        for(cont1 = 1; cont1<data.length;cont1++){
                aux = data[cont1];
                for(cont2=cont1-1;cont2 >=0 && data[cont2]>aux;cont2--){
                    data[cont2+1]= data[cont2];
                    data[cont2]=aux;
                }
            }
        return null;
    }
    
}
