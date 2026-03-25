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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyJUnitStudentTest {


	@Test
	void testParameterizedConstructor() {
		
		ManagementCompany managementCompanyOne = new ManagementCompany("Hello World Inc.", "101101001");
		
		assertEquals("Hello World Inc.", managementCompanyOne.getName());
		assertEquals("101101001", managementCompanyOne.getTaxId());
		
	}
	
	@Test
	void testCopyConstructor() {
		
		ManagementCompany managementCompanyTwo = new ManagementCompany("Hello World Inc.", "101101001");
		managementCompanyTwo.addProperty(new Property("McDonalds", "Rockville", 1200.50, "Mrs. Celebi"));
		ManagementCompany managementCompanyThree = new ManagementCompany(managementCompanyTwo);
		
		assertEquals(managementCompanyTwo.getName(), managementCompanyThree.getName());
		assertEquals(managementCompanyTwo.getTaxId(), managementCompanyThree.getTaxId());
		assertEquals(managementCompanyTwo.getPropertyCount(), managementCompanyThree.getPropertyCount());
		assertEquals(managementCompanyTwo.getProperty(0).getPropertyName(), managementCompanyThree.getProperty(0).getPropertyName());
		
	}
	
	@Test
	void testAddProperty() {
		
		ManagementCompany managementCompanyFour = new ManagementCompany("Hello World Inc.", "101101001");
		Property property = new Property("McDonalds", "Rockville", 1200.50, "Mrs. Celebi");
		
		int propertyIndex = managementCompanyFour.addProperty(property);
		
		assertEquals(0, propertyIndex);
		assertEquals(1, managementCompanyFour.getPropertyCount());
		assertEquals("McDonalds", managementCompanyFour.getProperty(0).getPropertyName());
		
	}
	
	@Test
	void testTotalRent() {
		
		ManagementCompany managementCompanyFive = new ManagementCompany("Hello World Inc.", "101101001");
		managementCompanyFive.addProperty(new Property("McDonalds", "Rockville", 1200.50, "Mrs. Celebi"));
		managementCompanyFive.addProperty(new Property("BurgerKing", "Rockville", 1400.50, "Mrs. Celebi"));
		
		assertEquals(2601.00, managementCompanyFive.totalRent());
		
	}
	
	@Test
	void testToString() {
		ManagementCompany managementCompanySix = new ManagementCompany("Hello World Inc.", "101101001");
		managementCompanySix.addProperty(new Property("McDonalds", "Rockville", 1200.50, "Mrs. Celebi"));
		
		String string = managementCompanySix.toString();
		
		assertTrue(string.contains("Hello World Inc."));
		assertTrue(string.contains("101101001"));
		assertTrue(string.contains("McDonalds"));
		assertTrue(string.contains("Rockville"));
		assertTrue(string.contains("1200.50"));
		assertTrue(string.contains("Mrs. Celebi"));
		
	}


}











