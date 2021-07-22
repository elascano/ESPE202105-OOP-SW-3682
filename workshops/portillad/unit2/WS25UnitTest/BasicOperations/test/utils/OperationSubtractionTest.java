/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class OperationSubtractionTest {
    
    public OperationSubtractionTest() {
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
     * Test of computsubtraction method, of class OperationSubtraction.
     */
    @Test
    public void testComputsubtraction() {
        System.out.println("computsubtraction");
        float minuend = 23.56F;
        float subtracting = 23.56F;
        float expResult = 0.0F;
        float result = OperationSubtraction.computsubtraction(minuend, subtracting);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
