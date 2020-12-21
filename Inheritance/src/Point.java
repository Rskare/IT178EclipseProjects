/*
* File name: Point.java
*
* Programmer: Ryan Skare
* ULID: rskare
*
* Date: Sep 27, 2020
*
* Class: IT 178
* Lecture Section: 02
* Lecture Instructor: Tonya Pierce
*/

/**
 * <allows a point to have an x and y coordinate and print them neatly>
 *
 * @author Ryan Skare
 *
 */
public class Point {
	//variables
	private double x, y;
	
	//custom constructor
	public Point (double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	//getters
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	//print coordinate
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
}
