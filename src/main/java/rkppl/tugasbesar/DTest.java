/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rkppl.tugasbesar;

/**
 *
 * @author ASUS
 */

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import rkppl.tugasbesar.D;


public class DTest {
    
    @Before
    {
    
    D math = new D();
    System.out.println("awal test");
    
    }
    
    
    @Test
    {
    
        AssertEquals("Seharusnya", 2, math.D(1,1));
    
    }
    
    
    @Test
    {
        Math.toString("11");
        AssertSame("Harusnya", 44, Math.toString);
        
    }

    
    @After
    {
    System.out.println("akhir test");
    }
}

