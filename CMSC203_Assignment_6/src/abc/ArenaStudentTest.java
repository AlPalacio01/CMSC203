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

class ArenaStudentTest {

	Arena arena1 = new Arena("Blue", 20, 20, "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Arena.jpg");
	Arena arena2 = new Arena("Green", 80, 25, "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Arena.jpg");

	@Test
	void testGetSetArena() {
		
		
		assertEquals("Blue", arena1.getColor());
		assertEquals(20, arena1.getLength());
		assertEquals(20, arena1.getWidth());
		assertEquals("C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Arena.jpg", arena1.getImagePath());
	
		assertEquals("Green", arena2.getColor());
		assertEquals(80, arena2.getLength());
		assertEquals(25, arena2.getWidth());
		assertEquals("C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Arena.jpg", arena2.getImagePath());
	
		arena2.setColor("Red");
		
		assertEquals("Red", arena2.getColor());
		assertEquals(80, arena2.getLength());
		assertEquals(25, arena2.getWidth());
		assertEquals("C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Arena.jpg", arena2.getImagePath());
	
		
	}
	
	@Test
	void testToString() {
		
		assertTrue(arena1.toString().contains("Blue"));
		assertTrue(arena1.toString().contains("20"));
		
		assertTrue(arena2.toString().contains("Green"));
		assertTrue(arena2.toString().contains("80"));
		assertTrue(arena2.toString().contains("25"));
	}

}



