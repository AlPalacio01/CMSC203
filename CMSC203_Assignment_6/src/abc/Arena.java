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

public class Arena implements Building {
	//instance variables
    private String color;
    private double length;
    private double width;
    private String buildingType;
    private String imagePath;

    //constructor
    public Arena(String color, double length, double width, String imagePath) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.buildingType = "Arena";
        this.imagePath = imagePath;
    }

    @Override
    public void setSize(double length, double width) {
    	this.length = length;
    	this.width = width;
    }


    @Override
    public String getImagePath() { return imagePath; }
    
    @Override
    public String toString() {
        return String.format("\nBuilding Type: %s \nColor: %s \nSize: %.1f x %.1f\n", buildingType, color, length, width);      
    }

	@Override
	public double getLength() {
		
		return length;
	}

	@Override
	public double getWidth() {
		
		return width;
	}

	@Override
	public void setColor(String color) {
		
		this.color = color;
	}

	@Override
	public String getColor() {
		
		return color;
	}

	@Override
	public void setBuildingType(String type) {
		
		this.buildingType = type;
	}

	@Override
	public String getBuildingType() {
		
		return buildingType;
	}   
}


















