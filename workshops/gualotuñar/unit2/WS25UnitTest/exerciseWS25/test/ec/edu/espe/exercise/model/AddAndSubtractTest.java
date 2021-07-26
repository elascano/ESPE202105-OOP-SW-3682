/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exercise.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class AddAndSubtractTest {
    
    public AddAndSubtractTest() {
    }

    /**
     * Test of Add method, of class AddAndSubtract.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        float addend1 = 1500.00F;
        float addend2 = -3400.00F;
        float expResult = -1900.00F;
        float result = AddAndSubtract.Add(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of Subtraction method, of class AddAndSubtract.
     */
    @Test
    public void testSubtraction() {
        System.out.println("Subtraction");
        float minuend = 1500.00F;
        float subtraend = -3400.00F;
        float expResult = 4900.00F;
        float result = AddAndSubtract.Subtraction(minuend, subtraend);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
