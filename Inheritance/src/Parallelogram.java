/*
* File name: Parallelogram.java
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
 * <inherit Trapezoid and print coordinates, height, area, and width>
 *
 * @author Ryan Skare
 *
 */
public class Parallelogram extends Trapezoid{//inherit Trapezoid

	//inherit constructor
	public Parallelogram (double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4)
	{
		super(x1, x2, x3, x4, y1, y2, y3, y4);
	}
	
	//calc width
	public double getWidth()
	{
		double width = 0;
		if (getPoint1().getX() - getPoint2().getX() < 0)
			width = getPoint2().getX() - getPoint1().getX();
		else 
			width = getPoint1().getX() - getPoint2().getX();
		return width;
	}

	//inherit Trapezoid's toString and also print width
	public String toString() {
		return super.toString() +
				"\nWidth is: " + getWidth();
	}
	
	
}
