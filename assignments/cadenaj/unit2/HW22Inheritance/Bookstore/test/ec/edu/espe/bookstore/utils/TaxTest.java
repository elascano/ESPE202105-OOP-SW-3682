/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
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
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeIva(price);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testComputeIvaSmall() {
        System.out.println("computeIva");
        float price = 0.0F;
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
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeTotalPrice(price);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of computeGain method, of class Tax.
     */
    @Test
    public void testComputeGain() {
        System.out.println("computeGain");
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeGain(price);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of computePVP method, of class Tax.
     */
    @Test
    public void testComputePVP() {
        System.out.println("computePVP");
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computePVP(price);
        assertEquals(expResult, result, 0.0);
    }
    
}
