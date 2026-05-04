/*
 * Class: CMSC203 32324
 * Instructor: Grigoriy Grinberg
 * Description: In this assignment, we will have to design and implement numerous subclasses and superclasses. 
 * For example, Clerk and Acrobatic are subclasses of the Person Class, TicketingOffice and Arena are subclasses 
 * of the Building Interface, and finally Dog, Horse, Bird, and Lion are subclasses of Animal amongst other classes. 
 * The entire program will have us display the attributes of Person, Animal and Building, as well as ticketing information.
 * Due: 05/04/2026
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

class LionStudentTest {

	Lion lion1 = new Lion("Simba", 2, "Barbary", "Gold", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Lion.jpg");
	Lion lion2 = new Lion("Nala", 16, "Panthera", "Gray", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Lion.jpg");
	
	@Test
	void testGetSetLion() {

		assertEquals("Simba", lion1.getName());
		assertEquals(2, lion1.getAge());
		assertEquals("Barbary", lion1.getSpecies());
		assertEquals("Gold", lion1.getColor());
		assertEquals("C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Lion.jpg", lion1.getImagePath());
		
		assertEquals("Nala", lion2.getName());
		assertEquals(16, lion2.getAge());
		assertEquals("Panthera", lion2.getSpecies());
		assertEquals("Gray", lion2.getColor());
		assertEquals("C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Lion.jpg", lion2.getImagePath());
	
	}
	
	@Test
	void testToString() {
		
		
		assertTrue(lion1.toString().contains("Simba"));
		assertTrue(lion1.toString().contains("2"));
		assertTrue(lion1.toString().contains("Barbary"));
		assertTrue(lion1.toString().contains("Gold"));
		
		assertTrue(lion2.toString().contains("Nala"));
		assertTrue(lion2.toString().contains("16"));
		assertTrue(lion2.toString().contains("Panthera"));
		assertTrue(lion2.toString().contains("Gray"));
	}

}











