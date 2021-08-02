/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asmal Kevin
 */
public class TaxTest {
    
    public TaxTest() {
    }

    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva() {
        System.out.println("computeIva");
        float price = 156.25F;
        float expResult = 18.75F;
        float result = Tax.computeIva(price);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of computeTotalPrice method, of class Tax.
     */
    @Test
    public void testComputeTotalPrice() {
        System.out.println("computeTotalPrice");
        float price = 156.5F;
        float expResult = 18.75F;
        float result = Tax.computeTotalPrice(price);
        assertEquals(expResult, result, 0.0);
    }
    
}
