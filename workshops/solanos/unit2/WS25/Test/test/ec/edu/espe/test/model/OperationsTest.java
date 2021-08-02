/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.test.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class OperationsTest {
    
    public OperationsTest() {
    }

    /**
     * Test of operationSum method, of class Operations.
     */
    @Test
    public void testOperationSum() {
        System.out.println("operationSum");
        float addend1 = 1.5F;
        float addend2 = 0.25F;
        Operations instance = new Operations();
        float expResult = 1.75F;
        float result = instance.operationSum(addend1, addend2);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of operationSubtrat method, of class Operations.
     */
    @Test
    public void testOperationSubtrat() {
        System.out.println("operationSubtrat");
        float minuend = 55.01F;
        float substraend = 0.09F;
        Operations instance = new Operations();
        float expResult = 55.1F;
        float result = instance.operationSubtrat(minuend, substraend);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
