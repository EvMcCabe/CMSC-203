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

public class Procedure 
{
	private String pName; // name of procedure
	private String pDate; // date of procedure
	private String practitioner; // name of practitioner
	private double charges;

	public Procedure() 
	{
		pName = "";
		pDate = "";
		practitioner = "";
		charges = 0;
	}

	public Procedure(String pName, String pDate) 
	{
		this.pName = pName;
		this.pDate = pDate;
	}

	public Procedure(String pName, String pDate, String practitioner, double charges) 
	{
		this.pName = pName;
		this.pDate = pDate;
		this.practitioner = practitioner;
		this.charges = charges;
	}

	/**
	 * Gets the name of the procedure.
	 *
	 * @return The name of the procedure.
	 */
	public String getPName() 
	{
		return pName;
	}

	/**
	 * Gets the date of the procedure.
	 *
	 * @return The date of the procedure.
	 */
	public String getPDate() 
	{
		return pDate;
	}

	/**
	 * Gets the name of the practitioner.
	 *
	 * @return The name of the practitioner.
	 */
	public String getPractitioner() 
	{
		return practitioner;
	}

	/**
	 * Gets the charges for the procedure.
	 *
	 * @return The charges for the procedure.
	 */
	public double getCharges() 
	{
		return charges;
	}

	/**
	 * Sets the name of the procedure.
	 *
	 * @param pName The name of the procedure.
	 */
	public void setPName(String pName) 
	{
		this.pName = pName;
	}

	/**
	 * Sets the date of the procedure.
	 *
	 * @param pDate The date of the procedure.
	 */
	public void setPDate(String pDate) 
	{
		this.pDate = pDate;
	}

	/**
	 * Sets the name of the practitioner.
	 *
	 * @param practitioner The name of the practitioner.
	 */
	public void setPractitioner(String practitioner) 
	{
		this.practitioner = practitioner;
	}

	/**
	 * Sets the charges for the procedure.
	 *
	 * @param charges The charges for the procedure.
	 */
	public void setCharges(double charges) 
	{
		this.charges = charges;
	}

	/**
	 * Returns a string representation of the procedure's information.
	 *
	 * @return A formatted string containing various details of the procedure.
	 */
	public String toString() 
	{
		return "\t\tProcedure Name: " + pName + "\n\t\t" + "Procedure Date: " + pDate + "\n\t\t"
				+ "Practitioner: " + practitioner + "\n\t\t" + "Charges: " + charges + "\n\t\t";
	}
}
