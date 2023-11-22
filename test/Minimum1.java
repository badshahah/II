/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import minimum.Minimum;

public class Minimum1 {
    
    public Minimum1() {
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

    @Test
    public void Min() {
    assertEquals(2,Minimum.findmin(new int[]{2,6,7,9}));
    assertEquals(-9,Minimum.findmin(new int[]{-9,1,-8,-3,-6}));
}
}