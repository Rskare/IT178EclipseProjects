/*
* File name: Rectangle.java
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
 * <inherits Parallelogram and prints out coordinates, height, area, and width>
 *
 * @author Ryan Skare
 *
 */
public class Rectangle extends Parallelogram{//inherit Parallelogram

	//inherit constructor
	public Rectangle (double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4)
	{
		super(x1, x2, x3, x4, y1, y2, y3, y4);
	}

	//inherit toString
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
