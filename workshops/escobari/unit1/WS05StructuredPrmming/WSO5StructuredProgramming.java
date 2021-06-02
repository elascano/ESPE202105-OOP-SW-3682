/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wso5structuredprogramming;

import static com.sun.javafx.fxml.expression.Expression.divide;
import java.util.Scanner;



/**
 *
 * @author Usuario
 */
public class WSO5StructuredProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //add()
        float addend1; //suma
        float addend2;
        float sum;
        
        //multiply()
        float multiplicand;
        float multiplier;
        float product;
        
        //sibtract()
        float ninuend; //minuendo y sustraendo
        float subtrahen;
        float difference;
        
        //divide()
        float dividend; //division
        float divisor;
        float quotient;
        
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("WS 05 Structured Programing by Isaac Escobar");
        System.out.println("Enter the addends");
        System.out.print("Addend 1 -> ");
        addend1 = keyboardinput.nextFloat();
        System.out.print("Added 2 -> ");
        addend2 = keyboardinput.nextFloat();
        
        sum = add(addend1, addend2);
        System.out.println("the addition of" + addend1 + "+" + addend2 + "=" + sum);

        System.out.println("===DIVITION ===");
        System.out.println("Enter the dividend and divisor ");
        System.out.print("Dividend -> ");
        dividend = keyboardinput.nextFloat();
        System.out.print("Divisor -> ");
        divisor = keyboardinput.nextFloat();
        
        quotient= dividend(dividend, divisor);
        System.out.println("the division of " + dividend + " + " + divisor + " = " + quotient);
    }
    
    public static float add(float addend1, float addend2){
        return addend1+addend2;
}
    public static float multiply(float multiplicand, float multiplier){
        float product;
        product = multiplicand*multiplier;
        return product;
    }

    private static float dividend(float dividend, float divisor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
