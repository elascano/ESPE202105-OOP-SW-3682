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
public class OpertionSumTest {
    
    public OpertionSumTest() {
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
     * Test of computeSum method, of class OpertionSum.
     */
    @Test
    public void testComputeSum() {
        System.out.println("computeSum");
        float addend1 = 23.56F;
        float addend2 = 23.56F;
        float expResult = 47.12F;
        float result = OpertionSum.computeSum(addend1, addend2);
        assertEquals(expResult, result, 0.0);
      
    }
    
}
