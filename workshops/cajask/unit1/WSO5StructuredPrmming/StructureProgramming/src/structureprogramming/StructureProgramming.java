/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structureprogramming;

import static com.sun.javafx.fxml.expression.Expression.add;
import java.util.Scanner;

/**
 *
 * @author Karlita
 */
public class StructureProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //add()
        float addend1 = 0.0F;
        float addend2;
        float sum;
        
        //subtract()
        float minuend;
        float subtrahen;
        float difference;
        
        
        //multiply()
        float multiplicand;
        float multiplier;
        float product;
        
        //divide()
        float dividend;
        float divisor;
        float quotient;
        
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("Structure programming usisng java, by Lizbeth cajas");
        System.out.println("===ADDITION==");
        System.out.println("enter the addends");
        System.out.print("addend 1 ->");
        addend1 = keyboardinput.nextFloat();
        System.out.print("adden 2 ->");
        addend2 = keyboardinput.nextFloat();
        
        sum = add(addend1 ,addend2);
        System.out.println("the addition of" + addend1 + " + " + addend2 + " = " + sum);
        
        System.out.println("===DIVITION===");
        System.out.println("enter the divided and divisor ");
        System.out.print("divided ->");
        divisor = keyboardinput.nextFloat();
        
        
   
      
   
        
            
    }
    public StructureProgramming(float addend1,float addend2){
    }
}
