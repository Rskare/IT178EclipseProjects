/*
* File name: BicycleDriver.java
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

import java.util.Arrays;//used for testing
import java.util.Scanner;

/**
 * <allows the user to check inventory and use specific parameters to filter the search>
 *
 * @author Ryan Skare
 *
 */
public class BicycleDriver {

	static Scanner scan = new Scanner (System.in);
	
	private static int menuOptions ()
	{
		int in = 0;
		boolean flag = true;
		
		//displays a menu and takes user input
		System.out.println("1- Choose one for me\r\n" + 
				"2- List inventory by wheelSize\r\n" + 
				"3- List inventory by type\r\n" + 
				"4- List inventory by gender\r\n" + 
				"5- List inventory by assembled\r\n" + 
				"6- List entire inventory\r\n" + 
				"7- Quit\r\n");
		while (flag)//this loop will ensure that a correct number is entered. I will repeat this loop for many steps
		{
			System.out.println("Please enter a number 1-7");
			String input = scan.nextLine();
			try // try/else loop will test if the input is an integer between 1 and 7
			{
				in = Integer.parseInt(input);
				if (in < 1 || in > 7)
					System.out.println("Not a number between 1-7");
				else
				{
					flag = false;//if it meets requirements, this will end the loop
				}
			}
			catch (Exception e)
			{
				System.out.println("Not a valid integer.");
			}
		}
		return in;//input is saved in the main method
	}
	
	public static int determineSearch ()
	{
		boolean flag = true;
		int in = 0;
		//asks the user for a parameter and takes user input
		System.out.println("1- Choose one by wheelSize\r\n" + 
				"2- Choose one by type\r\n" + 
				"3- Choose one by gender\r\n" + 
				"4- Choose one by assembled\r\n" + 
				"5- Choose one by all\r\n");
		while (flag)//checks the input 
		{
			System.out.println("Please enter a number 1-5");
			String input = scan.nextLine();
			try //try method will check input to see if it is valid
			{
				in = Integer.parseInt(input);
				if (in < 1 || in > 7)
					System.out.println("Not a number between 1-5");
				else
				{
					flag = false;
				}
			}
			catch (Exception e)
			{
				System.out.println("Not a valid integer.");
			}
		}
		return in;//input is saved in the main method
	}
	
	//the next 5 criteria methods continue from the "Choose one" options
	
	public static int criteriaWheelSize ()
	{
		boolean flag = true;
		int size = 0;
		
		while (flag)//this first criteria loop asks for wheel size and verifies the integer
		{
			System.out.println("Choose a wheel size---14 or 16");
			String input = scan.nextLine();
			try
			{
				size = Integer.parseInt(input);
				if (size != 14 && size != 16)//takes into account of other integers that won't match up with inventory
					System.out.println("Not a number that is 14 or 16.");
				else 
				{
					flag = false;
				}
			}
			catch (Exception e)
			{
				System.out.println("Not a valid integer.");
			}
		}
		return size;
	}
	
	public static int criteriaNumber ()
	{
		boolean flag = true;
		int sizeParameter = 0;
		
		while (flag)//the second criteria loop asks for a number of results it should search for. this is used for all "Choose one" options
		{
			System.out.println("How many do you want to find?");
			String input = scan.nextLine();
			try
			{
				sizeParameter = Integer.parseInt(input);
				flag = false;
			}
			catch (Exception e)
			{
				System.out.println("Not a valid integer.");
			}
		}
		return sizeParameter;
	}
	
	public static String criteriaType ()
	{
		boolean flag = true;
		String type = "";
				
		while (flag)//asks the user what type of bike and should only accept options that are available in the inventory
		{
			System.out.println("What type are you looking for?---Hybrid, Mountain, Road, Speed, Dirt");
			type = scan.nextLine().toLowerCase();
			//MUST USE .equals WHEN COMPARING A USER INPUT STRING TO ANOTHER STRING
			if (type.equals("hybrid") || type.equals("mountain") || type.equals("road") || type.equals("speed") || type.equals("dirt"))
			{
				flag = false;
			}
			else
			{
				System.out.println("Not a choice listed.");
			}
		}
		return type;
	}

	public static char criteriaGender ()
	{
		boolean flag = true;
		char gender = ' ';
		
		while (flag)//gives the user a choice between two different gender-specific bikes
		{
			System.out.println("What is the gender?---m or f");
			String input = scan.nextLine();
			
			try //try method will also check the input, and if the input is a character
			{
				gender = input.charAt(0);
				
				if (gender !='m' && gender != 'f')
				{
					System.out.println("Not a choice listed.");
				}
				else
				{
					flag = false;
				}
			}
			catch (Exception e)
			{
				System.out.println("Not a valid character.");
			}
		}
		return gender;
	}
	
	public static boolean criteriaAssembled ()
	{
		boolean flag = true;
		boolean assembled = true;
		while (flag)//asks the user if it wants the bike assembled, and the loops checks if the input is a boolean
		{
			System.out.println("You want it assembled, right?---true or false");
			String input = scan.nextLine();
			
			try
			{
				assembled = Boolean.parseBoolean(input);
				flag = false;
				return assembled;
			}
			catch (Exception e)
			{
				System.out.println("Not a valid boolean.");
			}
		}
		return assembled;
	}
	
