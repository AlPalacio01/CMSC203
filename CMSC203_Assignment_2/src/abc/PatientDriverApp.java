/*
 * Class: CMSC203 32324
 * Instructor: Grigoriy Grinberg
 * Description: Build a Patient class, Procedure class, and PatientDriverApp class. The Patient 
 * class takes the patient’s information and details. The Procedure class represents the medical 
 * procedure that has been performed on a patient. The PatientDriverApp class creates an instance 
 * of the Patient class and initializes it with information. It also creates three instances of 
 * the Procedure class each using the different constructors.
 * Due: 02/23/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Alejandro Palacio
*/
package abc;
import java.util.*;
import java.io.*;

public class PatientDriverApp {

	
	public static void main(String[] args) {
		
		/*
		 * Patient 1
		 */
		Patient patient = new Patient("Alejandro", "Palacio", "P.", "Main", "Rockville", "MD", "20852", "240-123-4567", "Iggy", "240-123-4567");
		
		/*
		 * Procedure 1
		 */
		Scanner scanner1 = new Scanner(System.in);
		Procedure procedure1 = new Procedure();
		
		System.out.print("Enter first procedure Name: ");
		String name1 = scanner1.nextLine();
		procedure1.setProcedureName(name1);
		
		System.out.print("Enter first procedure Date: ");
		String date1 = scanner1.nextLine();
		procedure1.setProcedureDate(date1);
		
		System.out.print("Enter first procedure Practitioner name: ");
		String practitioner1 = scanner1.nextLine();
		procedure1.setProcedurePractitioner(practitioner1);
		
		System.out.print("Enter first procedure Charge: ");
		double charge1 = scanner1.nextDouble();
		scanner1.nextLine();
		procedure1.setProcedureCharge(charge1);		
		
		/*
		 * Procedure 2
		 */
		Procedure procedure2 = new Procedure("General Check-up", "02/21/2026");
		
		System.out.print("Enter second procedure Practitioner name: ");
		String practitioner2 = scanner1.nextLine();
		procedure2.setProcedurePractitioner(practitioner2);
		
		System.out.print("Enter second procedure Charge: ");
		double charge2 = scanner1.nextDouble();
		scanner1.nextLine();
		procedure2.setProcedureCharge(charge2);
		
		/*
		 * Procedure 3
		 */
		Procedure procedure3 = new Procedure("MRI", "02/21/2026", "Dr. Absol", 1000.00);
		
		displayPatient(patient);
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		
		System.out.printf("\nTotal charges for the three procedures: $%.2f", calculateTotalCharges(procedure1, procedure2, procedure3));

		
		System.out.println("\nThe program was developed by a Student: Alejandro Palacio <02/15/26>");
	}
	
	
	
	public static void displayPatient(Patient patient) {
		
		System.out.println(patient.toString());
	}
	public static void displayProcedure(Procedure procedure) {

		System.out.println(procedure.toString());
	}
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		
		double total;
		
		total = procedure1.getProcedureCharge() + procedure2.getProcedureCharge() + procedure3.getProcedureCharge();
		
		return total;
	}
}








