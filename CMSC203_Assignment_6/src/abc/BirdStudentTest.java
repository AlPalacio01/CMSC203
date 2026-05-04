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

class BirdStudentTest {

	Bird bird1 = new Bird("Mikey", 3, "Pigeon", "Gray", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Bird.jpg");
	Bird bird2 = new Bird("Trikey", 4, "Chicken", "Brown", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Bird.jpg");
	
	@Test
	void testGetSetBird() {

		assertEquals("Mikey", bird1.getName());
		assertEquals(3, bird1.getAge());
		assertEquals("Pigeon", bird1.getSpecies());
		assertEquals("Gray", bird1.getColor());
		assertEquals("C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Bird.jpg", bird1.getImagePath());
		
		assertEquals("Trikey", bird2.getName());
		assertEquals(4, bird2.getAge());
		assertEquals("Chicken", bird2.getSpecies());
		assertEquals("Brown", bird2.getColor());
		assertEquals("C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Bird.jpg", bird2.getImagePath());
	
	}
	
	@Test
	void testToString() {
		
		
		assertTrue(bird1.toString().contains("Mikey"));
		assertTrue(bird1.toString().contains("3"));
		assertTrue(bird1.toString().contains("Pigeon"));
		assertTrue(bird1.toString().contains("Gray"));
		
		assertTrue(bird2.toString().contains("Trikey"));
		assertTrue(bird2.toString().contains("4"));
		assertTrue(bird2.toString().contains("Chicken"));
		assertTrue(bird2.toString().contains("Brown"));
	}

}












