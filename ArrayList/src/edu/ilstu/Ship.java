/*
* File name: Ship.java
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
 * <info regarding ships is stores here>
 *
 * @author Ryan Skare
 *
 */
public class Ship {
	private String shipName;
	int balconyRooms;
	int oceanviewRooms;
	int suiteRooms;
	int interiorRooms;
	private boolean service;
	
	public Ship (String shipName, int balconyRooms, int oceanviewRooms, int suiteRooms, int interiorRooms, boolean service)
	{
		this.shipName = shipName;
		this.balconyRooms = balconyRooms;
		this.oceanviewRooms = oceanviewRooms;
		this.suiteRooms = suiteRooms;
		this.interiorRooms = interiorRooms;
		this.service = service;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public int getBalconyRooms() {
		return balconyRooms;
	}

	public void setBalconyRooms(int balconyRooms) {
		this.balconyRooms = balconyRooms;
	}

	public int getOceanviewRooms() {
		return oceanviewRooms;
	}

	public void setOceanviewRooms(int oceanviewRooms) {
		this.oceanviewRooms = oceanviewRooms;
	}

	public int getSuiteRooms() {
		return suiteRooms;
	}

	public void setSuiteRooms(int suiteRooms) {
		this.suiteRooms = suiteRooms;
	}

	public int getInteriorRooms() {
		return interiorRooms;
	}

	public void setInteriorRooms(int interiorRooms) {
		this.interiorRooms = interiorRooms;
	}

	public boolean isService() {
		return service;
	}

	public void setService(boolean service) {
		this.service = service;
	}
	
	public String printShipData ()
	{
		return shipName + ", " + balconyRooms + ", " + + oceanviewRooms + ", " + + suiteRooms + ", " + + interiorRooms + ", " + service;
	}
	
	public String toString()
	{
		return shipName;
	}
}
