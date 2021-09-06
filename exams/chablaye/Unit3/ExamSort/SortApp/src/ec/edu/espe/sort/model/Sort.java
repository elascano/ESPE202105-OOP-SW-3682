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
public class Sort {
    int numbers[];
    String algorithm;
    int sort[];

    public Sort() {
    }

    public Sort(int[] numbers, String algorithm, int[] sort) {
        this.numbers = numbers;
        this.algorithm = algorithm;
        this.sort = sort;
    }
    
    

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public int[] getSort() {
        return sort;
    }

    public void setSort(int[] sort) {
        this.sort = sort;
    }
    
    
}
