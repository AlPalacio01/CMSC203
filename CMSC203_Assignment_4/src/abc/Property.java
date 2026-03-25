/*
 * Class: CMSC203 32324
 * Instructor: Grigoriy Grinberg
 * Description: In this assignment, we will have to design and implement a Property Management 
 * application that handles multiple properties with various parameters. The array of Property 
 * objects will be handled inside a Property Management object.
 * Due: 03/30/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Alejandro Palacio
*/

package abc;

public class Property {

	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	
	
	public Property() {
		
		this.propertyName = "Default";
		this.city = "Rockville";
		this.rentAmount = 2000.00;
		this.owner = "Default";
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}
	
	public Property(Property property) {
		
		this.propertyName = property.getPropertyName();
		this.city = property.getCity();
		this.rentAmount = property.getRentAmount();
		this.owner = property.getOwner();
	}
	
	
	public String getPropertyName(){
		
		return propertyName;
	}
	public void setPropertyName(String propertyName){
		
		this.propertyName = propertyName;
	}
	
	
	public String getCity(){
		
		return city;
	}
	public void setCity(String city){
		
		this.city = city;
	}
	
	
	public double getRentAmount(){
		
		return rentAmount;
	}
	public void setRentAmount(double rentAmount){
		
		this.rentAmount = rentAmount;
	}
	
	
	public String getOwner(){
		
		return owner;
	}
	public void setOwner(String owner){
		
		this.owner = owner;
	}
	
	public String toString() {
		return propertyName + ", " + city + ", Rent: $" + String.format("%.2f", rentAmount) + ", Owner: " + owner + ".";
	}
	
	
}




























