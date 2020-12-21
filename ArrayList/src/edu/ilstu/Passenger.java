/*
* File name: Passenger.java
*
* Programmer: Ryan Skare
* ULID: rskare
*
* Date: Sep 15, 2020
*
* Class: IT 178
* Lecture Section: 02
* Lecture Instructor: Tonya Pierce
*/
package edu.ilstu;

/**
 * <info regarding passengers is stores here>
 *
 * @author Ryan Skare
 *
 */
public class Passenger {
	private String passengerName;
	private String cruiseName;
	private String roomType;
	
	public Passenger () {}
	
	public Passenger (String passengerName, String cruiseName, String roomType)
	{
		this.passengerName = passengerName;
		this.cruiseName = cruiseName;
		this.roomType = roomType;
	}

	public String getPassName() {
		return passengerName;
	}

	public void setPassName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getCruiseName() {
		return cruiseName;
	}

	public void setCruiseName(String cruiseName) {
		this.cruiseName = cruiseName;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public String printPassenger ()
	{
		return passengerName + ", " + cruiseName + ", " + roomType;
	}
	
	public String toString ()
	{
		return passengerName;
	}
}
