/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphonestore.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class CellPhoneTest {
    
    public CellPhoneTest() {
    }

    /**
     * Test of toString method, of class CellPhone.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CellPhone instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateProfit method, of class CellPhone.
     */
    @Test
    public void testGenerateProfit() {
        System.out.println("generateProfit");
        float price = 0.0F;
        CellPhone instance = null;
        Profit expResult = null;
        Profit result = instance.generateProfit(price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class CellPhone.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        CellPhone instance = null;
        String expResult = "";
        String result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class CellPhone.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "";
        CellPhone instance = null;
        instance.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModel method, of class CellPhone.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        CellPhone instance = null;
        String expResult = "";
        String result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModel method, of class CellPhone.
     */
    @Test
    public void testSetModel() {
        System.out.println("setModel");
        String model = "";
        CellPhone instance = null;
        instance.setModel(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
