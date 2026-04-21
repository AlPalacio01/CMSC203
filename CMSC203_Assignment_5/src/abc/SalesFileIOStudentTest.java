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

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalesFileIOStudentTest {
	
	    
	private double[][] sample = {
			
	    {100.5, 100.75, 1000.75},
	    {226.85, 100.1, 1060.75, 1540.75},
		{700.85, 700.85}
	};
	 

	@Test
	void testReadAndWrite() throws IOException {

		SalesFileIO.inputFileName = "sampleTextFile.txt";
		SalesFileIO.writeSummary("sampleTextFile.txt", sample);
		
		BufferedReader bufferedreader = new BufferedReader(new FileReader("sampleTextFile.txt"));
		
		assertEquals("Data loaded from sampleTextFile.txt", bufferedreader.readLine());
		bufferedreader.readLine();
		assertEquals("Total Sales: 5532.15", bufferedreader.readLine());
		bufferedreader.readLine();
		
		assertEquals("Average Sales: 614.68", bufferedreader.readLine());
		assertEquals("Highest Sales: 1540.75", bufferedreader.readLine());
		assertEquals("Lowest Sales: 100.10", bufferedreader.readLine());

		assertEquals("Row: 0  total: 1202.00", bufferedreader.readLine());
		assertEquals("Row: 1  total: 2928.45", bufferedreader.readLine());
		assertEquals("Row: 2  total: 1401.70", bufferedreader.readLine());

		assertEquals("Col: 0  total: 1028.20", bufferedreader.readLine());
		assertEquals("Col: 1  total: 901.70", bufferedreader.readLine());
		assertEquals("Col: 2  total: 2061.50", bufferedreader.readLine());
		assertEquals("Col: 3  total: 1540.75", bufferedreader.readLine());
		
		bufferedreader.close();
		
	}
	

}
















