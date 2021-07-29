/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class operationsTest {

    public operationsTest() {
    }

    /**
     * Test of addition method, of class operations.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        float addend1 = 12.25F;
        float addend2 = 9.3F;
        float expResult = 21.55F;
        float result = operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testAddition2() {
        System.out.println("addition");
        float addend1 = 8.33F;
        float addend2 = 4.12F;
        float expResult = 12.45F;
        float result = operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testAdditionSmallNumbers() {
        System.out.println("addition");
        float addend1 = 0.452F;
        float addend2 = 1.789F;
        float expResult = 2.241F;
        float result = operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testAdditionPlusCeroPoint3() {
        System.out.println("addition");
        float addend1 = 6.58F;
        float addend2 = 0.03F;
        float expResult = 6.61F;
        float result = operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
     @Test
    public void testAdditionPlusNegative() {
        System.out.println("addition");
        float addend1 = 6.58F;
        float addend2 = -0.03F;
        float expResult = 6.55F;
        float result = operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
 @Test
    public void testAdditionPlusCero() {
        System.out.println("addition");
        float addend1 = 6.58F;
        float addend2 = 0.00F;
        float expResult = 6.58F;
        float result = operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    /**
     * Test of subtract method, of class operations.
     */
    @Test
    public void testSubtractNormal() {
        System.out.println("subtract");
        float minuend = 12.4F;
        float subtrahend = 4.3F;
        float expResult = 8.1F;
        float result = operations.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.00);

    }

    @Test
    public void testSubtractMinusCeroPoint32() {
        System.out.println("subtract");
        float minuend = 5.5F;
        float subtrahend = 0.32F;
        float expResult = 5.18F;
        float result = operations.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.00);

    }

    @Test
    public void testSubtractBigNumbers() {
        System.out.println("subtract");
        float minuend = 120.48F;
        float subtrahend = 32.98F;
        float expResult = 87.5F;
        float result = operations.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.00);

    }

    @Test
    public void testSubtractNegative() {
        System.out.println("subtract");
        float minuend = 45.34F;
        float subtrahend = -2.3F;
        float expResult = 47.64F;
        float result = operations.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.00);

    }
     @Test
    public void testSubtractNegativeCeroPoint3() {
        System.out.println("subtract");
        float minuend = 45.34F;
        float subtrahend = -0.3F;
        float expResult = 45.64F;
        float result = operations.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.00);

    }
     @Test
    public void testSubtractCero() {
        System.out.println("subtract");
        float minuend = 45.34F;
        float subtrahend = 0.0F;
        float expResult = 45.34F;
        float result = operations.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.00);

    }
     @Test
    public void testSubtractNegatives() {
        System.out.println("subtract");
        float minuend = -5.34F;
        float subtrahend = -8.3F;
        float expResult = 2.96F;
        float result = operations.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.00);

    }

}
