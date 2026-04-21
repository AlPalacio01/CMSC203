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
import java.io.*;

public class SalesFileIO {
	
	public static String inputFileName;
	
	
	public static double[][] readSalesData(String filename) throws FileNotFoundException{
		
		inputFileName = filename;  
		
		try {
			BufferedReader bufferedreader = new BufferedReader(new FileReader(filename));
			String currentLine; 
			int numOfRows= 0; 
			
			while ((currentLine = bufferedreader.readLine()) != null) {
				
				if (!currentLine.trim().isEmpty()) {
					numOfRows++;
				}
				
			}
			bufferedreader.close();
			
			
			
			double[][] newArrayData = new double[numOfRows][];
			
			bufferedreader = new BufferedReader(new FileReader(filename));
			int currentRow = 0;
			
	
			while ((currentLine = bufferedreader.readLine()) != null) {
				
				if (currentLine.trim().isEmpty()) {
					
					continue;
				}
				
				String[] parts = currentLine.split("\\s+"); 
				newArrayData[currentRow] = new double[parts.length];
				
				for (int i = 0; i < parts.length; i++) {
					
					newArrayData[currentRow][i] = Double.parseDouble(parts[i]);
				}
				currentRow++;
			}
			
			
			bufferedreader.close();
			return newArrayData;
			
			
		} catch(IOException e) {
			
			e.printStackTrace();  
		}
		return new double[0][0];
		
	}
	
	public static void writeSummary(String filename, double[][] data) throws IOException{
		
		
		try {
			PrintWriter printwriter = new PrintWriter(new FileWriter(filename));
			
			printwriter.printf("Data loaded from " + inputFileName + "\n\n");
			printwriter.printf("Total Sales: %.2f%n%n",  SalesDataUtility.getTotal(data) );
			printwriter.printf("Average Sales: %.2f%n",  SalesDataUtility.getAverage(data) );
			printwriter.printf("Highest Sales: %.2f%n",  SalesDataUtility.getHighestInArray(data) );
			printwriter.printf("Lowest Sales: %.2f%n",  SalesDataUtility.getLowestInArray(data) );
			
			
			for (int row = 0; row < data.length; row++) {
				
				printwriter.printf("Row: %d  total: %.2f%n", row,  SalesDataUtility.getRowTotal(data, row));
			}
			
			int columns = 0;
			for (int row = 0; row < data.length; row++) {
				
				if (data[row].length > columns) {
					
					columns = data[row].length;
				}
			}
			
			
			for (int col = 0; col < columns; col++) {
				
				printwriter.printf("Col: %d  total: %.2f%n", col,  SalesDataUtility.getColumnTotal(data, col));
			}
			
			printwriter.close();
			
			
		} catch(IOException e) {
			
			e.printStackTrace();  
		}
	}
}









