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
public class SubtractTest {
    
    public SubtractTest() {
    }

    /**
     * Test of computeSubtract method, of class Subtract.
     */
    @Test
    public void testComputeSubtract() {
        System.out.println("computeSubtract");
        float minuend =  10.00F;
        float subtraend = 14.00F;
        float expResult = -4.00F;
        float result = Subtract.computeSubtract(minuend, subtraend);
        assertEquals(expResult, result, 0.00);
        
    }
    
    
    @Test
    public void testNegativeNumbers() {
        System.out.println("computeSubtract");
        float minuend = -24.11F;
        float subtraend = -12.21F;
        float expResult = -11.9F;
        float result = Subtract.computeSubtract(minuend, subtraend);
        assertEquals(expResult, result, 0.00000);
        
    }
    
    @Test
    public void testBigNumbers() {
        System.out.println("computeSubtract");
        float minuend = 21454512.00F;
        float subtraend = 15611515.00F;
        float expResult = 5842997F;
        float result = Subtract.computeSubtract(minuend, subtraend);
        assertEquals(expResult, result, 0.00);
        
    }
    
    @Test
    public void testBigNegativeNumbers() {
        System.out.println("computeSubtract");
        float minuend = -2512151.152F;
        float subtraend = -2515151.121F;
        float expResult = 2999.969F;
        float result = Subtract.computeSubtract(minuend, subtraend);
        assertEquals(expResult, result, 0.00);
        
    }
    
    
    @Test
    public void testBigDecimalNumbers() {
        System.out.println("computeSubtract");
        float minuend = 0.515616515F;
        float subtraend = 2.114152F;
        float expResult = -1.598535485F;
        float result = Subtract.computeSubtract(minuend, subtraend);
        assertEquals(expResult, result, 0.00);
        
    }
    
    
    @Test
    public void testBigNegativeDecimalNumbers() {
        System.out.println("computeSubtract");
        float minuend = -0.515616515F;
        float subtraend = -2.114152F;
        float expResult = 1.598535485F;
        float result = Subtract.computeSubtract(minuend, subtraend);
        assertEquals(expResult, result, 0.00);
        
    }
    
    @Test
    public void testSmallNegativeNumbers() {
        System.out.println("computeSubtract");
        float minuend = -0.99F;
        float subtraend = -0.2F;
        float expResult = -0.79F;
        float result = Subtract.computeSubtract(minuend, subtraend);
        assertEquals(expResult, result, 0.00);
        
    }
    @Test
    public void testSmallNumbers() {
        System.out.println("computeSubtract");
        float minuend = 0.1F;
        float subtraend = 0.3F;
        float expResult = -0.2F;
        float result = Subtract.computeSubtract(minuend, subtraend);
        assertEquals(expResult, result, 0.00);
        
    }
    
    @Test
    public void testASingleNegativeNumber() {
        System.out.println("computeSubtract");
        float minuend = -21.02F;
        float subtraend = 10.20F;
        float expResult = -31.22F;
        float result = Subtract.computeSubtract(minuend, subtraend);
        assertEquals(expResult, result, 0.00);
        
    }
    
    @Test
    public void testASingleBigNumber() {
        System.out.println("computeSubtract");
        float minuend = 151141794.054F;
        float subtraend = 2.01F;
        float expResult = 151141792F;
        float result = Subtract.computeSubtract(minuend, subtraend);
        assertEquals(expResult, result, 0.00);
        
    }
    
}
