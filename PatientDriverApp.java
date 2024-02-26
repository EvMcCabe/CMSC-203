/*
 * Class: CMSC203 
 * Instructor: khandan Monshi
 * Description: (Creates a patient object and its methods)
 * Due: 02/26/24
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Evan McCabe
*/

public class PatientDriverApp {


	/**
	 * Display patient info and then procedure info for said patient.
	 * Then display total charge of all procedures.
	 * finally display student name, MC#, and Due date.
	 * @param args the basic string array of arguments
	 */
	public static void main(String[] args) 
	{
		Patient jen = new Patient("Jenny", "Elaine", "Santori", 
				"123 Main Street", "MyTown", "CA", 01234,
				"240-751-7772", "Bill Santori", "777-555-1212");
		//display patient information
		displayPatient(jen);
		
		
		//procedures..
		Procedure p1 = new Procedure();
		
		Procedure p2 = new Procedure("X-ray", "7/20/2019");
		
		Procedure p3 = new Procedure("Blood Test", "7/20/2019", "Dr. Smith", 1400.75);
		
		
		System.out.println(); //print new line
		
		//display procedure - 1:
		p1.setPName("Physical Exam");
		p1.setPDate("7/20/2019");
		p1.setPractitioner("Dr. Irvine");
		p1.setCharges(3250.0);
		displayProcedure(p1);
		
		System.out.println(); //print new line
		
		//display procedure - 2:
		p2.setPractitioner("Dr. Jameson");
		p2.setCharges(5500.43);
		displayProcedure(p2);
		
		System.out.println(); //print new line
		
		//display procedure - 3:
		displayProcedure(p3);
		
		System.out.println(); //print new line
		
		//display total charge:
		double total = calculateTotalCharges(p1, p2, p3);
		System.out.print("Total Charges: " + "$" + total);
		
		System.out.println("\n"); //print new line
		
		//Display student name 
		System.out.println("Student name: Evan McCabe");
		System.out.println("MC#: MCM21177691");
		System.out.println("Due Date: 02/26/2024");
		
		
		
	}
	
	/**
	 * Prints the patients information in proper format
	 * @param zero A representation of the patient object
	 */
	public static void displayPatient(Patient zero)
	{
		System.out.print(zero.toString());
	}
	
	/**
	 * Prints the procedure information in proper format
	 * @param p0 A procedure object that is a representation of the three different procedures
	 */
	public static void displayProcedure(Procedure p0)
	{
		System.out.print(p0.toString());
	}
	
	/**
	 * Returns total charge of all procedures
	 * @return the totalCharge 
	 */
	public static double calculateTotalCharges(Procedure charge1, Procedure charge2, Procedure charge3)
	{
		
		double totalCharge = charge1.getCharges() + charge2.getCharges() + charge3.getCharges();
		return totalCharge;
	}

}
