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
    public void awalTest()
    {
    
    D math = new D();
    System.out.println("awal test ");
    
    }
    
    
    @Test
    public void test1()
    {
         
        AssertEquals("Seharusnya", 2, Math.D(1,1));
    
    }
    
    
    @Test
    public void test2()
    {
        Math.toString("11");
        AssertSame("Harusnya", 44, Math.toString);
        
    }

    
    @After
    public void akhirtest()
    {
    System.out.println("akhir test");
    }
}

