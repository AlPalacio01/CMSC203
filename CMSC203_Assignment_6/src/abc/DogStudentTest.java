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

class DogStudentTest {

	Dog dog1 = new Dog("Kiko", 7, "Beagle", "Brown", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Dog.jpg");
	Dog dog2 = new Dog("Aiko", 3, "Husky", "White", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Dog.jpg");
	
	@Test
	void testGetSetDog() {

		assertEquals("Kiko", dog1.getName());
		assertEquals(7, dog1.getAge());
		assertEquals("Beagle", dog1.getSpecies());
		assertEquals("Brown", dog1.getColor());
		assertEquals("C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Dog.jpg", dog1.getImagePath());
		
		assertEquals("Aiko", dog2.getName());
		assertEquals(3, dog2.getAge());
		assertEquals("Husky", dog2.getSpecies());
		assertEquals("White", dog2.getColor());
		assertEquals("C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Dog.jpg", dog2.getImagePath());
	
	}
	
	@Test
	void testToString() {
		
		
		assertTrue(dog1.toString().contains("Kiko"));
		assertTrue(dog1.toString().contains("7"));
		assertTrue(dog1.toString().contains("Beagle"));
		assertTrue(dog1.toString().contains("Brown"));
		
		assertTrue(dog2.toString().contains("Aiko"));
		assertTrue(dog2.toString().contains("3"));
		assertTrue(dog2.toString().contains("Husky"));
		assertTrue(dog2.toString().contains("White"));
	}
}











