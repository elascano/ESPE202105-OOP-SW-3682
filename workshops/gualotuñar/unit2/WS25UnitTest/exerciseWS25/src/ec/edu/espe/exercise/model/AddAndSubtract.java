/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exercise.model;

/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class AddAndSubtract {
        float addend1;
        float addend2;
        
        float minuend;
        float subtraend;
        
        float AddResult;
        float Diference;
    
        
    public static float Add(float addend1, float addend2){
        float AddResult;
        AddResult = addend1 + addend2;
        return AddResult;
}
    
    
     public static float Subtraction(float minuend, float subtraend){
        float Diference;
        Diference = minuend - subtraend;
        return Diference;
}

}