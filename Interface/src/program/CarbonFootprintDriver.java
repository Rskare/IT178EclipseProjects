/*
* File name: CarbonFootprintDriver.java
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

import java.text.DecimalFormat;

/**
 * <stores each class object into an array then prints out emissions>
 *
 * @author Ryan Skare
 *
 */
public class CarbonFootprintDriver {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat ("###,###,###.##");//correctly formats output
		CarbonFootprint [] array = new CarbonFootprint [3];//stores CarbonFootprint objects

		//each item is stored into the array
		array[0] = new Building (2500, true, false, true, true);
		array[1] = new Car (10);
		array[2] = new Bicycle ();

		//outputs the carbon footprint of each item
		System.out.println(array[2].toString() + df.format(array[2].getCarbonFootprint()));
		System.out.println(array[0].toString() + df.format(array[0].getCarbonFootprint()));
		System.out.println(array[1].toString() + df.format(array[1].getCarbonFootprint()));
		
		//changes to the item are implemented and outputted
		array[0] = new Building (1000, false, true, false, false);
		System.out.println(array[0].toString() + df.format(array[0].getCarbonFootprint()));
		
		array[1] = new Car (40.60);
		System.out.println(array[1].toString() + df.format(array[1].getCarbonFootprint()));
		
	}

}
