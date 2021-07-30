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
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class OperationsTest {
    
    public OperationsTest() {
    }

    /**
     * Test of sum method, of class Operations.
     */
    @Test
    public void testSumNegativeAndPositive() {
        System.out.println("sum");
        float addend1 = -24.24F;
        float addend2 = 21.00F;
        float expResult = -3.24F;
        float result = Operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);
        
    }   
    @Test
    public void testSumBigNumbers() {
        System.out.println("sum");
        float addend1 = -1515123.52F;
        float addend2 = 145222.004F;
        float expResult = -1369901.516F;
        float result = Operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }  
    @Test
    public void testSumPositiveAndNegative() {
        System.out.println("sum");
        float addend1 = 1.00F;
        float addend2 = -1.00F;
        float expResult = 0.00F;
        float result = Operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSumDecimals() {
        System.out.println("sum");
        float addend1 = 0.12F;
        float addend2 = 0.90F;
        float expResult = 1.02F;
        float result = Operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }   
    @Test
    public void testSumBigNegativeDecimals() {
        System.out.println("sum");
        float addend1 = -2.512F;
        float addend2 = -1512.652F;
        float expResult = -1515.164F;
        float result = Operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }   
    @Test
    public void testSumBigNumber() {
        System.out.println("sum");
        float addend1 = 0.00F;
        float addend2 = 12523125.5061F;
        float expResult = 12523125.5061F;
        float result = Operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }  
    @Test
    public void testSumNegativeAndBigDecimals() {
        System.out.println("sum");
        float addend1 = -0.00000025F;
        float addend2 = 0.1512F;
        float expResult = 0.15119975F;
        float result = Operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }   
    @Test
    public void testSumPositiveNumbers() {
        System.out.println("sum");
        float addend1 = 45.74F;
        float addend2 = 45.74F;
        float expResult = 91.48F;
        float result = Operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }  
    @Test
    public void testSumDecimalsAndNegativeNumber() {
        System.out.println("sum");
        float addend1 = 0.218F;
        float addend2 = -145.341F;
        float expResult = -145.123F;
        float result = Operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }  
    @Test
    public void testSumNegativeZeros() {
        System.out.println("sum");
        float addend1 = -0.00F;
        float addend2 = -0.00F;
        float expResult = 0.00F;
        float result = Operations.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of subtraction method, of class Operations.
     */
    @Test
    public void testSubtractionZeros() {
        System.out.println("subtraction");
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expResult = 0.0F;
        float result = Operations.subtraction(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }   
    @Test
    public void testSubtractionBigNumbers() {
        System.out.println("subtraction");
        float minuend = -1515123.52F;
        float subtrahend = 145222.004F;
        float expResult = -1660345.524F;
        float result = Operations.subtraction(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtractionDecimals() {
        System.out.println("subtraction");
        float minuend = 0.12F;
        float subtrahend = 0.90F;
        float expResult = -0.78F;
        float result = Operations.subtraction(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtractionPositiveAndNegative() {
        System.out.println("subtraction");
        float minuend = 1.00F;
        float subtrahend = -1.00F;
        float expResult = 2.00F;
        float result = Operations.subtraction(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtractionBigPositiveDecimals() {
        System.out.println("subtraction");
        float minuend = 4.5202842F;
        float subtrahend = 0.251523934F;
        float expResult = 4.268760266F;
        float result = Operations.subtraction(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtractionDecimalsAndNegativeNumber() {
        System.out.println("subtraction");
        float minuend = 0.5242F;
        float subtrahend = -14.239F;
        float expResult = 14.7632F;
        float result = Operations.subtraction(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtractionZeroAndPositiveNumber() {
        System.out.println("subtraction");
        float minuend = 0.00F;
        float subtrahend = 42.193F;
        float expResult = -42.193F;
        float result = Operations.subtraction(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtractionBigNegativeNumbers() {
        System.out.println("subtraction");
        float minuend = -412421.5298762F;
        float subtrahend = -156421.11215758F;
        float expResult = -256000.41771862F;
        float result = Operations.subtraction(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtractionBigPositiveNumbers() {
        System.out.println("subtraction");
        float minuend = 67472.735831F;
        float subtrahend = 421807.1589180F;
        float expResult = -354334.423087F;
        float result = Operations.subtraction(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testSubtractionNegativeDecimals() {
        System.out.println("subtraction");
        float minuend = -0.51251F;
        float subtrahend = -0.90822F;
        float expResult = 0.39571F;
        float result = Operations.subtraction(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
    }
}
