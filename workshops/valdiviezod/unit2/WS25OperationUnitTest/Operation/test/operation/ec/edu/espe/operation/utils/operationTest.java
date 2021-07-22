/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation.ec.edu.espe.operation.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Darwin
 */
public class operationTest {
    
    public operationTest() {
    }
    
    /**
     * Test of addition method, of class operation.
     */
    @Test
    public void testAdditionCero() {
        System.out.println("addition");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        float expResult = 0.0F;
        float result = operation.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
    @Test
    public void testAdditionBig() {
        System.out.println("addition");
        float addend1 = 1570.20F;
        float addend2 = 245.15F;
        float expResult = 1815.35F;
        float result = operation.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
    @Test
    public void testAdditionBigTwo() {
        System.out.println("addition");
        float addend1 = 1870.30F;
        float addend2 = 1245.40F;
        float expResult = 3115.70F;
        float result = operation.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
    @Test
    public void testAdditionSmall() {
        System.out.println("addition");
        float addend1 = 0.04F;
        float addend2 = 0.07F;
        float expResult = 0.11F;
        float result = operation.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
    @Test
    public void testAdditionSmallTwo() {
        System.out.println("addition");
        float addend1 = 0.84F;
        float addend2 = 0.27F;
        float expResult = 1.11F;
        float result = operation.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }
    
    @Test
    public void testAdditionNegative() {
        System.out.println("addition");
        float addend1 = 5.90F;
        float addend2 = -9.30F;
        float expResult = -3.40F;
        float result = operation.addition(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of substract method, of class operation.
     */
    @Test
    public void testSubstractCero() {
        System.out.println("substract");
        float minuend = 0.0F;
        float substraend = 0.0F;
        float expResult = 0.0F;
        float result = operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.0);

    }
    
    @Test
    public void testSubstractBig() {
        System.out.println("substract");
        float minuend = 3859.20F;
        float substraend = 475.30F;
        float expResult = 3383.90F;
        float result = operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.0);

    }
    
    @Test
    public void testSubstractBigTwo() {
        System.out.println("substract");
        float minuend = 8473.57F;
        float substraend = 9275.93F;
        float expResult = -802.36F;
        float result = operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.0);

    }
    
    @Test
    public void testSubstractSmall() {
        System.out.println("substract");
        float minuend = 0.09F;
        float substraend = 0.05F;
        float expResult = 0.04F;
        float result = operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.0);

    }
    
    @Test
    public void testSubstractSmallTwo() {
        System.out.println("substract");
        float minuend = 0.50F;
        float substraend = 0.37F;
        float expResult = 0.13F;
        float result = operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.0);

    }
    
    @Test
    public void testSubstractNegative() {
        System.out.println("substract");
        float minuend = 7493.10F;
        float substraend = -9837.70F;
        float expResult = 17330.80F;
        float result = operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.0);

    }
    
}
