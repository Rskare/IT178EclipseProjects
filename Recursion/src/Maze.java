import java.util.Scanner;

/*
* File name: test.java
*
* Programmer: Ryan Skare
* ULID: rskare
*
* Date: Oct 12, 2020
*
* Class: IT 178
* Lecture Section: 02
* Lecture Instructor: Tonya Pierce
*/

/**
 * <uses recursion and backtracking to find a path through a maze>
 *
 * @author Ryan Skare
 *
 */
public class Maze {

	/**
	 * @param args
	 */
	static boolean flag = true;
	static Scanner scan = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		//initialize variables
		char [][] path = {{'#','#','#','#','#','#','#','#','#','#','#','#'},
				{'#','.','.','.','#','.','.','.','.','.','.','#'},
				{'.','.','#','.','#','.','#','#','#','#','.','#'},
				{'#','#','#','.','#','.','.','.','.','#','.','#'},
				{'#','.','.','.','.','#','#','#','.','#','.','.'},
				{'#','#','#','#','.','#','.','#','.','#','.','#'},
				{'#','.','.','#','.','#','.','#','.','#','.','#'},
				{'#','#','.','#','.','#','.','#','.','#','.','#'},
				{'#','.','.','.','.','.','.','.','.','#','.','#'},
				{'#','#','#','#','#','#','.','#','#','#','.','#'},
				{'#','.','.','.','.','.','.','#','.','.','.','#'}};
		int x = 2;
		int y = 0;
		
		path[x][y] = 'X';//mark the starting point
		printMaze(path);

		mazeTraversal(path, x, y);
	}

	public static void mazeTraversal (char [][] path, int x, int y)
	{		
		while (flag)//allows the user to exit the program without completing the maze
		{
			System.out.print("Enter ‘y’ to continue, ‘n’ to exit: ");
			String input = scan.next();
			if (input.equals("y")) 
			{
				//base case
				if (path[4][11] == 'X')
				{
					System.out.println("Maze complete");
					flag = false;
				}
				else 
				{//look for the next point
					int xx = 0; 
					int yy = 0;
					
					if (checkUp(path, x, y) != 0)
					{
						xx = checkUp(path, x, y);
						path[x-1][y] = 'X';
						printMaze(path);
					}
					
					else if (checkDown(path, x, y) != 0)
					{
						xx = checkDown(path, x, y);
						path[x+1][y] = 'X';
						printMaze(path);
					}
					

					else if (checkRight(path, x, y) != 0)
					{
						yy = checkRight(path, x, y);
						path[x][y+1] = 'X';
						printMaze(path);
					}

					else if (checkLeft(path, x, y) != 0)
					{
						yy = checkLeft(path, x, y);
						path[x][y-1] = 'X';
						printMaze(path);
					}
					
					else 
					{//block the current coordinate and backtrack until you find another path
						path[x][y] = 'o';
						printMaze(path);
						
						if (checkForCoordinate (path, x-1, y))
							if (goBack (path, x-1, y))
								xx = -1;
						
						if (checkForCoordinate (path, x+1, y))
							if (goBack (path, x+1, y))
								xx = 1;
						
						if (checkForCoordinate (path, x, y+1))
							if (goBack (path, x, y+1))
								yy = 1;
						
						if (checkForCoordinate (path, x, y-1))
							if (goBack (path, x, y-1))
								yy = -1;
					}
					mazeTraversal(path, x+xx, y+yy);
				}
			}
			else if (input.equals("n"))
			{
				flag = false;//end loop
			}
			else
				System.out.println("Please enter y or n.");
		}
	}
	
	public static boolean checkForCoordinate (char [][] path, int x, int y)
	{//tests for an IndexOutOfBoundsException
		boolean flag = false;
		try 
		{
			if(path[x][y] == 'X')
				flag = true;
			else
				flag = true;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{}
		return flag;
	}
	
	public static boolean checkForPath (char [][] path, int x, int y)
	{//checks a coordinate for a unmarked path
		boolean flag = false;
		if (path[x][y] == '.')
			flag = true;
		return flag;
	}
	
	public static int checkUp (char [][] path, int x, int y)
	{//check above current coordinate
		int xx = 0;
		if (checkForCoordinate (path, x-1, y))
			if (checkForPath (path, x-1, y))
				xx = -1;
		return xx;
	}
	
	public static int checkDown (char [][] path, int x, int y)
	{//check below current coordinate
		int xx = 0;
		if (checkForCoordinate (path, x+1, y))
			if (checkForPath (path, x+1, y))
				xx = 1;
		return xx;
	}
	
	public static int checkRight (char [][] path, int x, int y)
	{//check to the right of current coordinate
		int yy = 0;
		if (checkForCoordinate (path, x, y+1))
			if (checkForPath (path, x, y+1))
				yy = 1;
		return yy;
	}
	
	public static int checkLeft (char [][] path, int x, int y)
	{//check to the left of current coordinate
		int yy = 0;
		if (checkForCoordinate (path, x, y-1))
			if (checkForPath (path, x, y-1))
				yy = -1;
		return yy;
	}
	
	public static boolean goBack (char [][] path, int x, int y)
	{//checks coordinate for a marked path
		boolean flag = false;
		if (path[x][y] == 'X')
			flag = true;
		return flag;
	}
	
	public static void printMaze(char[][]path)
	{//print maze
		for (int i = 0; i < path.length; i++)
		{
			System.out.println();
			for (int j = 0; j < path[i].length; j++)
				System.out.print(path[i][j]);
		}
		System.out.println();
	}
}
