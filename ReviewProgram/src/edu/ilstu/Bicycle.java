/*
* File name: Bicycle.java
*
* Programmer: Ryan Skare
* ULID: rskare
*
* Date: Aug 20, 2020
*
* Class: IT 178
* Lecture Section: 02
* Lecture Instructor: Tonya Pierce
*/
package edu.ilstu;

/**
 * <stores information about the bicycles available>
 *
 * @author Ryan Skare
 *
 */
public class Bicycle {

	//initialize variables;
	private String type;
	private int wheelSize;
	private boolean assembled; 
	private char gender;
	
	//default method
	public Bicycle() {}
	
	//custom method with all variables
	public Bicycle(String type, int wheelSize, boolean assembled, char gender) {
		this.type = type;
		this.wheelSize = wheelSize;
		this.assembled = assembled;
		this.gender = gender;
	}

	//get methods will allow me to call them in driver
	public String getType() {
		return type;
	}

	public double getWheelSize() {
		return wheelSize;
	}

	public boolean isAssembled() {
		return assembled;
	}

	public char getGender() {
		return gender;
	}

	//toString will output the bikes in a easy-to-read manner
	@Override
	public String toString() {
		String i = "Bicycle type="+type+", wheelsize="+wheelSize+", assembled="+assembled;
		if (gender=='m')
			i+=", gender=male";
		if (gender=='f')
			i+=", gender=female";
		return i;
	}
	
	
}
