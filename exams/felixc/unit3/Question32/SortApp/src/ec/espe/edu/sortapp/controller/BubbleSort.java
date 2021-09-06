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
public class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        int aux;
        boolean flag;
        while (true) {
            flag = false;
            for (int i = 1; i < data.length; i++) {
                if (data[i] < data[i - 1]) {
                    aux = data[i];
                    data[i] = data[i - 1];
                    data[i - 1] = aux;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
        return data;
    }

}
