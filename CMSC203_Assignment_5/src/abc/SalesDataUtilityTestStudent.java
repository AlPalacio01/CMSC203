/*
 * Class: CMSC203 32324
 * Instructor: Grigoriy Grinberg
 * Description: In this assignment, we will have to design and implement a Java program that will process sales data 
 * for multiple departments over multiple days. This data will be in the form of a ragged 2D array of double values. 
 * We will use input to read from input files and output to write unto output files.
 * Due: 04/20/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Alejandro Palacio
*/

package abc;

import static org.junit.Assert.*;
import org.junit.Test;

public class SalesDataUtilityTestStudent {

    private double[][] sample1 = {
        {100.50, 200.75, 150.00},
        {80.00, 90.00},
        {220.10, 130.50, 300.00, 50.25}
    };
    
    private double[][] sample2 = {
            {100.5, 100.75, 1000.75},
            {226.85, 100.1, 1060.75, 1540.75},
            {700.85, 700.85}
    };
    
    private double[][] sample3 = {
            {100.60}
    };

    @Test
    public void testGetTotal() {
        double total1 = SalesDataUtility.getTotal(sample1);
        assertEquals(1322.10, total1, 0.001);
        double total2 = SalesDataUtility.getTotal(sample2);
        assertEquals(5532.15, total2, 0.001);
        double total3 = SalesDataUtility.getTotal(sample3);
        assertEquals(100.60, total3, 0.001);
    }

    @Test
    public void testGetAverage() {
    	
        double avg1 = SalesDataUtility.getAverage(sample1);
        assertEquals(146.90, avg1, 0.001);
        double avg2 = SalesDataUtility.getAverage(sample2);
        assertEquals(614.68, avg2, 0.001);
        double avg3 = SalesDataUtility.getAverage(sample3);
        assertEquals(100.60, avg3, 0.001);
    }

    @Test
    public void testGetRowTotal() {
        assertEquals(451.25, SalesDataUtility.getRowTotal(sample1, 0), 0.001);
        assertEquals(170.00, SalesDataUtility.getRowTotal(sample1, 1), 0.001);
        assertEquals(700.85, SalesDataUtility.getRowTotal(sample1, 2), 0.001);
        
        assertEquals(1202.00, SalesDataUtility.getRowTotal(sample2, 0), 0.001);
        assertEquals(2928.45, SalesDataUtility.getRowTotal(sample2, 1), 0.001);
        assertEquals(1401.70, SalesDataUtility.getRowTotal(sample2, 2), 0.001);
        
        assertEquals(100.60, SalesDataUtility.getRowTotal(sample3, 0), 0.001);
    }

    @Test
    public void testGetColumnTotal() {
        assertEquals(400.60, SalesDataUtility.getColumnTotal(sample1, 0), 0.001);
        assertEquals(421.25, SalesDataUtility.getColumnTotal(sample1, 1), 0.001);  
        assertEquals(450.00, SalesDataUtility.getColumnTotal(sample1, 2), 0.001); 
        assertEquals(50.25, SalesDataUtility.getColumnTotal(sample1, 3), 0.001);
        
        assertEquals(1028.20, SalesDataUtility.getColumnTotal(sample2, 0), 0.001);
        assertEquals(901.70, SalesDataUtility.getColumnTotal(sample2, 1), 0.001);  
        assertEquals(2061.50, SalesDataUtility.getColumnTotal(sample2, 2), 0.001); 
        assertEquals(1540.75, SalesDataUtility.getColumnTotal(sample2, 3), 0.001);
        
        assertEquals(100.60, SalesDataUtility.getColumnTotal(sample3, 0), 0.001);
     
    }
    
    @Test
    public void testGetHighestLowest() {
        assertEquals(300.00, SalesDataUtility.getHighestInArray(sample1), 0.001);
        assertEquals(50.25, SalesDataUtility.getLowestInArray(sample1), 0.001);
        
        assertEquals(1540.75, SalesDataUtility.getHighestInArray(sample2), 0.001);
        assertEquals(100.1, SalesDataUtility.getLowestInArray(sample2), 0.001);
        
        assertEquals(100.60, SalesDataUtility.getHighestInArray(sample3), 0.001);
        assertEquals(100.60, SalesDataUtility.getLowestInArray(sample3), 0.001);
    }
    
}



















