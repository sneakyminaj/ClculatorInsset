/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

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
public class SoldeServiceImplTest {
    
    public SoldeServiceImplTest() {
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
     * Test of calculSolde method, of class SoldeServiceImpl.
     */
    @Test
    public void testCalculSolde() {
        System.out.println("calculSolde");
        String initAmnt = "1000";
        Integer perc = 25;
        SoldeServiceImpl instance = new SoldeServiceImpl();
        Double expResult = 750.0;
        Double result = instance.calculSolde(initAmnt, perc);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
}
