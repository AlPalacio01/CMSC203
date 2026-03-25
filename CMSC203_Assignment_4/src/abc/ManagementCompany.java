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

public class ManagementCompany {

	
	public static final int MAX_PROPERTIES = 3;
	private String name;
	private String taxID;
	private Property[] properties;
	private int propertyCount;
	

	
	public ManagementCompany(String name, String taxID) {
		
		this.name = name;
		this.taxID = taxID;
		this.properties = new Property[MAX_PROPERTIES];
		this.propertyCount = 0;
	}
	
	public ManagementCompany(ManagementCompany newProperty) {
		
		this.name = newProperty.name;
		this.taxID = newProperty.taxID;
		this.propertyCount = newProperty.propertyCount;
		this.properties = new Property[MAX_PROPERTIES];
		
		
		for (int i = 0; i < newProperty.propertyCount; i++) {
			
			
			this.properties[i] = new Property(newProperty.properties[i]);
		}
		
	}
	
	
	public int addProperty(Property p) {
		
		if (propertyCount == properties.length) {
			return -1;
		}
		
		properties[propertyCount] = new Property(p);
		propertyCount++;
		
		return propertyCount - 1;
	}
	
	public double totalRent() {
		
		double count = 0.0;
		for (int i = 0; i < propertyCount; i++) {
			
			
			count += properties[i].getRentAmount();
		}
		
		return count;
	}
	
	public int getPropertyCount() {
		
		return propertyCount;
	}
	
	public String toString() {
		String finalString = "Management Company: " + name + " (Tax ID: " + taxID + ")\nProperties:\n";
		
		for (int i = 0; i < propertyCount; i++) {
			
			finalString += properties[i].toString() + "\n";
		}
		
		finalString += "Total rent: $" + String.format("%.2f", totalRent());
		
		return finalString;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getTaxId() {
		// TODO Auto-generated method stub
		return taxID;
	}

	public Property getProperty(int i) {
		// TODO Auto-generated method stub
		return properties[i];
	}
	
	
	
	
	
}











































