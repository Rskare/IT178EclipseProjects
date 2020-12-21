/*
* File name: Trapezoid.java
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
 * <inherits from Quadrilateral. stores and prints coordinates, and calculates height and area>
 *
 * @author Ryan Skare
 *
 */
public class Trapezoid extends Quadrilateral{//inherit Quadrilateral
	//variables
	private int height;
	
	//custom constructor that inherits Quadrilateral's constructor
	public Trapezoid (double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4)
	{
		super(x1, x2, x3, x4, y1, y2, y3, y4);
		this.height = height;
	}
	
	//calculate height of Quad
	public double getHeight()
	{
		double height = 0;
		
		if (getPoint1().getY() - getPoint4().getY() < 0)
			height = getPoint4().getY() - getPoint1().getY();
		else 
			height = getPoint1().getY() - getPoint4().getY();
		
		return height;
	}
	
	//calc the sum of two sides
	public double getSumOfTwoSides()
	{
		double length1 = 0;
		double length2 = 0;
		
		if (getPoint1().getX() - getPoint2().getX() < 0)
			length1 = getPoint2().getX() - getPoint1().getX();
		else 
			length1 = getPoint1().getX() - getPoint2().getX();
		
		if (getPoint3().getX() - getPoint4().getX() < 0)
			length2 = getPoint4().getX() - getPoint3().getX();
		else 
			length2 = getPoint3().getX() - getPoint4().getX();
		
		return length1 + length2;
	}

	//calc area
	public double getArea()
	{
		return getSumOfTwoSides() * getHeight() / 2;
	}

	//inherit toString from Quad and also print height and area
	public String toString() {
		return super.toString() + 
				"\nHeight is: " + getHeight() +
				"\nArea is: " + getArea();
	}
	
	
}
