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
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class OperationTest {
    
    public OperationTest() {
    }

    /**
     * Test of add method, of class Operation.
     */
    @Test
    public void testAddCero() {
        System.out.println("add");
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        float expResult = 0.0F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddSmall() {
        System.out.println("add");
        float addend1 = 0.05F;
        float addend2 = 0.03F;
        float expResult = 0.08F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddSmallTwo(){
        System.out.println("add");
        float addend1 = 0.21F;
        float addend2 = 0.12F;
        float expResult = 0.33F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddBig() {
        System.out.println("add");
        float addend1 = 98647.45F;
        float addend2 = 1575.39F;
        float expResult = 100222.84F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddBigTwo() {
        System.out.println("add");
        float addend1 = 8965.36F;
        float addend2 = 7652.03F;
        float expResult = 16617.39F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddNegativeSmall() {
        System.out.println("add");
        float addend1 = -0.09F;
        float addend2 = -0.12F;
        float expResult = -0.21F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddNegativeSmallTwo() {
        System.out.println("add");
        float addend1 = -0.95F;
        float addend2 = -0.15F;
        float expResult = -1.10F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddNegativeBig() {
        System.out.println("add");
        float addend1 = -6523.86F;
        float addend2 = -9836.25F;
        float expResult = -16360.11F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddNegativeBigTwo() {
        System.out.println("add");
        float addend1 = -9798445.13F;
        float addend2 = -5632.89F;
        float expResult = -9804078.02F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    @Test
    public void testAddStandard() {
        System.out.println("add");
        float addend1 = 25.50F;
        float addend2 = 5.50F;
        float expResult = 31.00F;
        float total = Operation.add(addend1, addend2);
        assertEquals(expResult, total, 0.00);
    }
    
    
    
    
    
    /**
     * Test of substract method, of class Operation.
     */
    @Test
    public void testSubstractCero() {
        System.out.println("substract");
        float substraend = 0.0F;
        float minuend = 0.0F;
        float expResult = 0.0F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.0);
    }
@Test
    public void testSubstractSmall() {
        System.out.println("add");
        float substraend = 0.05F;
        float minuend = 0.03F;
        float expResult = 0.02F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractSmalTwo(){
        System.out.println("add");
        float substraend = 0.21F;
        float minuend = 0.12F;
        float expResult = 0.09F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractBig() {
        System.out.println("add");
        float substraend = 98647.45F;
        float minuend = 1575.39F;
        float expResult = 97072.06F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractBigTwo() {
        System.out.println("add");
        float substraend = 8965.36F;
        float minuend = 7652.03F;
        float expResult = 1313.33F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractNegativeSmall() {
        System.out.println("add");
        float substraend = -0.09F;
        float minuend = -0.12F;
        float expResult = 0.03F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractNegativeSmallTwo() {
        System.out.println("add");
        float substraend = -0.95F;
        float minuend = -0.15F;
        float expResult = -0.80F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractNegativeBig() {
        System.out.println("add");
        float substraend = -6523.86F;
        float minuend = -9836.25F;
        float expResult = 3312.39F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractNegativeBigTwo() {
        System.out.println("add");
        float substraend = -9798445.13F;
        float minuend = -5632.89F;
        float expResult = -9792812.24F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
    @Test
    public void testSubstractStandard() {
        System.out.println("add");
        float substraend = 25.50F;
        float minuend = 5.50F;
        float expResult = 20.00F;
        float difference = Operation.substract(substraend, minuend);
        assertEquals(expResult, difference, 0.00);
    }
    
}
