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
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class AddAndSubtractTest {
    
    public AddAndSubtractTest() {
    }

    /**
     * Test of Sum method, of class AddAndSubtract.
     */
    @Test
    public void testSum() {
        System.out.println("Sum");
        float addend1 = 82.0F;
        float addend2 = 0.0F;
        float expResult = 82.0F;
        float result = AddAndSubtract.Sum(addend1, addend2);
        assertEquals(expResult, result, 0.0);
   
    }

    /**
     * Test of Subctration method, of class AddAndSubtract.
     */
    @Test
    public void testSubctration() {
        System.out.println("Subctration");
        float minuend = 1.0F;
        float subtract = 5.0F;
        float expResult = -4.0F;
        float result = AddAndSubtract.Subctration(minuend, subtract);
        assertEquals(expResult, result, 0.0);
      
    }
    
}
