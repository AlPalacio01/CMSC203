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
import java.util.*;
import java.io.*;

public class SalesAppDriver {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		String inputFileName, outputFileName;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the name of the input file: ");
		inputFileName = scanner.nextLine();   
		System.out.println("Enter the name of the output file: ");
		outputFileName = scanner.nextLine();   
		
		double[][] data = SalesFileIO.readSalesData(inputFileName);
		
		
		
		try {
			SalesFileIO.writeSummary(outputFileName, data);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}



