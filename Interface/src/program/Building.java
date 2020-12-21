/*
* File name: Building.java
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
 * <calculates the carbon footprint of a building based on the area and materials used>
 *
 * @author Ryan Skare
 *
 */
public class Building implements CarbonFootprint{

	//variables
	private int sqFeet;
	private boolean wood, basement, concrete, steel;
	
	//constants
	private final int woodFrame = 50;
	private final int basementNum = 20;
	private final int concreteNum = 20;
	private final int steelNum = 20;
	
	//custom constructor
	public Building (int sqFeet, boolean wood, boolean basement, boolean concrete, boolean steel)
	{
		this.sqFeet = sqFeet;
		this.wood = wood;
		this.basement = basement;
		this.concrete = concrete;
		this.steel = steel;
	}
	
	//carbon footprint = sq. ft. * true constant variables
	public double getCarbonFootprint ()
	{
		int output = 0;
		
		if(wood == true )
			output += woodFrame;
		if(basement == true )
			output += basementNum;
		if(concrete == true )
			output += concreteNum;
		if(steel == true )
			output += steelNum;
		
		output *= sqFeet; 
		
		return output;
	}
	
	public String toString()
	{
		int count  = 0;
		String [] array = new String [count];
		String output = "Building with " + sqFeet + " square feet with ";
		if(wood == true )
			output += "wood frame, ";
		if(basement == true )
			output += "basement, ";
		if(concrete == true )
			output += "concrete, ";
		if(steel == true )
			output += "steel";
		return output += ": ";
	}
}
