/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class Tax {
    public static float result;
    
    public static float calculateSum(float num1, float num2){  
        result = num1 + num2;        
        return result;
    }
    
    public static float calculateSubtraction(float num1, float num2){
        result = num1 - num2;
        return result;
    }
}
