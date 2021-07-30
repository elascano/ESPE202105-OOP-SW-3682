/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.model;

/**
 *
 * @author jejoc
 */
public class Operations {
    private static float total;
    private static float difference;
    
    public static float addition(float addend1, float addend2){
        total = addend1 + addend2;
        return total;
    }
    
    public static float subtract(float minuend, float subtrahend){
        difference = minuend - subtrahend;
        return difference;
    }
}
