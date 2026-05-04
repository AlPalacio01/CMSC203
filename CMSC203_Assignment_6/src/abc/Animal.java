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


public interface Animal {
    void makeSound();
    void move();

    // Getters for search display
    String getName();
    int getAge();
    String getSpecies();
    String getColor();
    String getImagePath();
}
