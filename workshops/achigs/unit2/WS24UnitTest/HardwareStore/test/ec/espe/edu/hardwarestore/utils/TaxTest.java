/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.hardwarestore.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
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
        assertEquals(expResult, result, 0.00);
        
    }

    @Test
    public void testComputeIvaNegative() {
        System.out.println("computeIva");
        float price = -156.25F;
        float expResult = 0.00F;
        float result = Tax.computeIva(price);
        assertEquals(expResult, result, 0.00);
        
    }
    
    /**
     * Test of computeTotalPrice method, of class Tax.
     */
    @Test
    public void testComputeTotalPrice() {
        System.out.println("computeTotalPrice");
        float price = 156.25F;
        float expResult = 175.00F;
        float result = Tax.computeTotalPrice(price);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
