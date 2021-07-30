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
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class TaxTest {
    
    public TaxTest() {
    }

    /**
     * Test of calculateSum method, of class Tax.
     */
    @Test
    public void testCalculateSum() {
        System.out.println("calculateSum");
        float num1 = -2.61F;
        float num2 = -5.98F;
        float expResult = -8.59F;
        float result = Tax.calculateSum(num1, num2);
        assertEquals(expResult, result, 0.00);
    }

    /**
     * Test of calculateSubtraction method, of class Tax.
     */
    @Test
    public void testCalculateSubtraction() {
        System.out.println("calculateSubtraction");
        float num1 = -2.61F;
        float num2 = -5.98F;
        float expResult = 3.37F;
        float result = Tax.calculateSubtraction(num1, num2);
        assertEquals(expResult, result, 0.00);
    }
    
}
