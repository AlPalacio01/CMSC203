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

class AcrobaticStudentTest {

	Acrobatic acrobatic1 = new Acrobatic("Alex", 25, 2, "Acrobat", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\acrobat.jpg");
	Acrobatic acrobatic2 = new Acrobatic("Johnathan", 37, 12, "Animal Trainer", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Animal trainer.jpg");

	@Test
	void testGetSetAcrobatic() {
		
		assertEquals("Alex", acrobatic1.getName());
		assertEquals(25 , acrobatic1.getAge());
		assertEquals(2 , acrobatic1.getYearsWorked());
		assertEquals("Acrobat", acrobatic1.getJob());
		assertEquals("C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\acrobat.jpg", acrobatic1.getImagePath());
		
		assertEquals("Johnathan", acrobatic2.getName());
		assertEquals(37, acrobatic2.getAge());
		assertEquals(12, acrobatic2.getYearsWorked());
		assertEquals("Animal Trainer", acrobatic2.getJob());
		assertEquals("C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Animal trainer.jpg", acrobatic2.getImagePath());
	}
	
	@Test
	void testToString() {
		
		
		assertTrue(acrobatic1.toString().contains("Alex"));
		assertTrue(acrobatic1.toString().contains("25"));
		assertTrue(acrobatic1.toString().contains("2"));
		assertTrue(acrobatic1.toString().contains("Acrobat"));
		
		assertTrue(acrobatic2.toString().contains("Johnathan"));
		assertTrue(acrobatic2.toString().contains("37"));
		assertTrue(acrobatic2.toString().contains("12"));
		assertTrue(acrobatic2.toString().contains("Animal Trainer"));
	}

}
















