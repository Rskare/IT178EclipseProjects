/*
* File name: Quadrilateral.java
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
 * <stores points of a shape and prints them out as coordinates>
 *
 * @author Ryan Skare
 *
 */
public class Quadrilateral {
	//variables
	private Point point1, point2, point3, point4;

	//custom constructor that accepts all variables
	public Quadrilateral (double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4)
	{
		//each variable is made up of an x and y coordinate
		this.point1 = new Point (x1, y1);
		this.point2 = new Point (x2, y2);
		this.point3 = new Point (x3, y3);
		this.point4 = new Point (x4, y4);
	}
	
	//getters
	public Point getPoint1() {
		return point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public Point getPoint4() {
		return point4;
	}

	//the toString will use getCoordinatesAsString to print out coordinates neatly
	public String toString() {
		return getCoordinatesAsString();
	}
	
	public String getCoordinatesAsString ()
	{
		return point1 + ", " + point2 + ", " + point3 + ", " + point4;
	}
}
