/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author Cristian Felix InnovaCode ESPE-DCCO
 */
public class DemoLibrary {
    
    public int sum (int num1, int num2){
        return num1 + num2;
    }
    
    public int substraction (int num1, int num2){
        return num1-num2;
    }
    
    public int multiplication(int num1, int num2){
        return num1*num2;
    }
    public int division (int num1, int num2){
        if (num2!=0)
            return num1/num2;
        else{
            System.out.println("Division by 0 is an indeterminacy");
            return 0;
        }
    }
}
