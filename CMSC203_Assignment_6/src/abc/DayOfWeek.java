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

//Each day has a specific discount rate associated with it.
//Weekdays have 10% discount, weekends have no discount
public enum DayOfWeek {
    MONDAY(0.10), 
    TUESDAY(0.10), 
    WEDNESDAY(0.10), 
    THURSDAY(0.10), 
    FRIDAY(0.10), 
    SATURDAY(0.0), 
    SUNDAY(0.0);

    private final double discount; // instance variable

    //Constructor for the DayOfWeek enum
    DayOfWeek(double discount) {
        this.discount = discount;
    }

    //Public method provides access to the discount value associated with a specific enum constant.
    public double getDiscount() {
        return discount;
    }
}

