/*
* File name: Driver.java
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
 * <call class methods to output coordinates, height, area, and/or widths of different shapes>
 *
 * @author Ryan Skare
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Quadrilateral quad = new Quadrilateral (1.1, 6.6, 6.2, 2.2, 1.2, 2.8, 9.9, 7.4);
		System.out.println("Coordinates of Quadrilateral are:\n" + quad.toString() + "\n");
		Trapezoid trap = new Trapezoid (0, 10, 8, 3.3, 0, 0, 5, 5);
		System.out.println("Coordinates of Trapezoid are:\n" + trap.toString() + "\n");
		Parallelogram para = new Parallelogram (5, 11, 12, 6, 5, 5, 20, 20);
		System.out.println("Coordinates of Parallelogram are:\n" + para.toString() + "\n");
		Rectangle rect = new Rectangle (17, 30, 30, 17, 14, 14, 28, 28);
		System.out.println("Coordinates of Rectangle are:\n" + rect.toString() + "\n");
		Square squa = new Square (4, 8, 8, 4, 0, 0, 4, 4);
		System.out.println("Coordinates of Square are:\n" + squa.toString() + "\n");
	}

}
