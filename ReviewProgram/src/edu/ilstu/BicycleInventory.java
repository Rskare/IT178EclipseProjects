/*
* File name: BicycleInventory.java
*
* Programmer: Ryan Skare
* ULID: rskare
*
* Date: Aug 20, 2020
*
* Class: IT 178
* Lecture Section: 02
* Lecture Instructor: Tonya Pierce
*/
package edu.ilstu;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * <keeps an inventory and filters search parameters>
 *
 * @author Ryan Skare
 *
 */
public class BicycleInventory {

	//declare array and array size
	private Bicycle [] bikeArray; 
	private int arraySize;
	
	//default method that initializes variables
	public BicycleInventory () 
	{
		bikeArray = new Bicycle [100];
		arraySize = 0;
	}
	
	//takes info from the text document and stores it into the array
	public void readInventory() 
	{
		try {
			//take note that file location may have to be adjusted
            FileInputStream fis = new FileInputStream ("C:\\Users\\ryann\\OneDrive\\Documents\\IT178\\ReviewProgram\\bicycle.txt");
            DataInputStream dis = new DataInputStream (fis);
            BufferedReader br = new BufferedReader (new InputStreamReader(dis));
            String s;
            int counter = 0;
            while ((s = br.readLine ()) != null)
            {
                String [] split = s.split (" ");
                
                String type = split[0].trim().toLowerCase();
				String wheelSize = split[1].trim();
				int ws = Integer.parseInt(wheelSize);
				String assembled = split[2].trim();
				boolean a = Boolean.parseBoolean(assembled);
				String gender = split[3].trim();
				char g = gender.charAt(0);
				
				Bicycle bicycle = new Bicycle (type, ws, a, g);
				
                bikeArray[counter] = bicycle;
                arraySize++;
                counter++; 
            }
            dis.close ();
        } 
		
		catch (Exception e) 
		{
            System.err.println("There was an error reading the file.");
        }
	}

	//the next 5 getChoices methods take inputs from the drivers to filter the objects inside the array
	
	//takes all variable into account for finding results
	public Bicycle[] getChoices(String t, int ws, boolean a, char g, int input) 
	{
		//creates another array to store results in
		Bicycle array [] = new Bicycle [input];
		int results = 0;//will count the results found and will not exceed input
		
		//search the bikeArray until it reaches the array size and/or the results found equal input
		for (int i = 0; i < arraySize && results < input; i++)
		{
				//search for specific parameters (Bicycle instances)
				if (t == bikeArray[i].getType()
					&& ws == bikeArray[i].getWheelSize()
					&& a == bikeArray[i].isAssembled()
					&& g == bikeArray[i].getGender())
					//add to output if they match parameters
					//output += bikeArray[i] +"\n";
					
					//stores result in new array
					for (int h = 0; h < array.length; h++)
					{
						array[h] = bikeArray[i];
						results++;
					}
				 
				//if no results are found?
		}
		return array;//passes the array the the chooseOne methods
	}
	
	//uses type and input to filter results
	public Bicycle[] getChoices (String t, int input)
	{
		//make new array and initialize results found in the for loop
		Bicycle array [] = new Bicycle [input];
		int results = 0;
		
		//for loop that searches the whole array
		for (int i = 0; i < arraySize && results < input; i++)
		{
			//the type of bike is the parameter used to find results
			if (t.equals(bikeArray[i].getType()))//MUST USE .equals WHEN COMPARING A USER INPUT STRING TO ANOTHER STRING
			{
				//for loop that stores results in a new array
				for(int j = 0; j < array.length; j++)
				{
					array[j] = bikeArray[i];
					results++;
				}
			}
		}
		return array;
	}
	
	//uses wheel size and input to filter results
	public Bicycle[] getChoices (int ws, int input)
	{
		
		Bicycle array [] = new Bicycle [input];
		int results = 0;
		
		for (int i = 0; i < arraySize && results < input; i++)
		{
			if (ws == bikeArray[i].getWheelSize())//parameter
			{
				for(int j = 0; j < array.length; j++)
				{
					array[j] = bikeArray[i];
					results++;
				}
			}
		}
		return array;
	}
	
	//uses assembly and input to filter results
	public Bicycle[] getChoices (boolean a, int input)
	{
		
		Bicycle array [] = new Bicycle [input];
		int results = 0;
		
		for (int i = 0; i < arraySize && results < input; i++)
		{
			if (a == bikeArray[i].isAssembled())//parameter
			{
				for(int j = 0; j < array.length; j++)
				{
					array[j] = bikeArray[i];
					results++;
				}
			}
		}
		return array;
	}
	
	//uses gender and input to filter results
	public Bicycle[] getChoices (char g, int input)
	{
		
		Bicycle array [] = new Bicycle [input];
		int results = 0;
		
		for (int i = 0; i < arraySize && results < input; i++)
		{
			if (g == bikeArray[i].getGender())//parameter
			{
				for(int j = 0; j < array.length; j++)
				{
					array[j] = bikeArray[i];
					results++;
				}
			}
		}
		return array;
	}
	
	//next 5 chooseOne methods will take the array from the appropriate getChoices method and choose a random bike
	
	//results from all variables
	public void chooseOne(int ws, String t, char g, boolean a, int input) 
	{
		Bicycle[] x = getChoices(t, ws, a, g, input);
		Random rand = new Random();
		int rand_int = rand.nextInt(input);
		System.out.println(x[rand_int]);
	}
	
	//results from type and input
	public void chooseOne (String t, int input)
	{
		Bicycle[] x = getChoices(t, input);
		Random rand = new Random();
		int rand_int = rand.nextInt(input - 1);
		System.out.println(x[rand_int]);
	}
	
	//results from wheelsize and input
	public void chooseOne (int ws, int input)
	{
		Bicycle[] x = getChoices(ws, input);
		Random rand = new Random();
		int rand_int = rand.nextInt(input - 1);
		System.out.println(x[rand_int]);
	}
	
	//results from assembly and input
	public void chooseOne (boolean a, int input)
	{
		Bicycle[] x = getChoices(a, input);
		Random rand = new Random();
		int rand_int = rand.nextInt(input - 1);
		System.out.println(x[rand_int]);
	}
	
	//results from gender and input
	public void chooseOne (char g, int input)
	{
		Bicycle[] x = getChoices(g, input);
		Random rand = new Random();
		int rand_int = rand.nextInt(input - 1);
		System.out.println(x[rand_int]);
	}
	
	//get methods will allow me to call the array and array size to the driver
	
	public Bicycle[] getBikeArray() {
		return bikeArray;
	}

	public int getArraySize() {
		return arraySize;
	}
}
