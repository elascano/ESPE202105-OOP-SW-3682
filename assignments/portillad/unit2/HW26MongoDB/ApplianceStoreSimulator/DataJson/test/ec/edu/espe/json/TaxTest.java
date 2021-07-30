/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.json;

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
public class TaxTest {
    
    public TaxTest() {
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
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva() {
        System.out.println("computeIva");
        float price = -12.0F;
        float expResult = 0.0F;
        float result = Tax.computeIva(price);
        assertEquals(expResult, result, 0.0);
     
    }

    /**
     * Test of computeTotalPrice method, of class Tax.
     */
    @Test
    public void testComputeTotalPrice() {
        System.out.println("computeTotalPrice");
        float price = -12.0F;
        float expResult = 0.0F;
        float result = Tax.computeTotalPrice(price);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
