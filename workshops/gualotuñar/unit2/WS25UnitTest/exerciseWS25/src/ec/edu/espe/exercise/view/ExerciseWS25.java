/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exercise.view;

import ec.edu.espe.exercise.model.AddAndSubtract;
import static ec.edu.espe.exercise.model.AddAndSubtract.Add;
import static ec.edu.espe.exercise.model.AddAndSubtract.Subtraction;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class ExerciseWS25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float addend1;
        float addend2;
        
        float minuend;
        float subtraend;
        
        float AddResult = 0;
        float Diference = 0;
     
        Scanner in = new Scanner(System.in);
        
        System.out.println("***********add and subtract**********");
        System.out.println("enter the first number: ");
        addend1 = in.nextFloat();
        System.out.println("enter the second number: ");
        addend2= in.nextFloat();
        
        AddResult = AddAndSubtract.Add(addend1, addend2);
        System.out.println("the result of the add is: " + AddResult );
         
        System.out.println("enter the minuend: ");
        minuend = in.nextFloat();
        System.out.println("enter the substraend: ");
        subtraend= in.nextFloat();
        
        Diference = AddAndSubtract.Subtraction(minuend, subtraend);
        System.out.println("the result of the substraction is: " + Diference );
        
      
        
    }
    
    
}
