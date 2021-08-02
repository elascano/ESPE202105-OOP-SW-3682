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
    public void testComputeIvaCero() {
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
    
    @Test
    public void testComputeIvaBig() {
        System.out.println("computeIva");
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeIva(price);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testComputeIvNegative() {
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
    public void testComputeTotalPriceCero() {
        System.out.println("computeTotalPrice");
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeTotalPrice(price);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testComputeTotalPriceSmall() {
        System.out.println("computeTotalPrice");
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeTotalPrice(price);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testComputeTotalPriceBig() {
        System.out.println("computeTotalPrice");
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeTotalPrice(price);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testComputeTotalPriceNegative() {
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
    public void testComputeGainCero() {
        System.out.println("computeGain");
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeGain(price);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testComputeGainSmall() {
        System.out.println("computeGain");
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeGain(price);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testComputeGainBig() {
        System.out.println("computeGain");
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeGain(price);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testComputeGainNegative() {
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
    public void testComputePVPCero() {
        System.out.println("computePVP");
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computePVP(price);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testComputePVPSmall() {
        System.out.println("computePVP");
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computePVP(price);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testComputePVPBig() {
        System.out.println("computePVP");
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computePVP(price);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testComputePVPNegative() {
        System.out.println("computePVP");
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computePVP(price);
        assertEquals(expResult, result, 0.0);
    }
}
