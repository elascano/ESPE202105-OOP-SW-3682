/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.operations.utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lizbeth Cajas
 */
public class operationsTest {
    
    public operationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addition method, of class operations.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        float NUM1 = 10.3F;
        float NUM2 = 6.3F;
        float expResult = 16.6F;
        float result = operations.addition(NUM1, NUM2);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of subtract method, of class operations.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        float minuend = 10.0F;
        float subtrahend = -2.0F;
        float expResult = 8.0F;
        float result = operations.subtract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
       
    }
    
}
