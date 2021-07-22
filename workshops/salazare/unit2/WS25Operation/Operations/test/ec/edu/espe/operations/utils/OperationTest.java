/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.operations.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
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
        float addend1 = 9.4F;
        float addend2 = 6.6F;
        float expResult = -16.0F;
        float result = Operation.sum(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    
    public void testSumNegative() {
        System.out.println("sum");
        float addend1 = -9.4F;
        float addend2 = -6.6F;
        float expResult = -16.0F;
        float result = Operation.sum(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    
    public void testSumZero() {
        System.out.println("sum");
        float addend1 = 9.4F;
        float addend2 = -6.6F;
        float expResult = -16.0F;
        float result = Operation.sum(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    
    public void testSumLong() {
        System.out.println("sum");
        float addend1 = -9.4F;
        float addend2 = -6.6F;
        float expResult = -16.0F;
        float result = Operation.sum(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    
    public void testSumEquals() {
        System.out.println("sum");
        float addend1 = -9.4F;
        float addend2 = -6.6F;
        float expResult = -16.0F;
        float result = Operation.sum(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    
    public void testSum1() {
        System.out.println("sum");
        float addend1 = -9.4F;
        float addend2 = -6.6F;
        float expResult = -16.0F;
        float result = Operation.sum(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }
    
    public void testSum2() {
        System.out.println("sum");
        float addend1 = -9.4F;
        float addend2 = -6.6F;
        float expResult = -16.0F;
        float result = Operation.sum(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of substract method, of class Operation.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        float minuend = 10.0F;
        float substraend = 20.0F;
        float expResult = 30.00F;
        float result = Operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.00);
       
    }
    
     public void testSubstractNegative() {
        System.out.println("substract");
        float minuend = 10.0F;
        float substraend = -10.0F;
        float expResult = 0.00F;
        float result = Operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.00);
       
    }
     
     
      public void testSubstractPositive() {
        System.out.println("substract");
        float minuend = 15.0F;
        float substraend = 10.0F;
        float expResult = 5.00F;
        float result = Operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.00);
       
    }
      
       public void testSubstractLong() {
        System.out.println("substract");
        float minuend = 10.023F;
        float substraend = 5.0567F;
        float expResult = 4.9663F;
        float result = Operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.00);
       
    }
       
        public void testSubstractEquals() {
        System.out.println("substract");
        float minuend = 10.0F;
        float substraend = 10.0F;
        float expResult = 0.00F;
        float result = Operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.00);
       
    }
        
         public void testSubstract1() {
        System.out.println("substract");
        float minuend = 30.5F;
        float substraend = 15.5F;
        float expResult = 15.00F;
        float result = Operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.00);
       
    }
         
          public void testSubstractNegative2() {
        System.out.println("substract");
        float minuend = 10.0F;
        float substraend = 20.0F;
        float expResult = -10.00F;
        float result = Operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.00);
       
    }
          
           public void testSubstractPositive2() {
        System.out.println("substract");
        float minuend = 10.0F;
        float substraend = 50.6F;
        float expResult = 40.6F;
        float result = Operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.00);
       
    }
           
            public void testSubstractLong2() {
        System.out.println("substract");
        float minuend = 13.553F;
        float substraend = -12.455F;
        float expResult = 26.008F;
        float result = Operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.00);
       
    }
          
     public void testSubstract2() {
        System.out.println("substract");
        float minuend = 11.2F;
        float substraend = 9.8F;
        float expResult = 1.4F;
        float result = Operation.substract(minuend, substraend);
        assertEquals(expResult, result, 0.00);
       
    }
    
    
}
