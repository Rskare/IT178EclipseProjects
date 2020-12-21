/*
* File name: Car.java
*
* Programmer: Ryan Skare
* ULID: rskare
*
* Date: Oct 1, 2020
*
* Class: IT 178
* Lecture Section: 02
* Lecture Instructor: Tonya Pierce
*/
package program;

/**
 * <calculates the carbon footprint of a car based on gallons of gas used>
 *
 * @author Ryan Skare
 *
 */
public class Car implements CarbonFootprint{

	//variable
	private double gallons;
	
	//constant
	private final int carbonYield = 20;
	
	//constructor
	public Car (double gallons)
	{
		this.gallons = gallons;
	}
	
	//carbon footprint = gallons * CO2 yields
	public double getCarbonFootprint ()
	{
		return (double)(gallons * carbonYield);
	}
	
	public String toString()
	{
		return "Car that has used " + gallons + " gallons of gas: ";
	}
}
