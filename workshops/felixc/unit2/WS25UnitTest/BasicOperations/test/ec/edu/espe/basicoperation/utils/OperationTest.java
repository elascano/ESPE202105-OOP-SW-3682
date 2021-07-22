/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.basicoperation.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 59399
 */
public class OperationTest {

    public OperationTest() {
    }

    /**
     * Test of sum method, of class Operation.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        float firstAddend = 35.40F;
        float secondAddend = 46.70F;
        float expResult = 82.100006F;
        float result = Operation.sum(firstAddend, secondAddend);
        assertEquals(expResult, result, 0.00F);
    }

    @Test
    public void testSumForLongNumbers() {
        System.out.println("sum");
        float firstAddend = 248679513.00F;
        float secondAddend = 753869421.00F;
        float expResult = 1002548934.00F;
        float result = Operation.sum(firstAddend, secondAddend);
        assertEquals(expResult, result, 0.00);
    }

    @Test
    public void testSumForNegativeNumbers() {
        System.out.println("sum");
        float firstAddend = -35.30F;
        float secondAddend = -46.15F;
        float expResult = -81.45F;
        float result = Operation.sum(firstAddend, secondAddend);
        assertEquals(expResult, result, 0.00);
    }

    @Test
    public void testSumForManyDecimals() {
        System.out.println("sum");
        float firstAddend = 18.2486357159F;
        float secondAddend = 20.1597538624F;
        float expResult = 38.4083895783F;
        float result = Operation.sum(firstAddend, secondAddend);
        assertEquals(expResult, result, 0.00);
    }

    @Test
    public void testSumForZero() {
        System.out.println("sum");
        float firstAddend = 00.00F;
        float secondAddend = 00.00F;
        float expResult = 00.00F;
        float result = Operation.sum(firstAddend, secondAddend);
        assertEquals(expResult, result, 0.00);
    }

    @Test
    public void testSumForSameNumbers() {
        System.out.println("sum");
        float firstAddend = 27.18F;
        float secondAddend = 27.18F;
        float expResult = 54.36F;
        float result = Operation.sum(firstAddend, secondAddend);
        assertEquals(expResult, result, 0.00);

    }

    @Test
    public void testSum2() {
        System.out.println("sum");
        float firstAddend = 28.00F;
        float secondAddend = 70.00F;
        float expResult = 98.00F;
        float result = Operation.sum(firstAddend, secondAddend);
        assertEquals(expResult, result, 0.00F);
    }

    @Test
    public void testSumForLongNumbers2() {
        System.out.println("sum");
        float firstAddend = 123456789.00F;
        float secondAddend = 123456789.00F;
        float expResult = 246913578.00F;
        float result = Operation.sum(firstAddend, secondAddend);
        assertEquals(expResult, result, 0.00);
    }

    @Test
    public void testSumForNegativeNumbers2() {
        System.out.println("sum");
        float firstAddend = -20.00F;
        float secondAddend = -50.00F;
        float expResult = -70.00F;
        float result = Operation.sum(firstAddend, secondAddend);
        assertEquals(expResult, result, 0.00);
    }

    @Test
    public void testSumForManyDecimals2() {
        System.out.println("sum");
        float firstAddend = 47.1819202122F;
        float secondAddend = 20.4532169875F;
        float expResult = 67.6351371997F;
        float result = Operation.sum(firstAddend, secondAddend);
        assertEquals(expResult, result, 0.00);
    }

    /**
     * Test of substract method, of class Operation.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        float minuend = 35.5F;
        float substracted = 46.7F;
        float expResult = -11.20F;
        float result = Operation.substract(minuend, substracted);
        assertEquals(expResult, result, 0.00);
    }

    @Test
    //Minuend > Substract
    public void testSubstractMinuend() {
        System.out.println("substract");
        float minuend = 50.0F;
        float substracted = 20.0F;
        float expResult = 30.0F;
        float result = Operation.substract(minuend, substracted);
        assertEquals(expResult, result, 0.00);
    }

    @Test
    public void testSubstractForLongNumbers() {
        System.out.println("substract");
        float minuend = 987654321.0F;
        float substracted = 123456789.0F;
        float expResult = 864197532.0F;
        float result = Operation.substract(minuend, substracted);
        assertEquals(expResult, result, 0.00);
    }

    @Test
    public void testSubstractForManyDecimals() {
        System.out.println("substract");
        float minuend = 15.24681012F;
        float substracted = 13.36912151F;
        float expResult = 1.87768861F;
        float result = Operation.substract(minuend, substracted);
        assertEquals(expResult, result, 0.00);
    }

    @Test
    public void testSubstractForNegativeNumbers() {
        System.out.println("substract");
        float minuend = -37.0F;
        float substracted = -42.0F;
        float expResult = 5.0F;
        float result = Operation.substract(minuend, substracted);
        assertEquals(expResult, result, 0.00);
    }

    @Test
    public void testSubstractForPositiveAndNegative() {
        System.out.println("substract");
        float minuend = 19.0F;
        float substracted = -54.0F;
        float expResult = 73.0F;
        float result = Operation.substract(minuend, substracted);
        assertEquals(expResult, result, 0.00);
    }

    @Test
    public void testSubstractForZero() {
        System.out.println("substract");
        float minuend = 00.0F;
        float substracted = 00.0F;
        float expResult = 00.0F;
        float result = Operation.substract(minuend, substracted);
        assertEquals(expResult, result, 0.00);
    }

    @Test
    public void testSubstractForSameNumbers() {
        System.out.println("substract");
        float minuend = 40.0F;
        float substracted = 40.0F;
        float expResult = 00.0F;
        float result = Operation.substract(minuend, substracted);
        assertEquals(expResult, result, 0.00);
    }

    @Test
    public void testSubstract2() {
        System.out.println("substract");
        float minuend = 19.5F;
        float substracted = 67.5F;
        float expResult = -48.0F;
        float result = Operation.substract(minuend, substracted);
        assertEquals(expResult, result, 0.00);
    }

    public void testSubstractMinuend2() {
        System.out.println("substract");
        float minuend = 58.25F;
        float substracted = 20.25F;
        float expResult = 38.0F;
        float result = Operation.substract(minuend, substracted);
        assertEquals(expResult, result, 0.00);
    }
}
