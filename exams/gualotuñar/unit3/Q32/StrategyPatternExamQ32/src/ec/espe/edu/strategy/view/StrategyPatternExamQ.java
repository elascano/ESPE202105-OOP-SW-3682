/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.strategy.view;

/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class StrategyPatternExamQ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int numberTemp,i,j;
         int [] numbers = {};
 
        for(i = 0; i < numbers.length; i++)
        {
            for(j = 0; j < numbers.length; j++)
            {
                if(numbers[i] < numbers[j])
                {
                    numberTemp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = numberTemp;
                }
            }
        }
 
        //
 
        for(i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
        
    }
    

