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

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HorseJUnitTest {

    private Horse horse;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        horse = new Horse("Spirit", 4, "Mustang", "Brown", "images/horse.png");
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
        outputStream.reset();
    }

    // ===== GETTER TESTS =====
    @Test
    public void testGetName() {
        assertEquals("Spirit", horse.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(4, horse.getAge());
    }

    @Test
    public void testGetSpecies() {
        assertEquals("Mustang", horse.getSpecies());
    }

    @Test
    public void testGetColor() {
        assertEquals("Brown", horse.getColor());
    }

    @Test
    public void testGetImagePath() {
        assertEquals("images/horse.png", horse.getImagePath());
    }

    // ===== toString TEST =====
    @Test
    public void testToString() {
        String expected = "Horse [Name: Spirit, Age: 4, Species: Mustang, Color: Brown]";
        assertEquals(expected, horse.toString());
    }

    // ===== makeSound TEST =====
    @Test
    public void testMakeSound() {
        horse.makeSound();
        assertTrue(outputStream.toString().contains("Neigh!"));
    }

    // ===== move TEST =====
    @Test
    public void testMove() {
        horse.move();
        assertTrue(outputStream.toString().contains("Gallops."));
    }
}
