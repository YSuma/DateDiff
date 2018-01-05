/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datediff;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dolly
 */
public class MyDateTest {
    
    public MyDateTest() {
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
     * Test of getDay method, of class MyDate.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        MyDate instance = new MyDate("03 01 2018");
        int expResult = 3;
        int result = instance.getDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDay method, of class MyDate.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        int day = 3;
        MyDate instance =new MyDate();
        instance.setDay(day);
    }

    /**
     * Test of getMonth method, of class MyDate.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        MyDate instance = new MyDate("03 01 2018");
        int expResult = 01;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMonth method, of class MyDate.
     */
    @Test
    public void testSetMonth() {
        System.out.println("setMonth");
        int month = 01;
        MyDate instance = new MyDate();
        instance.setMonth(month);
    }

    /**
     * Test of getYear method, of class MyDate.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        MyDate instance = new MyDate("03 01 2018");
        int expResult = 2018;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of setYear method, of class MyDate.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 2018;
        MyDate instance = new MyDate();
        instance.setYear(year);
    }

    /**
     * Test of isDateValid method, of class MyDate.
     */
    @Test
    public void testIsDateValid() {
        System.out.println("isDateValid");
        MyDate instance = new MyDate("03 01 2018");
        boolean expResult = true;
        boolean result = instance.isDateValid();
        assertEquals(expResult, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIsDateValid2() {
        System.out.println("isDateValid");
        MyDate instance = new MyDate("32 34 2018");
    }

    /**
     * Test of isLeapYear method, of class MyDate.
     */
    @Test
    public void testIsLeapYear() {
        System.out.println("isLeapYear");
        MyDate instance = new MyDate("03 01 2018");
        boolean expResult = false;
        boolean result = instance.isLeapYear();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsLeapYear2() {
        System.out.println("isLeapYear");
        MyDate instance = new MyDate("03 01 2000");
        boolean expResult = true;
        boolean result = instance.isLeapYear();
        assertEquals(expResult, result);
    }
    
}
