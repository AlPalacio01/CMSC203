/*
 * Class: CMSC203 32324
 * Instructor: Grigoriy Grinberg
 * Description: In this assignment, we will have to design and implement a Property Management 
 * application that handles multiple properties with various parameters. The array of Property 
 * objects will be handled inside a Property Management object.
 * Due: 03/30/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Alejandro Palacio
*/

package abc;

public class PropertyDriver {

	public static void main(String[] args) {
		
		ManagementCompany managementCompany = new ManagementCompany("AP Inc.", "01292-001");
		
		Property propertyOne = new Property("McDonalds", "Rockville", 1200.50, "Mrs. Celebi");
		Property propertyTwo = new Property(propertyOne);
		Property propertyThree = new Property();
		
		managementCompany.addProperty(propertyOne);
		managementCompany.addProperty(propertyTwo);
		managementCompany.addProperty(propertyThree);
		
		System.out.println("Original: ");
		System.out.println(managementCompany.toString());
		
		ManagementCompany managementCompanyCopy = new ManagementCompany(managementCompany);
		
		System.out.println("\nCopy: ");
		System.out.println(managementCompanyCopy.toString());
		

	}
}




































