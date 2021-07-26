/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.operations.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class SumTest {
    
    public SumTest() {
    }

    /**
     * Test of computeSum method, of class Sum.
     */
    @Test
    public void testSum() {
        System.out.println("computeSum");
        float addend1 = 10.00F;
        float addend2 = 14.00F;
        float expResult = 24.00F;
        float result = Sum.computeSum(addend1, addend2);
        assertEquals(expResult, result, 0.00);
        
    }
    
    @Test
    public void testNegativeNumbers() {
        System.out.println("computeSum");
        float addend1 = -24.11F;
        float addend2 = -12.21F;
        float expResult = -36.32F;
        float result = Sum.computeSum(addend1, addend2);
        assertEquals(expResult, result, 0.00);
        
    }
    
    @Test
    public void testBigNumbers() {
        System.out.println("computeSum");
        float addend1 = 21454512.00F;
        float addend2 = 15611515.00F;
        float expResult = 37066027.00F;
        float result = Sum.computeSum(addend1, addend2);
        assertEquals(expResult, result, 0.00);
        
    }
    
    @Test
    public void testBigNegativeNumbers() {
        System.out.println("computeSum");
        float addend1 = -2512151.152F;
        float addend2 = -2515151.121F;
        float expResult = -5027302.273F;
        float result = Sum.computeSum(addend1, addend2);
        assertEquals(expResult, result, 0.00);
        
    }
    
    
    @Test
    public void testBigDecimalNumbers() {
        System.out.println("computeSum");
        float addend1 = 0.515616515F;
        float addend2 = 2.114152F;
        float expResult = 2.629768515F;
        float result = Sum.computeSum(addend1, addend2);
        assertEquals(expResult, result, 0.00);
        
    }
    
    
    @Test
    public void testBigNegativeDecimalNumbers() {
        System.out.println("computeSum");
        float addend1 = -0.515616515F;
        float addend2 = -2.114152F;
        float expResult = -2.629768515F;
        float result = Sum.computeSum(addend1, addend2);
        assertEquals(expResult, result, 0.00);
        
    }
    
    
    @Test
    public void testSmallNegativeNumbers() {
        System.out.println("computeSum");
        float addend1 = -0.99F;
        float addend2 = -0.2F;
        float expResult = -1.19F;
        float result = Sum.computeSum(addend1, addend2);
        assertEquals(expResult, result, 0.00);
        
    }
    
    
    @Test
    public void testSmallNumbers() {
        System.out.println("computeSum");
        float addend1 = 0.1F;
        float addend2 = 0.3F;
        float expResult = 0.4F;
        float result = Sum.computeSum(addend1, addend2);
        assertEquals(expResult, result, 0.00);
        
    }
    
    
    @Test
    public void testASingleNegativeNumber() {
        System.out.println("computeSum");
        float addend1 = -21.02F;
        float addend2 = 10.20F;
        float expResult = 0.0F;
        float result = Sum.computeSum(addend1, addend2);
        assertEquals(expResult, result, 0.00);
        
    }
    
    @Test
    public void testASingleBigNumber() {
        System.out.println("computeSum");
        float addend1 = 151141794.054F;
        float addend2 = 2.01F;
        float expResult = 151141796.1F;
        float result = Sum.computeSum(addend1, addend2);
        assertEquals(expResult, result, 0.00);
        
    }
    
    
}
