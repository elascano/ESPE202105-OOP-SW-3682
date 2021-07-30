/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jejoc
 */
public class OperationsTest {
    
    public OperationsTest() {
    }

    /**
     * Test of addition method, of class Operations.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        float addend1 = 0.00F;
        float addend2 = 0.00F;
        float expResult = 0.00F;
        float result = Operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.00000000);
    }

    /**
     * Test of subtract method, of class Operations.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 0.00F;
        float subtrahend = 0.00F;
        float expResult = 0.00F;
        float result = Operations.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0000000);
    }
    
}
