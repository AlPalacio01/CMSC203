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

class CircusStudentTest {
	
	private Circus circus;

	@BeforeEach
	void setUp() {
		
		circus = new Circus();
		
		circus.addAnimal(new Dog("Kiko", 7, "Beagle", "Brown", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Dog.jpg"));
		circus.addAnimal(new Bird("Paul", 2, "Chicken", "White", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Dog.jpg"));
		circus.addAnimal(new Horse("Marc", 6, "Mustang", "Black", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Dog.jpg"));
		circus.addAnimal(new Lion("King", 8, "Congo", "Gold", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Dog.jpg"));

	}
	
	@Test
	void testSearchNameTrue() {
		
		boolean animalFound = false;
		
		for (Animal animal: circus.getAnimals()) {
			if (animal.getName().equalsIgnoreCase("Kiko")) {
				animalFound = true;
				break;
			}
		}
		assertTrue(animalFound);
	}
	
	@Test
	void testSearchNameFalse() {
		
		boolean animalFound = false;
		
		for (Animal animal: circus.getAnimals()) {
			if (animal.getName().equalsIgnoreCase("Aiko")) {
				animalFound = true;
				break;
			}
		}
		assertFalse(animalFound);
	}
	
	@Test
	void testSortByAge() {
		
		circus.sortAnimalsByAge();
		
		assertEquals(2, circus.getAnimals().get(0).getAge());
		assertEquals(6, circus.getAnimals().get(1).getAge());
		assertEquals(7, circus.getAnimals().get(2).getAge());
		assertEquals(8, circus.getAnimals().get(3).getAge());
	}
	
	@Test
	void testSortByname() {
		
		circus.sortAnimalsByName();
		
		assertEquals("Kiko", circus.getAnimals().get(0).getName());
		assertEquals("King", circus.getAnimals().get(1).getName());
		assertEquals("Marc", circus.getAnimals().get(2).getName());
		assertEquals("Paul", circus.getAnimals().get(3).getName());
	}
	
	@Test
	void testAddPerson() {
		
		circus.addPerson(new Clerk("Alex", 25, 2, "Acrobat", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\acrobat.jpg"));
		circus.addPerson(new Acrobatic("Johnathan", 37, 12, "Animal Trainer", "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Animal trainer.jpg"));
		
		assertEquals(2, circus.getPersons().size());
	}
	
	@Test
	void testAddBuilding() {
		circus.addBuilding(new Arena("Blue", 20, 20, "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\Arena.jpg"));
		circus.addBuilding(new TicketingOffice("Green", 80, 25, "C:\\Users\\restl\\Downloads\\Spring2026\\CMSC203\\6\\Assignment6_BobsCircus_st_updated_042426\\images\\TicketingOffice.jpg"));
		
		assertEquals(2, circus.getBuildings().size());
	}

}


























