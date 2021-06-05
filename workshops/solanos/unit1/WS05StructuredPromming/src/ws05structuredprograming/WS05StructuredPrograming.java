/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws05structuredprograming;
import java.util.Scanner;
/**
 *
 * @author Familia Solano
 */
public class WS05StructuredPrograming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float addend1;
        float addend2;
        float sum;
        
        float dividend;
        float divisor;
        float quotient;
        
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("Enter the addends->");
        System.out.print("addend1-> ");
        addend1=keyboardinput.nextFloat();
        System.out.print("addend2-> ");
        addend2=keyboardinput.nextFloat();
        sum=add(addend1, addend2);
        System.out.println("The addition of" + addend1 + "+" + addend2 + "=" + sum);
        
        System.out.println("Enter the dividend and divisor->");
        System.out.print("dividend-> ");
        dividend=keyboardinput.nextFloat();
        System.out.print("divisor-> ");
        divisor=keyboardinput.nextFloat();
        quotient=divide(dividend, divisor);
        System.out.println("The addition of" + dividend + "+" + divisor + "=" + quotient);
    }
    public static float add(float addend1, float addend2){
        return addend1 + addend2;
    }
    
    public static float multiply(float multiplicand, float multiplier){
        float product;
        product = multiplicand * multiplier;
        return product;
    }
    public static float divide(float dividend, float divisor){
        float quotient;
        quotient = dividend/divisor;
        return quotient;
    }
}
