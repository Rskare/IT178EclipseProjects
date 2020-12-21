/*
* File name: Cruise.java
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
 * <info regarding cruises is stores here>
 *
 * @author Ryan Skare
 *
 */
public class Cruise {
	private String cruiseName;
	private String shipName;
	private String departurePort;
	private String destination;
	private String returnPort;
	
	public Cruise () {}
	
	public Cruise (String cruiseName, String shipName, String departurePort, String destination, String returnPort) 
	{
		this.cruiseName = cruiseName;
		this.shipName = shipName;
		this.departurePort = departurePort;
		this.destination = destination;
		this.returnPort = returnPort;
	}

	public String getCruiseName() {
		return cruiseName;
	}

	public void setCruiseName(String cruiseName) {
		this.cruiseName = cruiseName;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName (String shipName) {
		this.shipName = shipName;
	}

	public String getDeparturePort() {
		return departurePort;
	}

	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getReturnPort() {
		return returnPort;
	}

	public void setReturnPort(String returnPort) {
		this.returnPort = returnPort;
	}
	
	public String printCruiseDetails ()
	{
		return cruiseName + ", " + shipName + ", " + departurePort + ", " + destination + ", " + returnPort;
	}
	
	public String toString ()
	{
		return cruiseName;
	}
}
