/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
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

    /**
     * Test of computeTotalprice method, of class Tax.
     */
    @Test
    public void testComputeTotalprice() {
        System.out.println("computeTotalprice");
        float price = 0.0F;
        float expResult = 0.0F;
        float result = Tax.computeTotalprice(price);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of computeAddition method, of class Tax.
     */
    @Test
    public void testComputeAddition() {
        System.out.println("computeAddition");
        float addend1 =  1000000.0F;
        float addend2 =  2000000.0F ;
        float expResult = 3000000.0F ;
        float result = Tax.computeAddition(addend1, addend2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of computeSubstract method, of class Tax.
     */
    @Test
    public void testComputeSubstract() {
        System.out.println("computeSubstract");
        float minuend = 1000000.0F ;
        float subtrahend = 2000000.0F ;
        float expResult = -1000000.0F ;
        float result = Tax.computeSubstract(minuend, subtrahend);
        assertEquals(expResult, result, 0.0);
 
    }
     //                                  TestCases
    /*
    Addition
    inputs 
   addend1           addend 2           expected result          actual result
    1.89F              2.999F                    4.889F
   -1.89F             -2.999F                   -4.889F
    1.7F               1.4F                      3.1F
    1.8F               1.4F                      3.2F
   -3.6F               1.4F                     -2.2F
    4.5555F           -4.5555F                   0.0F
    0.0000009F        0.0000001F                 1.0E-6F
    3.888F            -7.8888F                  -4.0008F
    1000000.0F         2000000.0F                3000000.0F
    3.0F                1.0F                      4.0F
    
    Substraction
    inputs 
   minuend           subtrahend           expected result          actual result
    1.89F              2.999F                   -1.109F
   -1.89F             -2.999F                    1.109F
    1.7F               1.4F                      3.1F
    1.8F               1.4F                      3.2F
   -3.6F               1.4F                     -2.2F
    4.5555F           -4.5555F                   9.111F
    0.0000009F         0.0000001F                7.9999995E-7
    3.888F            -7.8888F                   11.7768F
    1000000.0F         2000000.0F               -1000000.0F
    3.0F                1.0F                      2.0F
    */
}
