/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.operations.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class OperationTest {
    
    public OperationTest() {
    }

    /**
     * Test of addition method, of class Operation.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        float addend1 = 0.2F;
        float addend2 = 0.0F;
        float expResult = 0.2F;
        float result = Operation.addition(addend1, addend2);
        assertEquals(expResult, result, 0.000000);
    }
    
    /**
     * Test of addition method, of class Operation.
     */
    @Test
    public void testAdditionPositiveZero() {
        System.out.println("addition");
        float addend1 = 1.2F;
        float addend2 = 0.0F;
        float expResult = 1.2F;
        float result = Operation.addition(addend1, addend2);
        assertEquals(expResult, result, 0.000000);
    }
    
    /**
     * Test of addition method, of class Operation.
     */
    @Test
    public void testAdditionFloat2Float4() {
        System.out.println("addition");
        float addend1 = 0.2F;
        float addend2 = 0.4F;
        float expResult = 0.6F;
        float result = Operation.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of addition method, of class Operation.
     */
    @Test
    public void testAddition2positives() {
        System.out.println("addition");
        float addend1 = 7.8F;
        float addend2 = 9.4F;
        float expResult = 17.2F;
        float result = Operation.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of addition method, of class Operation.
     */
    @Test
    public void testAddition2Negatives() {
        System.out.println("addition");
        float addend1 = -7.8F;
        float addend2 = -9.4F;
        float expResult = -17.2F;
        float result = Operation.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtractFloat2() {
        System.out.println("subtract");
        float minuend = 0.2F;
        float subtrahend = 0.0F;
        float expResult = 0.2F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtractSameNumber() {
        System.out.println("subtract");
        float minuend = 56.22F;
        float subtrahend = 56.22F;
        float expResult = 0.0F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtractAPositiveAndNegative() {
        System.out.println("subtract");
        float minuend = 5.2F;
        float subtrahend = -2.4F;
        float expResult = 7.6F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of subtract method, of class Operation.
     */
    @Test
    public void testSubtract2Negatives() {
        System.out.println("subtract");
        float minuend = -5.654F;
        float subtrahend = -30.2F;
        float expResult = 24.546F;
        float result = Operation.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
}
