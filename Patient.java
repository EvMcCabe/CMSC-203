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

public class Patient 
{
	private String fName;
	private String mName;
	private String lName;
	private String streetAddress;
	private String city;
	private String state;
	private int zipcode;
	private String phoneNum;
	private String emergencyName;
	private String emergencyPhoneNum;

	public Patient() 
	{
		fName = "";
		mName = "";
		lName = "";
		streetAddress = "";
		city = "";
		state = "";
		zipcode = 0;
		phoneNum = "";
		emergencyName = "";
		emergencyPhoneNum = "";
	}

	public Patient(String fName, String mName, String lName) 
	{
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
	}

	public Patient(String fName, String mName, String lName, String streetAddress, String city, String state,
			int zipcode, String phoneNum, String emergencyName, String emergencyPhoneNum) {
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phoneNum = phoneNum;
		this.emergencyName = emergencyName;
		this.emergencyPhoneNum = emergencyPhoneNum;
	}

	/**
	 * Gets the first name of the patient.
	 *
	 * @return The first name of the patient.
	 */
	public String getFName() 
	{
		return fName;
	}

	/**
	 * Gets the middle name of the patient.
	 *
	 * @return The middle name of the patient.
	 */
	public String getMName() 
	{
		return mName;
	}

	/**
	 * Gets the last name of the patient.
	 *
	 * @return The last name of the patient.
	 */
	public String getLName() 
	{
		return lName;
	}

	/**
	 * Gets the street address of the patient.
	 *
	 * @return The street address of the patient.
	 */
	public String getStreetAddress() 
	{
		return streetAddress;
	}

	/**
	 * Gets the city of the patient's address.
	 *
	 * @return The city of the patient's address.
	 */
	public String getCity() 
	{
		return city;
	}

	/**
	 * Gets the state of the patient's address.
	 *
	 * @return The state of the patient's address.
	 */
	public String getState() 
	{
		return state;
	}

	/**
	 * Gets the ZIP code of the patient's address.
	 *
	 * @return The ZIP code of the patient's address.
	 */
	public int getZipcode() 
	{
		return zipcode;
	}

	/**
	 * Gets the phone number of the patient.
	 *
	 * @return The phone number of the patient.
	 */
	public String getPhoneNum() 
	{
		return phoneNum;
	}

	/**
	 * Gets the name of the patient's emergency contact.
	 *
	 * @return The name of the patient's emergency contact.
	 */
	public String getEmergencyName() 
	{
		return emergencyName;
	}

	/**
	 * Gets the phone number of the patient's emergency contact.
	 *
	 * @return The phone number of the patient's emergency contact.
	 */
	public String getEmergencyPhoneNum() 
	{
		return emergencyPhoneNum;
	}

	/**
	 * Sets the first name of the patient.
	 *
	 * @param fName The first name of the patient.
	 */
	public void setFName(String fName) 
	{
		this.fName = fName;
	}

	/**
	 * Sets the middle name of the patient.
	 *
	 * @param mName The middle name of the patient.
	 */
	public void setMName(String mName) 
	{
		this.mName = mName;
	}

	/**
	 * Sets the last name of the patient.
	 *
	 * @param lName The last name of the patient.
	 */
	public void setLName(String lName) 
	{
		this.lName = lName;
	}

	/**
	 * Sets the street address of the patient.
	 *
	 * @param streetAddress The street address of the patient.
	 */
	public void setStreetAddress(String streetAddress) 
	{
		this.streetAddress = streetAddress;
	}

	/**
	 * Sets the city of the patient's address.
	 *
	 * @param city The city of the patient's address.
	 */
	public void setCity(String city) 
	{
		this.city = city;
	}

	/**
	 * Sets the state of the patient's address.
	 *
	 * @param state The state of the patient's address.
	 */
	public void setState(String state) 
	{
		this.state = state;
	}

	/**
	 * Sets the ZIP code of the patient's address.
	 *
	 * @param zipcode The ZIP code of the patient's address.
	 */
	public void setZipcode(int zipcode) 
	{
		this.zipcode = zipcode;
	}

	/**
	 * Sets the phone number of the patient.
	 *
	 * @param phoneNum The phone number of the patient.
	 */
	public void setPhoneNum(String phoneNum) 
	{
		this.phoneNum = phoneNum;
	}

	/**
	 * Sets the name of the patient's emergency contact.
	 *
	 * @param emergencyName The name of the patient's emergency contact.
	 */
	public void setEmergencyName(String emergencyName) 
	{
		this.emergencyName = emergencyName;
	}

	/**
	 * Sets the phone number of the patient's emergency contact.
	 *
	 * @param emergencyPhoneNum The phone number of the patient's emergency contact.
	 */
	public void setEmergencyPhoneNum(String emergencyPhoneNum) 
	{
		this.emergencyPhoneNum = emergencyPhoneNum;
	}

	/**
	 * Builds and returns the full name of the patient by concatenating the first,
	 * middle, and last name.
	 *
	 * @return The full name of the patient.
	 */
	public String buildFullName() 
	{
		return fName + " " + mName + " " + lName;
	}

	/**
	 * Builds and returns the full address of the patient by concatenating the
	 * address, city, state, and ZIP code.
	 *
	 * @return The full address of the patient.
	 */
	public String buildAddress() 
	{
		return streetAddress + " " + city + " " + state + " " + zipcode;
	}

	/**
	 * Builds and returns the emergency contact information of the patient by
	 * concatenating the emergency contact name and phone number.
	 *
	 * @return The emergency contact information of the patient.
	 */
	public String buildEmergencyContact() 
	{
		return emergencyName + " " + emergencyPhoneNum;
	}

	/**
	 * Returns a string representation of the patient's information.
	 *
	 * @return A formatted string containing various details of the patient.
	 */
	public String toString() 
	{
		return "Patient Information:\n\t" + "Full Name: " + buildFullName() + "\n\t" + "Address: " + buildAddress() + "\n\t"
				+ "Phone Number: " + phoneNum + "\n\t" + "Emergency Contact: " + buildEmergencyContact() + "\n\t";
	}

}
