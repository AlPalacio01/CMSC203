/*
 * Class: CMSC203 32324
 * Instructor: Grigoriy Grinberg
 * Description: A command line Grade Calculator that reads course grading configuration and 
 * student scores, validates all inputs, computes a final numeric average and letter grade, 
 * and writes a summary report to a file. The program must use Java fundamentals, Scanner 
 * for keyboard and file input, decision structures, loops, command line arguments, and input 
 * validation.
 * Due: 02/09/2001
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Alejandro Palacio
*/

import java.io.*;
import java.util.*;

public class GradeCalculator {

	
	public static void main(String[] args) throws IOException {
		
		boolean defaultConfiguration = false;
		
		int NumGradedCategories = 0, categoryWeightSum = 0;
		int categoryWeight[] = null;
		
		String CourseName = "";
		String categoryName[] = null;
		String studentFirstName = "";
		String studentLastName  = "";
		String InputStudentScores = "grades_input.txt";
		String OutputSummaryReport = "grades_report.txt";
		
		if (args.length > 0) {
			
			InputStudentScores = args[0];
		}
		
		if (args.length > 1) {
			
			OutputSummaryReport = args[1];
		}
		
		System.out.println("====================================================\n\t"
				+ "CMSC203 Project 1 - Grade Calculator\n" +
				"====================================================\n");
		
		System.out.println("Loading configuration from gradeconfig.txt...");
		
		try {
			
			Scanner gradeConfigFile = new Scanner(new File("gradeconfig.txt"));
			
			CourseName = gradeConfigFile.nextLine().trim();
			NumGradedCategories = gradeConfigFile.nextInt();
			gradeConfigFile.nextLine();
			
			categoryName = new String[NumGradedCategories];
			categoryWeight= new int[NumGradedCategories];
			
			for (int i = 0; i < NumGradedCategories; i++) {
				
					
				categoryName[i] = gradeConfigFile.next();
				categoryWeight[i] = gradeConfigFile.nextInt();
					
				categoryWeightSum += categoryWeight[i];
					
		
			}
			gradeConfigFile.close();
			
			if (categoryWeightSum != 100) {
				
				System.out.println("Category sum is not 100.");
				defaultConfiguration = true;
			}
			
			if (defaultConfiguration == false) {
				System.out.println("Configuration loaded successfully.");
			}
			
		} catch (Exception e) {
			defaultConfiguration = true;

		}
		

		
		
		if (defaultConfiguration == true) {
			
			System.out.println("Could not load grade configuration.");
			System.out.println("Using Default Configuration.");
			CourseName = "CMSC203 Computer Science I";
			NumGradedCategories = 3;
			
			categoryName = new String[] {"Projects", "Exams", "Quizzes"};
			categoryWeight= new int[] {40, 30, 30};
			
		}
		
		System.out.println("\nUsing input file: " + InputStudentScores);
		System.out.println("Using output file: " + OutputSummaryReport);
		System.out.println("\nReading Student Scores...\n");
		double categoryAverageGrade[] = new double[NumGradedCategories];
		
		try {
			
			Scanner gradeInputFile = new Scanner(new File(InputStudentScores));
			
			studentFirstName = gradeInputFile.nextLine().trim();
			studentLastName = gradeInputFile.nextLine().trim();

			
			while (gradeInputFile.hasNext()) {
				
				String category = gradeInputFile.nextLine().trim();
				
				int nameMatchIndex = -1;
				
				for (int k = 0; k < NumGradedCategories; k++) {
					
					if (category.equalsIgnoreCase(categoryName[k])) {
						
						nameMatchIndex = k;
						break;
					}
				}
				
				int numberOfGrades = gradeInputFile.nextInt();
				
				gradeInputFile.nextLine();
				
				double categoryGrades[] = new double[numberOfGrades];
				double gradeSum = 0.0;
				
				for (int l = 0; l < numberOfGrades; l++) {
					
					categoryGrades[l] = gradeInputFile.nextDouble();
					gradeSum += categoryGrades[l];
				}	
				
				gradeInputFile.nextLine();
				
				if (nameMatchIndex == -1) {
					System.out.println("Error, Category name: " + category + " Not found.");
					continue;
				}
				
				categoryAverageGrade[nameMatchIndex] = gradeSum/numberOfGrades;
				
			}
			
			gradeInputFile.close();
			
		} catch (Exception e) {
			
			System.out.println("Error reading file");

		}
		
		PrintWriter outputFile = new PrintWriter(OutputSummaryReport);
		
		System.out.println("Student: " + studentFirstName + " " + studentLastName);
		outputFile.println("Student: " + studentFirstName + " " + studentLastName);
		System.out.println("Course: " + CourseName);
		outputFile.println("Course: " + CourseName);
		System.out.println("\nCategory Results: ");
		outputFile.println("\nCategory Results: ");
		
		for (int m = 0; m < NumGradedCategories; m++) {
			
			System.out.println("\t" + categoryName[m] + "(" + categoryWeight[m] + "%): average = " + categoryAverageGrade[m]);
			outputFile.println("\t" + categoryName[m] + "(" + categoryWeight[m] + "%): average = " + categoryAverageGrade[m]);
		}
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nApply +/- grading? (Y/N): ");
		String yesNo = scanner.next();
		String sign = "";
		
		double numericGrade = 0.0;
		String baseLetterGrade = null;
		
		for (int n = 0; n < NumGradedCategories; n++) {
			
			numericGrade += (categoryAverageGrade[n] * categoryWeight[n]) / 100.0;
		}
		
		System.out.printf("\nOverall numeric average: %.2f%n", numericGrade);
		outputFile.printf("\nOverall numeric average: %.2f%n", numericGrade);
		
		if (numericGrade >= 90) {
			baseLetterGrade = "A";
		}		
		if (numericGrade >= 80 && numericGrade < 90) {
			baseLetterGrade = "B";
		}		
			
		if (numericGrade >= 70 && numericGrade < 80) {
			baseLetterGrade = "C";
		}		
			
		if (numericGrade >= 60 && numericGrade < 70) {
			baseLetterGrade = "D";
		}		
			
		if (numericGrade < 60) {
			baseLetterGrade = "F";
		}		

		
		do {
			
			if (yesNo.equalsIgnoreCase("y")) {
				
				double lastDigitOfGrade = numericGrade % 10;
				
				if (lastDigitOfGrade > 7) {
					
					sign = "+";
				} else if (lastDigitOfGrade < 3) {
					
					sign = "-";
				}
				System.out.println("Base letter grade: " + baseLetterGrade);
				outputFile.println("Base letter grade: " + baseLetterGrade);
				
				System.out.println("Final letter grade: " + baseLetterGrade + sign);
				outputFile.println("Final letter grade: " + baseLetterGrade + sign);
				
			} else if (yesNo.equalsIgnoreCase("n")){
				
				System.out.println("Final letter grade: " + baseLetterGrade);
				outputFile.println("Final letter grade: " + baseLetterGrade);
				
			}
			
		} while (!yesNo.equalsIgnoreCase("n") && !yesNo.equalsIgnoreCase("y"));
		

		
		outputFile.close();
		
		System.out.println("\nSummary written to: " + OutputSummaryReport);
		System.out.println("Program complete. Goodbye!");
	}
	
	
	
}






























