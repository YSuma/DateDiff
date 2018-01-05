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
public class DateUtilsTest {
    
    public DateUtilsTest() {
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
     * Test of difference method, of class MyDateUtils.
     */
    @Test
    public void testDifference() {
        System.out.println("difference");
        MyDate date = new MyDate("12 12 2018");
        MyDate date2 = new MyDate("12 12 2018");
        DateUtils instance = new DateUtils();
        int expResult = 0;
        int result = instance.difference(date, date2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDifference2() {
        System.out.println("difference");
        MyDate date = new MyDate("12 12 2017");
        MyDate date2 = new MyDate("12 12 2018");
        DateUtils instance = new DateUtils();
        int expResult = 365;
        int result = instance.difference(date, date2);
        assertEquals(expResult, result);
    }
    
   
    /**
     * Test of getDaysRemaining method, of class MyDateUtils.
     */
    @Test
    public void testGetDaysRemaining() {
        System.out.println("getDaysRemaining");
        MyDate date = new MyDate("30 12 2018");
        DateUtils instance = new DateUtils();
        int expResult = 1;
        int result = instance.getDaysRemaining(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDaysInYearsTillDate method, of class MyDateUtils.
     */
    @Test
    public void testGetDaysInYearsTillDate() {
        System.out.println("getDaysInYearsTillDate");
        MyDate date = new MyDate("31 01 2018");
        DateUtils instance = new DateUtils();
        int expResult = 31;
        int result = instance.getDaysInYearsTillDate(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDaysDifferenceInSameYear method, of class MyDateUtils.
     */
    @Test
    public void testGetDaysDifferenceInSameYear() {
        System.out.println("getDaysDifferenceInSameYear");
        MyDate date = new MyDate("01 01 2018");
        MyDate date2 = new MyDate("01 04 2018");
        DateUtils instance = new DateUtils();
        int expResult = 90;
        int result = instance.getDaysDifferenceInSameYear(date, date2);
        assertEquals(expResult, result);
    }
}
