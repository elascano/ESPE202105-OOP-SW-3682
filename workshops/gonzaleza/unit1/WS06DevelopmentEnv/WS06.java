
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class WS06 {
    public static void main(String[] args){
        //calculating fragance tax
        float ice;
        int amount;
        
        Scanner keyboardinput = new Scanner(System.in);
        
        System.out.println("Enter the amount of perfumes you produced: ");
        amount = keyboardinput.nextInt();
        
        ice = calculateTax(amount);
        
        System.out.println("The value of the tax of " + amount +" permues is: " +ice);
        
    }
    
    public static float calculateTax(int amount){
        float ice;
        float tax = 0.16F;
        ice = amount*tax;
        return ice;
    }
    
}
