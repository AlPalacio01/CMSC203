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

public class SalesDataUtility {

	public static double getTotal(double[][] data){
		
		double total = 0.0;
		
		for (int row = 0; row < data.length; row++) {
			
			for (int col = 0; col < data[row].length; col++) {
				
				total += data[row][col];
			}
		}
		
		return total;
		
	}
	
	public static double getAverage(double[][] data) {
		
		double total = 0.0;
		int numOfElements = 0;
		
		for (int row = 0; row < data.length; row++) {
			
			for (int col = 0; col < data[row].length; col++) {
				
				total += data[row][col];
				numOfElements++;
			}
		}
		
		if (numOfElements == 0) {
			return 0.0;
		}
		
		return Double.parseDouble(String.format("%.2f", (total / numOfElements)));
		
	}
	
	public static double getRowTotal(double[][] data, int row) {
		
		double rowTotal = 0.0;
		
		for (int col = 0; col < data[row].length; col++) {
			
			rowTotal += data [row][col];
		}
		
		return rowTotal;
	}
	
	public static double getColumnTotal(double[][] data, int col) {
		
		double columnTotal = 0.0;
	
		for (int row = 0; row < data.length; row++) {
			
			if (col < data[row].length) {
				columnTotal += data[row][col];
			}
	
		}
	
		return columnTotal;
	
	}
	
	public static double getHighestInRow(double[][] data, int row) {
		
		double highestInRow = Double.NEGATIVE_INFINITY;
		
		for (int col = 0; col < data[row].length; col++) {
			
			if (highestInRow < data[row][col])
				
				highestInRow = data[row][col];
		}
		
		return highestInRow;
	}
	
	public static double getLowestInRow(double[][] data, int row) {

		double lowestInRow = Double.POSITIVE_INFINITY;
		
		for (int col = 0; col < data[row].length; col++) {
			
			if (lowestInRow > data[row][col])
				
				lowestInRow = data[row][col];
		}
		
		return lowestInRow;
	}
	
	public static double getHighestInArray(double[][] data) {
		
		double highestInArray = Double.NEGATIVE_INFINITY;
		
		for (int row = 0; row < data.length; row++) {
			
			for (int col = 0; col < data[row].length; col++) {
				
				if (highestInArray < data[row][col]) {
					highestInArray = data[row][col];
				}

			}
		}
		
		return highestInArray;
		
	}
	
	public static double getLowestInArray(double[][] data) {
		
		double lowestInArray = Double.POSITIVE_INFINITY;
		
		for (int row = 0; row < data.length; row++) {
			
			for (int col = 0; col < data[row].length; col++) {
				
				if (lowestInArray > data[row][col]) {
					lowestInArray = data[row][col];
				}

			}
		}
		
		return lowestInArray;
		
	}
	
}







