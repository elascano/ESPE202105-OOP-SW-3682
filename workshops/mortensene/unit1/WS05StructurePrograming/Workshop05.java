
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Workshop05 {
    

public static void main(String[] args){
        float addend1;
        float addend2;
        float sum;
        float dividend=0;
        float divisor=0;
        float quotient;

       
       Scanner keyboardinput = new Scanner(System.in);
       System.out.println("==ADDITTION==");
       System.out.println("WORKSHOP06 BY EDUARDO MORTENSEN");
       System.out.println("WRITTE DOWN ADDEND 1");
       addend1= keyboardinput.nextFloat();
       System.out.println("WRITTE DOWN ADDEND 2");
       addend2= keyboardinput.nextFloat();
       sum = add(addend1,addend2);
       System.out.println("SUMTOTAL IS="+sum); 
       
       System.out.println("==DIVITION==");
       System.out.println("WRITTE DOWN DIVIDEND");
       dividend= keyboardinput.nextFloat();
       System.out.println("WRITTE DOWN DIVISOR");
       divisor= keyboardinput.nextFloat();
       quotient =divide(dividend,divisor);
       System.out.println("QUOTIENT  IS ="+quotient);
    }
 public static float add(float addend1,float addend2){
    float totalsum;
 totalsum=addend1+addend2;
     return totalsum;
   }
   public static float divide(float dividend,float divisor){
    float quotient;
    quotient=dividend/divisor;
    return quotient;
   }
}