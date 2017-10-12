/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.shared;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author talend
 */
public class FieldVerifierTest {
    
    public FieldVerifierTest() {
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
     * Test of isValidName method, of class FieldVerifier.
     */
    @Test
    public void testIsValidName() {
        System.out.println("isValidName");
        String name = "Joris";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidName(name);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testIsNotValidName() {
        System.out.println("isNotValidName");
        String name = "";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidName(name);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isValidDecimal method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimal() {
        System.out.println("isValidDecimal");
        Integer nbr = 125;
        boolean expResult = true;
        boolean result = FieldVerifier.isValidDecimal(nbr);
        assertEquals(expResult, result);

    }

    /**
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRoman() {
        System.out.println("isValidRoman");
        String nbr = "MCDXXVII";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidRoman(nbr);
        assertEquals(expResult, result);

    }

    /**
     * Test of isValidDate method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDate() {
        System.out.println("isValidDate");
        String date = "25/03/1998";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidDate(date);
        assertEquals(expResult, result);

    }
    
}
