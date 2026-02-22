/*
 * Class: CMSC203 32324
 * Instructor: Grigoriy Grinberg
 * Description: Build a Patient class, Procedure class, and PatientDriverApp class. The Patient 
 * class takes the patient’s information and details. The Procedure class represents the medical 
 * procedure that has been performed on a patient. The PatientDriverApp class creates an instance 
 * of the Patient class and initializes it with information. It also creates three instances of 
 * the Procedure class each using the different constructors.
 * Due: 02/23/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Alejandro Palacio
*/
package abc;

public class Patient {

	
	String firstName;
	String lastName;
	String middleName;
	String streetAddress;
	String city;
	String state;
	String zipCode;
	String phoneNumber;
	String ecName;
	String ecNumber;

	/*
	 * 
	 * 
	 */
	public Patient(){
		
		firstName = "";
		lastName = "";
		middleName = "";
		streetAddress = "";
		city = "";
		state = "";
		zipCode = "";
		phoneNumber = "";
		ecName = "";
		ecNumber = "";
	}

	/*
	 * 
	 * 
	 */
	public Patient(String firstName, String lastName, String middleName){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		streetAddress = "";
		city = "";
		state = "";
		zipCode = "";
		phoneNumber = "";
		ecName = "";
		ecNumber = "";
	}

	/*
	 * 
	 * 
	 */
	public Patient(String firstName, String lastName, String middleName, String streetAddress, String city, 
			String state, String zipCode, String phoneNumber, String ecName, String ecNumber){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.ecName = ecName;
		this.ecNumber = ecNumber;
	}
	
	/*
	 * 
	 * 
	 */
	public String getFirstName(){
		
		return firstName;
	}
	public void setFirstName(String firstname){
		
		this.firstName = firstname;
	}
	
	/*
	 * 
	 * 
	 */
	public String getLastName(){
		
		return lastName;
	}
	public void setLastName(String lastName){
		
		this.lastName = lastName;
	}
	
	/*
	 * 
	 * 
	 */
	public String getMiddleName(){
		
		return middleName;
	}
	public void setMiddleName(String middleName){
		
		this.middleName = middleName;
	}

	/*
	 * 
	 * 
	 */
	public String getStreetAddress(){
		
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress){
		
		this.streetAddress = streetAddress;
	}
	
	/*
	 * 
	 * 
	 */
	public String getCity(){
		
		return city;
	}
	public void setCity(String city){
		
		this.city = city;
	}

	/*
	 * 
	 * 
	 */
	public String getState(){
		
		return state;
	}
	public void setState(String state){
		
		this.state = state;
	}

	/*
	 * 
	 * 
	 */
	public String getZipCode(){
		
		return zipCode;
	}
	public void setZipCode(String zipCode){
		
		this.zipCode = zipCode;
	}

	/*
	 * 
	 * 
	 */
	public String getPhoneNumber(){
		
		return phoneNumber;
	}
	public void SetPhoneNumber(String phoneNumber){
		
		this.phoneNumber = phoneNumber;
	}

	/*
	 * 
	 * 
	 */
	public String getECName(){
		
		return ecName;
	}
	public void setECName(String ecName){
		
		this.ecName = ecName;
	}

	/*
	 * 
	 * 
	 */
	public String getECNumber(){
		
		return ecNumber;
	}
	public void SetECNumber(String ecNumber){
		
		this.ecNumber = ecNumber;
	}

	/*
	 * 
	 * 
	 */
	public String buildFullName() {
		
		return getFirstName() + " " + getMiddleName() + " " + getLastName();
	}

	/*
	 * 
	 * 
	 */
	public String buildAddress() {
		
		return getStreetAddress() + " " + getCity() + " " + getState() + " " + getZipCode();
	}

	/*
	 * 
	 * 
	 */
	public String buildEmergencyContact() {
		
		return getECName() + " " + getECNumber();
	}

	/*
	 * 
	 * 
	 */
	@Override
	public String toString() {
		
		return "\nPatient info:\n\tName: " + buildFullName() + "\n\tAddress: " + buildAddress()  + 
				"\n\tEmergency Contact: " + buildEmergencyContact();
	}
	
	
}
































