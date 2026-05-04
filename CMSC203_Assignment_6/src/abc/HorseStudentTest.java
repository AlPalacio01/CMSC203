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

class HorseStudentTest {

	Horse horse1 = new Horse("Speedy", 12, "Mustang", "Brown", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Horse.jpg");
	Horse horse2 = new Horse("Slowey", 6, "Shire", "White", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Horse.jpg");
	
	@Test
	void testGetSetHorse() {

		assertEquals("Speedy", horse1.getName());
		assertEquals(12, horse1.getAge());
		assertEquals("Mustang", horse1.getSpecies());
		assertEquals("Brown", horse1.getColor());
		assertEquals("C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Horse.jpg", horse1.getImagePath());
		
		assertEquals("Slowey", horse2.getName());
		assertEquals(6, horse2.getAge());
		assertEquals("Shire", horse2.getSpecies());
		assertEquals("White", horse2.getColor());
		assertEquals("C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Horse.jpg", horse2.getImagePath());
	
	}
	
	@Test
	void testToString() {
		
		
		assertTrue(horse1.toString().contains("Speedy"));
		assertTrue(horse1.toString().contains("12"));
		assertTrue(horse1.toString().contains("Mustang"));
		assertTrue(horse1.toString().contains("Brown"));
		
		assertTrue(horse2.toString().contains("Slowey"));
		assertTrue(horse2.toString().contains("6"));
		assertTrue(horse2.toString().contains("Shire"));
		assertTrue(horse2.toString().contains("White"));
	}
}


















