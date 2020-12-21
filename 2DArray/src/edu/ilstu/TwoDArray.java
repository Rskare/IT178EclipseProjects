/*
* File name: TwoDArray.java
*
* Programmer: Ryan Skare
* ULID: rskare
*
* Date: Sep 2, 2020
*
* Class: IT 178
* Lecture Section: 02
* Lecture Instructor: Tonya Pierce
*/
package edu.ilstu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

/**
 * <read daily temps from a txt doc and calculate the average temp per month>
 *
 * @author Ryan Skare
 *
 */
public class TwoDArray {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) {
		
		//temp = temperature, not to be confused with temporary
		//rows represent each month, columns are days of each month
		int [][] temp = new int[12][];
		temp[0] = new int [31];
		temp[1] = new int [28];
		temp[2] = new int [31];
		temp[3] = new int [30];
		temp[4] = new int [31];
		temp[5] = new int [30];
		temp[6] = new int [31];
		temp[7] = new int [31];
		temp[8] = new int [30];
		temp[9] = new int [31];
		temp[10] = new int [30];
		temp[11] = new int [31];
		
		//temporarily store a line in a file
		String[] sa = new String[0];
		
		//read temps file
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader("temps.txt"));//reads file
			String st;//stores line into String
			for (int i = 0; i < temp.length; i++)
				{
					for (int j = 0; j < temp[i].length; j++)
					{
						if (j==0)//this is essential when txt file is not modified... file must be read one line at a time, then split, and stored into the array
							if ((st = br.readLine()) != null)
								sa = st.split(",");
						
						temp[i][j] = Integer.parseInt(sa[j].trim());
						
						//tested if temps were being stored correctly
//						System.out.print(temp[i][j]+ ",");
//						if (j==temp[i].length-1)
//							System.out.print("\n");
					}
					
				}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		//total the temps in each month
		for (int i = 0; i < temp.length; i++)
		{
			int total = 0;//total is reset when a new month starts
			for (int j = 0; j < temp[i].length; j++)
			{
				total += temp[i][j];//total daily temps
				
				//tested if total was being added correctly
//				System.out.println(total);
				
				//when temps are totaled and the loop reached the end...
				if (j==temp[i].length-1)
				{
					switch (i+1)//i = month that the loop is currently on
					{
					//each case prints out month average
					case 1: 
						System.out.println("January Average: "+total/temp[i].length);
						break;
					case 2: 
						System.out.println("February Average: "+total/temp[i].length);
						break;
					case 3: 
						System.out.println("March Average: "+total/temp[i].length);
						break;
					case 4: 
						System.out.println("April Average: "+total/temp[i].length);
						break;
					case 5: 
						System.out.println("May Average: "+total/temp[i].length);
						break;
					case 6: 
						System.out.println("June Average: "+total/temp[i].length);
						break;
					case 7: 
						System.out.println("July Average: "+total/temp[i].length);
						break;
					case 8: 
						System.out.println("August Average: "+total/temp[i].length);
						break;
					case 9: 
						System.out.println("September Average: "+total/temp[i].length);
						break;
					case 10: 
						System.out.println("October Average: "+total/temp[i].length);
						break;
					case 11: 
						System.out.println("November Average: "+total/temp[i].length);
						break;
					case 12: 
						System.out.println("December Average: "+total/temp[i].length);
						break;
					}
				}
					
			}
		}
	}
	
}
