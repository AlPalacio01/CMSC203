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



public abstract class Person {
    private String name;
    private int age;
    private int yearsWorked;
    private String job;
    private String imagePath; 

    public Person(String name, int age, int yearsWorked, String job, String imagePath) {
        this.name = name;
        this.age = age;
        this.yearsWorked = yearsWorked;
        this.job = job;
        this.imagePath = imagePath;  // NEW
    }

    //Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getYearsWorked() { return yearsWorked; }
    public String getJob() { return job; }
    public String getImagePath() { return imagePath; }  

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Job: " + job + ", Years Worked: " + yearsWorked;
    }
}
