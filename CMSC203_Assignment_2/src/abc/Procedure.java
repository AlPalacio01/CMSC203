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

public class Procedure {

	
	String procedureName;
	String procedureDate;
	String procedurePractitioner;
	double procedureCharge;
	
	/*
	 * 
	 * 
	 */
	public Procedure(){
		
		this.procedureName = "";
		this.procedureDate = "";
		this.procedurePractitioner = "";
		this.procedureCharge = 0.0;
	}
	
	/*
	 * 
	 * 
	 */
	public Procedure(String procedureName, String procedureDate){
		
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.procedurePractitioner = "";
		this.procedureCharge = 0.0;
	}
	
	/*
	 * 
	 * 
	 */
	public Procedure(String procedureName, String procedureDate, String procedurePractitioner, double procedureCharge){
		
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.procedurePractitioner = procedurePractitioner;
		this.procedureCharge = procedureCharge;
	}
	
	
	/*
	 * 
	 * 
	 */
	public String getProcedureName(){
		
		return procedureName;
	}
	public void setProcedureName(String procedureName){
		
		this.procedureName = procedureName;
	}
	
	/*
	 * 
	 * 
	 */
	public String getProcedureDate(){
		
		return procedureDate;
	}
	public void setProcedureDate(String procedureDate){
		
		this.procedureDate = procedureDate;
	}
	
	/*
	 * 
	 * 
	 */
	public String getProcedurePracitioner(){
		
		return procedurePractitioner;
	}
	public void setProcedurePractitioner(String procedurePractitioner){
		
		this.procedurePractitioner = procedurePractitioner;
	}
	
	/*
	 * 
	 * 
	 */
	public double getProcedureCharge(){
		
		return procedureCharge;
	}
	public void setProcedureCharge(double procedureCharge){
		
		this.procedureCharge = procedureCharge;
	}
	
	/*
	 * 
	 * 
	 */
	@Override
	public String toString() {
		
		return "\nProcedure Information:\n\tProcedure: " + getProcedureName() + "\n\tDate: " + getProcedureDate()  + 
				"\n\tPractitioner: " + getProcedurePracitioner()  + String.format("\n\tCharge: $%.2f", getProcedureCharge());
	}
	
	
}















