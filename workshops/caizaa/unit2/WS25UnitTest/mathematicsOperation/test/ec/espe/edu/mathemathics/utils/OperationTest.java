/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.mathemathics.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class OperationTest {
    
    public OperationTest() {
    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAddCero() {
        System.out.println("Add:");
        float addend1 = 0.1F;
        float addend2 = 0.1F;
        float expResult = 0.2F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddSmall() {
        System.out.println("Add:");
        float addend1 = 0.25F;
        float addend2 = 0.25F;
        float expResult = 0.50F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddSmallTwo(){
        System.out.println("Add:");
        float addend1 = 100F;
        float addend2 = 100F;
        float expResult = 200F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddBig() {
        System.out.println("Add:");
        float addend1 = 000F;
        float addend2 = 000F;
        float expResult = 000F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddBigTwo() {
        System.out.println("Add:");
        float addend1 = 45.0F;
        float addend2 = 45.0F;
        float expResult = 90.0F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddNegativeSmall() {
        System.out.println("Add:");
        float addend1 = -859F;
        float addend2 = -859F;
        float expResult = -1.718F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddNegativeSmallTwo() {
        System.out.println("Add:");
        float addend1 = -0F;
        float addend2 = -0F;
        float expResult = -0F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddNegativeBig() {
        System.out.println("Add:");
        float addend1 = -8.888F;
        float addend2 = -8.888F;
        float expResult = -17.776F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddNegativeBigTwo() {
        System.out.println("Add:");
        float addend1 = -1234.5F;
        float addend2 = -1234.5F;
        float expResult = -2.469F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddStandard() {
        System.out.println("Add:");
        float addend1 = 101F;
        float addend2 = 101F;
        float expResult = 202F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    
    
    
    
    /**
     * Test of substract method, of class Operation.
     */
    @Test
    public void testSubstractCero() {
        System.out.println("substract");
        float substraend = 0.1F;
        float minuend = 0.0F;
        float expResult = 0.0F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.0);
    }
@Test
    public void testSubstractSmall() {
        System.out.println("Add:");
        float substraend = 0.08F;
        float minuend = 0.05F;
        float expResult = 0.03F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractSmalTwo(){
        System.out.println("Add:");
        float substraend = 0.00F;
        float minuend = 0.00F;
        float expResult = 0.00F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractBig() {
        System.out.println("Add:");
        float substraend = 4896.0F;
        float minuend = 410.1F;
        float expResult = 4.4859F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractBigTwo() {
        System.out.println("Add:");
        float substraend = 789.008F;
        float minuend = 963.55F;
        float expResult = -174.542F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractNegativeSmall() {
        System.out.println("Add:");
        float substraend = -0.0526F;
        float minuend = -0.888F;
        float expResult = -0.9406F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractNegativeSmallTwo() {
        System.out.println("Add:");
        float substraend = -0.19F;
        float minuend = -0.9F;
        float expResult = -1.09F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractNegativeBig() {
        System.out.println("Add:");
        float substraend = -4444F;
        float minuend = -22F;
        float expResult = -4466F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractNegativeBigTwo() {
        System.out.println("Add:");
        float substraend = -1515168F;
        float minuend = -98362F;
        float expResult = -1613.530F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractStandard() {
        System.out.println("Add:");
        float substraend = 50F;
        float minuend = 30F;
        float expResult = 20.00F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
}
