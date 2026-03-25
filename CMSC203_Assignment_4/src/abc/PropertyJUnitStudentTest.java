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

class PropertyJUnitStudentTest {

	

	@Test
	public void testDefaultConstructor() {
		
		Property propertyOne = new Property();
		
		assertEquals("Default", propertyOne.getPropertyName());
		assertEquals("Rockville", propertyOne.getCity());
		assertEquals(2000.00, propertyOne.getRentAmount());
		assertEquals("Default", propertyOne.getOwner());
	}
	
	@Test
	public void testParameterizedConstructor() {
		
		Property propertyTwo = new Property("McDonalds", "Rockville", 1200.50, "Mrs. Celebi");
		
		assertEquals("McDonalds", propertyTwo.getPropertyName());
		assertEquals("Rockville", propertyTwo.getCity());
		assertEquals(1200.50, propertyTwo.getRentAmount());
		assertEquals("Mrs. Celebi", propertyTwo.getOwner());
	}
	
	@Test
	public void testCopyConstructor() {
		
		Property propertyThree = new Property("McDonalds", "Rockville", 1200.50, "Mrs. Celebi");
		Property propertyFour = new Property(propertyThree);
		
		assertEquals("McDonalds", propertyFour.getPropertyName());
		assertEquals("Rockville", propertyFour.getCity());
		assertEquals(1200.50, propertyFour.getRentAmount());
		assertEquals("Mrs. Celebi", propertyFour.getOwner());
	}
	
	@Test
	public void testSetGet() {
		
		Property propertyFive = new Property();
		
		propertyFive.setPropertyName("McDonalds");
		propertyFive.setCity("Rockville");
		propertyFive.setRentAmount(1200.50);
		propertyFive.setOwner("Mrs. Celebi");
		
		assertEquals("McDonalds", propertyFive.getPropertyName());
		assertEquals("Rockville", propertyFive.getCity());
		assertEquals(1200.50, propertyFive.getRentAmount());
		assertEquals("Mrs. Celebi", propertyFive.getOwner());
		
	}

	
	@Test
	public void testToString() {
		Property propertySix = new Property("McDonalds", "Rockville", 1200.50, "Mrs. Celebi");
		
		assertEquals(propertySix.toString(), "McDonalds, Rockville, Rent: $1200.50, Owner: Mrs. Celebi.");
	}


}
