	//this next method is continued from the optionsMenu except the "Choose one" option
	public static void outputList (int input, Bicycle[] bicycles, int size)
	{
		switch (input)
		{
			//first case will filter the inventory based on the user's preferred wheel size
			case 1: boolean flag = true;
					int wheelsize = 0;
					
					while (flag)
					{
						System.out.println("What wheel size are you looking for?---14 or 16");
						String in = scan.nextLine();
						
						try //gathers and checks if the input was correct
						{
							wheelsize = Integer.parseInt(in);
							if (wheelsize != 14 && wheelsize != 16)
								System.out.println("Not a number that is 14 or 16.");
							else 
							{
								flag = false;
							}
						}
						catch (Exception e)
						{
							System.out.println("Not a valid integer.");
						}
					}
					for (int i = 0; i < size; i ++)//actually looks through the bikeArray and outputs results
					{
						if (bicycles[i].getWheelSize() == wheelsize)
							System.out.println(bicycles[i]);
					}
					break;
					
			//second case will filter the inventory based on the user's preferred type
			case 2: boolean flag1 = true;
					String type = "";
					
					while (flag1)//gathers and checks input
					{
						System.out.println("What type are you looking for?---Hybrid, Mountain, Road, Speed, Dirt");
						type = scan.next().toLowerCase();
		
						//MUST USE .equals WHEN COMPARING A USER INPUT STRING TO ANOTHER STRING
							if (type.equals("hybrid") || type.equals("mountain") || type.equals("road") || type.equals("speed") || type.equals("dirt"))
							{
								flag1 = false;
							}
							else 
								System.out.println("Not a choice listed.");
					}
					
					for (int i = 0; i < size; i ++)//searches array for results
					{
						if (bicycles[i].getType().equals(type))//MUST USE .equals WHEN COMPARING A USER INPUT STRING TO ANOTHER STRING
							System.out.println(bicycles[i]);
					}
					break;
			
			//third case will filter the inventory based on the user's preferred gender
			case 3: boolean flag2 = true;
					char gender = ' ';
					
					while (flag2)//gathers and checks input
					{
						System.out.println("What is the gender?---m or f");
						String in = scan.nextLine();
						
						try 
						{
							gender = in.charAt(0);
							
							if (gender != 'm' && gender != 'f')
							{
								System.out.println("Not a choice listed.");
							}
							else
							{
								flag2 = false;
							}
						}
						catch (Exception e)
						{
							System.out.println("Not a valid character.");
						}
					}
					
					for (int i = 0; i < size; i ++)//searches array for results
					{
						if (bicycles[i].getGender() == gender)
							System.out.println(bicycles[i]);
					}
					break;
					
			//fourth case will filter the inventory based on the user's preferred assembly option
			case 4: boolean flag3 = true;
					boolean assembled = true;
					while (flag3)//gathers and checks input
					{
						System.out.println("You want it assembled, right?---true or false");
						String in = scan.nextLine();
						
						try
						{
							assembled = Boolean.parseBoolean(in);
							flag3 = false;
						}
						catch (Exception e)
						{
							System.out.println("Not a valid boolean.");
						}
					}
					
					for (int i = 0; i < size; i ++)//searches array for results
					{
						if (bicycles[i].isAssembled() == assembled)
							System.out.println(bicycles[i]);
					}
					break;
			
			//last case will output the whole array
			case 5: for (int i = 0; i < size; i ++)
			{
					System.out.println(bicycles[i]);
			}
			break;
		}
	}
	
	public static void main(String[] args) {		
		
		//initialize variables used in main method
		boolean flag = true;//used to make the loop
		BicycleInventory inventory = new BicycleInventory ();//makes an object and allows me to call methods from BicycleInventory
		Bicycle bike = new Bicycle ();//makes an object and allow me to call methods from Bicycle
		
		inventory.readInventory();//calls this method and stores info from "bicycle.txt" to the array in BicycleInventory
		
		while (flag)//keep the whole program in a loop until the user quits
		{
			int input1 = menuOptions ();//list menu options
			int input2 = 0; //Choose One menu option
			int wheelSize = 0;
			String type = "";
			char gender = ' ';
			boolean assembled = true;
			int input3 = 0; //used in "Choose one" options and determines how many results are found before the chooseOne method randomly picks one
			
			switch (input1)//uses input from outputMenu and determines what to do based on input
			{
				case 1: input2 = determineSearch ();
						break;
				case 2: outputList(input1 - 1, inventory.getBikeArray(), inventory.getArraySize());
						break;
				case 3: outputList(input1 - 1, inventory.getBikeArray(), inventory.getArraySize());
						break;
				case 4: outputList(input1 - 1, inventory.getBikeArray(), inventory.getArraySize());
						break;
				case 5: outputList(input1 - 1, inventory.getBikeArray(), inventory.getArraySize());
						break;
				case 6: outputList(input1 - 1, inventory.getBikeArray(), inventory.getArraySize());
						break;
				case 7: System.out.println("Goodbye.");
						flag = false;
						break;
			}
			
			switch (input2)//uses input from Choose One menu and stores the variables into the main method
			{
				case 1: wheelSize = criteriaWheelSize ();
						input3 = criteriaNumber();
						break;
				case 2: type = criteriaType ();
						input3 = criteriaNumber();
						break;
				case 3: gender = criteriaGender ();
						input3 = criteriaNumber();
						break;
				case 4: assembled = criteriaAssembled ();
						input3 = criteriaNumber();
						break;
				case 5: wheelSize = criteriaWheelSize ();
						type = criteriaType ();
						gender = criteriaGender ();
						assembled = criteriaAssembled ();
						input3 = criteriaNumber();
						break;
			}
			
			switch (input2)//takes variables, from the previous switch/case, and puts them into the chooseOne methods to output a result
			{
				case 1: inventory.chooseOne(wheelSize, input3);
					break;
				case 2: inventory.chooseOne(type, input3);
					break;
				case 3: inventory.chooseOne(gender, input3);
					break;
				case 4: inventory.chooseOne(assembled, input3);
					break;
				case 5: inventory.chooseOne(wheelSize, type, gender, assembled, input3);
					break;
			}
		}
		}
}
