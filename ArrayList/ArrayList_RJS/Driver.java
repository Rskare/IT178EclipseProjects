/*
* File name: Driver.java
*
* Programmer: Ryan Skare
* ULID: rskare
*
* Date: Sep 15, 2020
*
* Class: IT 178
* Lecture Section: 02
* Lecture Instructor: Tonya Pierce
*/
package edu.ilstu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <displays menus for viewing and editing ships, cruises, and passengers>
 *
 * @author Ryan Skare
 *
 */
public class Driver {

	static Scanner scan = new Scanner (System.in);
	
	public static Ship[] initializeShipList ()//adds 4 ships to the shipList
	{
		Ship array [] = new Ship[10];
		Ship s = new Ship ("Candy Cane", 20, 40, 10, 60, true);
		Ship s1 = new Ship ("Peppermint", 10, 20, 5, 50, true);
		Ship s2 = new Ship ("Bon Bon", 12, 18, 2, 26, true);
		Ship s3 = new Ship ("Candy Corn", 12, 18, 2, 24, false);
		for (int i = 0; i < array.length; i++)
		{
			if (i==0)
				array[0] = s;
			if (i==1)
				array[1] = s1;
			if (i==2)
				array[2] = s2;
			if (i==3)
				array[3] = s3;
		}
		return array;
	}
	
	public static Cruise[] initializeCruiseList ()//adds 3 cruises to the cruiseList
	{
		Cruise array [] = new Cruise [10];
		Cruise c = new Cruise ("Southern Swirl", "Candy Cane", "Miami", "Cuba", "Miami");
		Cruise c2 = new Cruise ("Jolly Fun", "Peppermint", "New Orleans", "Cozumel", "New Orleans");
		Cruise c3 = new Cruise ("Lollipop", "Candy Corn", "Ft Lauderdale", "Bahamas", "Ft Lauderdale");
		for (int i = 0; i < array.length; i++)
		{
			if (i==0)
				array[0] = c;
			if (i==1)
				array[1] = c2;
			if (i==2)
				array[2] = c3;
		}
		return array;
	}

	public static Passenger[] initializePassengerList ()//adds 6 passengers
	{
		Passenger array [] = new Passenger [10];
		Passenger p = new Passenger ("Neo Anderson", "Southern Swirl", "STE");
		Passenger p2 = new Passenger ("Trinity", "Southern Swirl", "BAL");
		Passenger p3 = new Passenger ("Morpheus", "Jolly Fun", "INT");
		Passenger p4 = new Passenger ("Harry Potter", "Jolly Fun", "OV");
		Passenger p5 = new Passenger ("Ronald Weasley", "Lollipop", "STE");
		Passenger p6 = new Passenger ("Hermione Granger", "Lollipop", "BAL");
		for (int i = 0; i < array.length; i++)
		{
			if (i==0)
				array[0] = p;
			if (i==1)
				array[1] = p2;
			if (i==2)
				array[2] = p3;
			if (i==3)
				array[3] = p4;
			if (i==4)
				array[4] = p5;
			if (i==5)
				array[5] = p6;
		}
		return array;
	}
	
	public static void printShipList (Ship[] s, String menuSelection)//will print in 3 different formats based on user input
	{
		if (menuSelection.equals("A"))//first selection will only print ship names
		{
			System.out.println("\nSHIP LIST - Name");
			for (int i = 0; i < s.length; i++)
			{
				if (s[i] != null)
					System.out.println(s[i]);
			}
			System.out.println("\n");
		}
		
		if (menuSelection.equals("B"))//second selection will print all ship details IF ship is in service
		{
			System.out.println("\nSHIP LIST – ACTIVE\n"
				+ "-----------------------------------------------------\n" 
				+ "\t\tNumber of Rooms\t\t\t" + "In\n" 
				+ "SHIP NAME\t" + "Bal\t"+ "OV\t" + "Ste\t" + "Int\t" + "Service\n"
				+ "-----------------------------------------------------\n");
			for(int i = 0; i < s.length; i++)
				if (s[i] != null)
				{
					if(s[i].isService()==true)
						System.out.println(s[i].getShipName() + "\t" 
								+ s[i].getBalconyRooms() + "\t" 
								+ s[i].getOceanviewRooms() + "\t" 
								+ s[i].getSuiteRooms() + "\t" 
								+ s[i].getInteriorRooms() + "\t" 
								+ s[i].isService());
				}
			System.out.print("\n");
		}
		
		if (menuSelection.equals("C"))//third selection will print all ship details of all ships
		{
			System.out.println("\nSHIP LIST – FULL\n"
				+ "-----------------------------------------------------\n" 
				+ "\t\tNumber of Rooms\t\t\t" + "In\n" 
				+ "SHIP NAME\t" + "Bal\t"+ "OV\t" + "Ste\t" + "Int\t" + "Service\n"
				+ "-----------------------------------------------------\n");
			for(int i = 0; i < s.length; i++)
				if (s[i] != null)
				{
					System.out.println(s[i].getShipName() + "\t" 
								+ s[i].getBalconyRooms() + "\t" 
								+ s[i].getOceanviewRooms() + "\t" 
								+ s[i].getSuiteRooms() + "\t" 
								+ s[i].getInteriorRooms() + "\t" 
								+ s[i].isService());
				}
			System.out.print("\n");
		}
	}
	
	public static void printCruiseList (Cruise[] c, String menuSelection)//there are two print formats based on user input
	{
		if (menuSelection.equals("D"))//first selection will print cruise names only
		{
			System.out.print("\nCRUISE LIST - NAME\n");
			for (int i = 0; i < c.length; i++)
			{
				if (c[i] != null)
					System.out.println(c[i]);
			}
			System.out.print("\n");
		}
		
		if (menuSelection.equals("E"))//second selection will print all cruise details
		{
			System.out.println("\nCRUISE LIST – DETAILS\n"
					+ "-----------------------------------------------------------------\n"
                    + "\t\t\t--------------PORTS----------------\n"
                    + "CRUISE NAME\t" + "SHIP NAME\t" + "DEPARTURE\t" + "DESTINATION RETURN\n"
                    + "-----------------------------------------------------------------\n");
			for(int i = 0; i < c.length; i++)
			{
				if (c[i] != null)
					System.out.println(c[i].getCruiseName() + "\t" 
								+ c[i].getShipName() + "\t" 
								+ c[i].getDeparturePort() + "\t" 
								+ c[i].getDestination() + "\t" 
								+ c[i].getReturnPort());
			}
			System.out.print("\n");
		}
	}
	
	public static void printPassengerList (Passenger[] p)//there is only one format. it will print all passenger details
	{
		System.out.println("\nPASSENGER LIST\n"
			+ "-------------------------------------------------------------\n"
			+ "PASSENGER NAME\t\t" + "CRUISE\t" + "ROOM TYPE\n"
			+ "-------------------------------------------------------------");
		for(int i = 0; i < p.length; i++)
		{
			if (p[i] != null)
				System.out.println(p[i].getPassName() + "\t\t" + p[i].getCruiseName() + "\t" + p[i].getRoomType());
		}
		System.out.print("\n");
	}
	
	public static String displayMenu ()//this is the main menu that will be immediately seen by the user
	{		
		System.out.println("Luxury Ocean Cruise Outings\r\n" + 
				"\tSystem Menu\r\n" + 
				"\r\n" + 
				"[1] Add Ship\t\t" +            "[A] Print Ship Names\r\n" + 
				"[2] Edit Ship\t\t" +          "[B] Print Ship In Service List\r\n" + 
				"[3] Add Cruise\t\t" +          "[C] Print Ship Full List\r\n" + 
				"[4] Edit Cruise\t\t" +         "[D] Print Cruise List\r\n" + 
				"[5] Add Passenger\t" +       "[E] Print Cruise Details\r\n" + 
				"[6] Edit Passenger\t" +      "[F] Print Passenger List\r\n" + 
				"[x] Exit System\n");

			System.out.print("Enter a menu selection: ");
			String input = scan.nextLine().toUpperCase();

		return input;
	}
	
	public static Ship addShip ()//adds a ship to the shipList
	{
		int balconyRooms = 0;
		int oceanviewRooms = 0;
		int suites = 0;
		int interiorRooms = 0;
		boolean service = true;
		boolean flag = true;
		
		System.out.println("Enter the new ship name: ");
		String shipName = scan.nextLine();
		
		while (flag)
		{
			System.out.println("How many balcony rooms? ");
			String br = scan.nextLine();
			boolean flag2 = checkInt(br);
			if (flag2)
			{
				balconyRooms = Integer.parseInt(br);
				flag = false;
			}
			else
				System.out.println("Enter an integer.");
		}
		
		flag = true;
		while (flag)
		{
			System.out.println("How many OceanView rooms? ");
			String ovr = scan.nextLine();
			boolean flag3 = checkInt(ovr);
			if (flag3)
			{
				oceanviewRooms = Integer.parseInt(ovr);
				flag = false;
			}
			else
				System.out.println("Enter an integer.");
		}
		
		flag = true;
		while (flag)
		{
			System.out.println("How many rooms are suites? ");
			String sr = scan.nextLine();
			boolean flag4 = checkInt(sr);
			if (flag4)
			{
				suites = Integer.parseInt(sr);
				flag = false;
			}
			else
				System.out.println("Enter an integer.");
		}
		
		flag = true;
		while (flag)
		{
			System.out.println("How many interior rooms? ");
			String ir = scan.nextLine();
			boolean flag5 = checkInt(ir);
			if (flag5)
			{
				suites = Integer.parseInt(ir);
				flag = false;
			}
			else
				System.out.println("Enter an integer.");
		}
		
		flag = true;
		while (flag)
		{
			System.out.println("Has this ship been assigned a service?\nTrue or False");
			String s = scan.nextLine().toLowerCase();
			boolean flag5 = checkBoolean(s);
			if (flag5)
			{
				service = Boolean.parseBoolean(s);
				flag = false;
			}
			else
				System.out.println("Enter true or false.");
		}
		
		flag = true;
		
		Ship s = new Ship(shipName, balconyRooms, oceanviewRooms, suites, interiorRooms, service);
		return s;
	}
	
	public static void editShip (Ship [] shipList, int shipCount)//allows the user to edit any/all details of a ship
	{
		int input = 0;
		boolean flag = true;
		while (flag)//this first menu will let the user pick a ship from the shipList
		{
			
				System.out.println("Which ship would you like to edit:");
				for (int i = 0; i < shipCount; i++) 
				{
					System.out.println(i+1 + "- "+shipList[i].getShipName());
				}
				System.out.println(shipCount+1 + "- Return to previous menu");
				System.out.print("Enter a menu selection: ");
				boolean flag2 = true;
				while (flag2)
				{
					String in = scan.nextLine();
					boolean check = checkInt(in);
					if (check)
					{
						input = Integer.parseInt(in);
						flag2 = false;
					}
					else 
						System.out.println("Enter an integer.");
				}
			if (input == shipCount+1)//exit to main menu
				flag = false;
			
			if (input >= 1 && input <= shipCount)//this next menu lets the user edit any/all details of that ship. Making an edit will bring user back to main menu
			{
				int b = 0;
				boolean check = true;
				boolean flag3 = true;
				while (flag3)
				{
					System.out.println("\nWhich item do you wish to edit:\r\n" + 
							"1-	Ship name\r\n" + 
							"2-	Number of balconies\r\n" + 
							"3-	Number of Ocean Views\r\n" + 
							"4-	Number of Suites\r\n" + 
							"5-	Number of Interior\r\n" + 
							"6-	Service status\r\n" + 
							"7-	Update all\r\n" + 
							"8-	Return to previous menu\r\n");
					System.out.print("Enter a menu selection: ");
					int input2 = Integer.parseInt(scan.nextLine());//needs checkInput
					
					switch(input2)
					{
					//edit ship name
					case 1: System.out.println("What is the new ship name for " + shipList[input-1].getShipName() + "?");
							shipList[input-1].setShipName(scan.nextLine());
							flag = false;
							flag3 = false;
							break;
							
					//edit balcony rooms
					case 2: System.out.println("Current number of balcony rooms is "+shipList[input-1].getBalconyRooms() + ". What is the new number?");
							boolean flag4 = true;
							while (flag4)
							{
								String br = scan.nextLine();
								check = checkInt(br);
								if(check)
								{
									shipList[input-1].setBalconyRooms(Integer.parseInt(br));
									flag = false;
									flag3 = false;
									flag4 = false;
								}
								else
									System.out.println("Enter an integer.");
							}
							break;
					//edit ocean view rooms
					case 3: System.out.println("Current number of ocean view rooms is " +shipList[input-1].getOceanviewRooms() + ". What is the new number?");
							boolean flag5 = true;
							while (flag5)
							{
								String br = scan.nextLine();
								check = checkInt(br);
								if(check)
								{
									shipList[input-1].setOceanviewRooms(Integer.parseInt(br));
									flag = false;
									flag3 = false;
									flag5 = false;
								}
								else
									System.out.println("Enter an integer.");
							}
							break;
					//edit suite rooms		
					case 4: System.out.println("Current number of suite rooms is " +shipList[input-1].getSuiteRooms() + ". What is the new number?");
							boolean flag6 = true;
							while (flag6)
							{
								String br = scan.nextLine();
								check = checkInt(br);
								if(check)
								{
									shipList[input-1].setSuiteRooms(Integer.parseInt(br));
									flag = false;
									flag3 = false;
									flag6 = false;
								}
								else
									System.out.println("Enter an integer.");
							}
							break;
					//edit interior rooms		
					case 5: System.out.println("Current number of suite rooms is " +shipList[input-1].getSuiteRooms() + ". What is the new number?");
							boolean flag7 = true;
							while (flag7)
							{
								String br = scan.nextLine();
								check = checkInt(br);
								if(check)
								{
									shipList[input-1].setInteriorRooms(Integer.parseInt(br));
									flag = false;
									flag3 = false;
									flag7 = false;
								}
								else
									System.out.println("Enter an integer.");
							}
							break;
					//edit service		
					case 6: System.out.println("Ship " + shipList[input-1].getShipName() + " is currently");
							boolean flag8 = true;
							if (shipList[input-1].isService() == true)
								System.out.print(" in service. \n" + "Would you like to keep it in service? Yes or No");
							if (shipList[input-1].isService() == false)
								System.out.println(" out of service. \n" + "Would you like to put it in service? Yes or No");//needs to have a checkInput
							while (flag8)
							{
								String answer = scan.nextLine().toLowerCase();
								if(answer.equals("yes"))
								{
									shipList[input-1].setService(true);
									System.out.println(shipList[input-1].getShipName() + " is now in service. \n");
									flag = false;
									flag3 = false;
									flag8 = false;
								}
								if(answer.equals("no"))
								{
									shipList[input-1].setService(false);
									System.out.println(shipList[input-1].getShipName() + " is out of service. \n");
									flag = false;
									flag3 = false;
									flag8 = false;
								}
								else
									System.out.println("Enter Yes or No.");
							}
							break;
					//edit all		
					case 7: System.out.println("What is the new ship name for " + shipList[input-1].getShipName() + "?");
							shipList[input-1].setShipName(scan.nextLine());
							flag = false;
							flag3 = false;
							
							System.out.println("Current number of balcony rooms is "+shipList[input-1].getBalconyRooms() + ". What is the new number?");
							boolean flag9 = true;
							while (flag9)
							{
								String br = scan.nextLine();
								check = checkInt(br);
								if(check)
								{
									shipList[input-1].setBalconyRooms(Integer.parseInt(br));
									flag = false;
									flag3 = false;
									flag9 = false;
								}
								else
									System.out.println("Enter an integer.");
							}
							
							System.out.println("Current number of ocean view rooms is " +shipList[input-1].getOceanviewRooms() + ". What is the new number?");
							boolean flaga = true;
							while (flaga)
							{
								String br = scan.nextLine();
								check = checkInt(br);
								if(check)
								{
									shipList[input-1].setOceanviewRooms(Integer.parseInt(br));
									flag = false;
									flag3 = false;
									flaga = false;
								}
								else
									System.out.println("Enter an integer.");
							}
							
							System.out.println("Current number of suite rooms is " +shipList[input-1].getSuiteRooms() + ". What is the new number?");
							boolean flagb = true;
							while (flagb)
							{
								String br = scan.nextLine();
								check = checkInt(br);
								if(check)
								{
									shipList[input-1].setSuiteRooms(Integer.parseInt(br));
									flag = false;
									flag3 = false;
									flagb = false;
								}
								else
									System.out.println("Enter an integer.");
							}
								
							System.out.println("Current number of suite rooms is " +shipList[input-1].getSuiteRooms() + ". What is the new number?");
							boolean flagc = true;
							while (flagc)
							{
								String br = scan.nextLine();
								check = checkInt(br);
								if(check)
								{
									shipList[input-1].setInteriorRooms(Integer.parseInt(br));
									flag = false;
									flag3 = false;
									flagc = false;
								}
								else
									System.out.println("Enter an integer.");
							}
								
							System.out.println("Ship " + shipList[input-1].getShipName() + " is currently");
							boolean flagd = true;
							if (shipList[input-1].isService() == true)
								System.out.print(" in service. \n" + "Would you like to keep it in service? Yes or No");
							if (shipList[input-1].isService() == false)
								System.out.println(" out of service. \n" + "Would you like to put it in service? Yes or No");//needs to have a checkInput
							while (flagd)
							{
								String answer = scan.nextLine().toLowerCase();
								if(answer.equals("yes"))
								{
									shipList[input-1].setService(true);
									System.out.println(shipList[input-1].getShipName() + " is now in service. \n");
									flag = false;
									flag3 = false;
									flagd = false;
								}
								if(answer.equals("no"))
								{
									shipList[input-1].setService(false);
									System.out.println(shipList[input-1].getShipName() + " is out of service. \n");
									flag = false;
									flag3 = false;
									flagd = false;
								}
								else
									System.out.println("Enter Yes or No.");
							}
							break;
						
					case 8: flag2 = false;//exits this menu, brings user back to first editShip menu (select ship to edit)
					}
				}
			}
			else
				if(input != shipCount+1)
					System.out.println("You must enter a number 1 - " + shipCount);
		}
	}
	
	public static Cruise addCruise ()//add cruise to cruiseList
	{
		System.out.println("Enter the cruise name: ");
		String cruise = scan.nextLine();
		System.out.println("Enter the ship name: ");
		String ship = scan.nextLine();
		System.out.println("Where is the departure? ");
		String departure = scan.nextLine();
		System.out.println("Where is the destination? ");
		String destination = scan.nextLine();
		System.out.println("Where is the return port? ");
		String returnPort = scan.nextLine();
		
		Cruise c = new Cruise (cruise, ship, departure, destination, returnPort);
		return c;
	}
	
	public static void editCruise (Cruise[] cruiseList, int cruiseCount, Ship[] shipList, int shipCount)
	{//edit any/all details of a cruise. making an edit will bring user to main menu
		boolean flag = true;
		while (flag)//first editCruise menu will allow the user to pick a cruise to edit
		{
			System.out.println("Which cruise would you like to edit:");
			for (int i = 0; i < cruiseCount; i++)
			{
				System.out.println(i+1 + "- "+cruiseList[i].getCruiseName());
			}
			System.out.println(cruiseCount+1 + "- Return to previous menu");
			
			System.out.print("Enter a menu selection: ");
			
			boolean flagx = true;
			int input = 0;
			while (flagx)
			{
				String in = scan.nextLine();
				boolean check = checkInt(in);
				if(check)
				{
					input = Integer.parseInt(in);
					flagx = false;
				}
				else
					System.out.println("Enter an integer.");
			}
			
			if (input == cruiseCount+1)
				flag = false;
			
			else
			{
				boolean flag2 = true;
				while (flag2)//second editCruise menu displays all aspects of cruise that can be edited
				{
					System.out.println("Which item do you wish to edit:\r\n" + 
							"1-	Cruise name\r\n" + 
							"2-	Ship\r\n" + 
							"3-	Departure Port\r\n" + 
							"4-	Destination\r\n" + 
							"5-	Return port\r\n" +
							"6- Edit all\n");
					System.out.print("Enter a menu selection: ");
					
					boolean flagy = true;
					int input2 = 0;
					while (flagy)
					{
						String in = scan.nextLine();
						boolean check = checkInt(in);
						if(check)
						{
							input2 = Integer.parseInt(in);
							flagy = false;
						}
						else
							System.out.println("Enter an integer.");
					}
										
					switch(input2)
					{
					//edit cruise name
					case 1: System.out.println("Current name of cruise is " + cruiseList[input-1].getCruiseName() + ". What is the new cruise name?");
							cruiseList[input-1].setCruiseName(scan.nextLine());
							flag = false; 
							flag2 = false;
							break;
					//edit ship for cruise. it will display ships from shipList, then allow the user to pick one
					case 2: System.out.println("These ships can be added to a cruise: ");
						for (int i = 0; i < shipCount; i++)
							System.out.println(i+1 + "- " + shipList[i].getShipName());
						System.out.println(shipCount+1 + "- Return to previous menu");
						System.out.print("Enter a menu selection: ");
						
						boolean flagz = true;
						int input3 = 0;
						while (flagz)
						{
							String in = scan.nextLine();
							boolean check = checkInt(in);
							if(check)
							{
								input3 = Integer.parseInt(in);
								flagz = false;
							}
							else
								System.out.println("Enter an integer.");
						}
						
						if (input3 == shipCount+1)
						{
							break;
						}
						else
						{
							cruiseList[input-1].setShipName(shipList[input3-1].getShipName());
							flag = false; 
							flag2 = false;
							break;
						}
					//edit departure port		
					case 3: System.out.println("Current cruise departure port is " + cruiseList[input-1].getDeparturePort() + ". What is the new departure port?");
							cruiseList[input-1].setDeparturePort(scan.nextLine());
							flag = false; 
							flag2 = false;
							break;
					//edit destination		
					case 4: System.out.println("Current cruise destination is " + cruiseList[input-1].getDestination() + ". What is the new destination?");
							cruiseList[input-1].setDestination(scan.nextLine());
							flag = false; 
							flag2 = false;
							break;
					//edit return port		
					case 5: System.out.println("Current cruise return port is " + cruiseList[input-1].getReturnPort() + ". What is the new return port?");
							cruiseList[input-1].setReturnPort(scan.nextLine());
							flag = false; 
							flag2 = false;
							break;
					//edit all		
					case 6: System.out.println("Current name of cruise is " + cruiseList[input-1].getCruiseName() + ". What is the new cruise name?");
							cruiseList[input-1].setCruiseName(scan.nextLine());
							
							System.out.println("These ships can be added to a cruise: ");
							for (int i = 0; i < shipCount; i++)
								System.out.println(i+1 + "- " + shipList[i].getShipName());
							System.out.println(shipCount+1 + "- Return to previous menu");
							System.out.print("Enter a menu selection: ");
							
							flagz = true;
							int input4 = 0;
							while (flagz)
							{
								String in = scan.nextLine();
								boolean check = checkInt(in);
								if(check)
								{
									input4 = Integer.parseInt(in);
									flagz = false;
								}
								else
									System.out.println("Enter an integer.");
							}
							
							if (input4 == shipCount+1)
							{
								break;
							}
							else
							{
								cruiseList[input-1].setShipName(shipList[input4-1].getShipName());
							}
							
							System.out.println("Current cruise departure port is " + cruiseList[input-1].getDeparturePort() + ". What is the new departure port?");
							cruiseList[input-1].setDeparturePort(scan.nextLine());
							
							System.out.println("Current cruise destination is " + cruiseList[input-1].getDestination() + ". What is the new destination?");
							cruiseList[input-1].setDestination(scan.nextLine());
							
							System.out.println("Current cruise return port is " + cruiseList[input-1].getReturnPort() + ". What is the new return port?");
							cruiseList[input-1].setReturnPort(scan.nextLine());
							flag = false; 
							flag2 = false;
							break;
					}
				}
			}
		}
	}
	
	public static Passenger addPassenger ()//adds a passenger to passengerList
	{
		System.out.println("What is the passenger's name? ");
		String name = scan.nextLine();
		System.out.println("What is the cruise? ");
		String cruise = scan.nextLine();
		System.out.println("What is the room type? ");
		String room = scan.nextLine();
		
		Passenger p = new Passenger (name, cruise, room);
		return p;
	}
	
	public static void editPassenger (Passenger[] passengerList, int passengerCount, Cruise[] cruiseList, int cruiseCount)
	{//allows user to edit any/all details of a passenger. Making an edit will bring user back to main menu
		boolean flag = true;
		while (flag)
		{//first editPassenger menu will display all passenger names
			System.out.println("Which passenger would you like to edit:");
			for (int i = 0; i < passengerCount; i++)
			{
				System.out.println(i+1 + "- "+passengerList[i].getPassName());
			}
			System.out.println(passengerCount+1 + "- Return to previous menu");
			
			System.out.print("Enter a menu selection: ");
			
			boolean flagz = true;
			int input = 0;
			while (flagz)
			{
				String in = scan.nextLine();
				boolean check = checkInt(in);
				if(check)
				{
					input = Integer.parseInt(in);
					flagz = false;
				}
				else
					System.out.println("Enter an integer.");
			}
			
			if (input == passengerCount+1)
				flag = false;
			
			else
			{
				boolean flag2 = true;
				while (flag2)
				{//second menu will displays details that can be edited
					System.out.println("Which item do you wish to edit:\r\n" + 
							"1-	Passenger name\r\n" + 
							"2-	Cruise name\r\n" + 
							"3-	Room type\r\n" + 
							"4- Edit all\n");
					System.out.print("Enter a menu selection: ");
					
					flagz = true;
					int input2 = 0;
					while (flagz)
					{
						String in = scan.nextLine();
						boolean check = checkInt(in);
						if(check)
						{
							input2 = Integer.parseInt(in);
							flagz = false;
						}
						else
							System.out.println("Enter an integer.");
					}
					
					switch(input2)
					{
					//edit passenger name
					case 1: System.out.println("Current name of passenger is " + passengerList[input-1].getPassName() + ". What is the new passenger name?");
							passengerList[input-1].setPassName(scan.nextLine());
							flag = false; 
							flag2 = false;
							break;
					//edit passenger's cruise. it will display cruises and allow the user to pick one
					case 2: System.out.println("These are the available cruises: ");
						for (int i = 0; i < cruiseCount; i++)
							System.out.println(i+1 + "- " + cruiseList[i].getCruiseName());
						System.out.println(cruiseCount+1 + "- Return to previous menu");
						System.out.print("Enter a menu selection: ");
						
						flagz = true;
						int input3 = 0;
						while (flagz)
						{
							String in = scan.nextLine();
							boolean check = checkInt(in);
							if(check)
							{
								input3 = Integer.parseInt(in);
								flagz = false;
							}
							else
								System.out.println("Enter an integer.");
						}
						
						if (input3 == cruiseCount+1)
						{
							break;
						}
						else
						{
							passengerList[input-1].setCruiseName(cruiseList[input3-1].getCruiseName());
							flag = false; 
							flag2 = false;
							break;
						}
					//edit room type	
					case 3: System.out.println("Current room type is " + passengerList[input-1].getRoomType() + ". What is the new room type?");
							passengerList[input-1].setRoomType(scan.nextLine());
							flag = false; 
							flag2 = false;
							break;
					//edit all		
					case 4: System.out.println("Current name of passenger is " + passengerList[input-1].getPassName() + ". What is the new passenger name?");
							passengerList[input-1].setPassName(scan.nextLine());

							System.out.println("These are the available cruises: ");
							for (int i = 0; i < cruiseCount; i++)
								System.out.println(i+1 + "- " + cruiseList[i].getCruiseName());
							System.out.println(cruiseCount+1 + "- Return to previous menu");
							System.out.print("Enter a menu selection: ");
							
							flagz = true;
							int input4 = 0;
							while (flagz)
							{
								String in = scan.nextLine();
								boolean check = checkInt(in);
								if(check)
								{
									input4 = Integer.parseInt(in);
									flagz = false;
								}
								else
									System.out.println("Enter an integer.");
							}
							
							if (input4 == cruiseCount+1)
							{
								break;
							}
							else
							{
								passengerList[input-1].setCruiseName(cruiseList[input4-1].getCruiseName());
							}
							
							System.out.println("Current room type is " + passengerList[input-1].getRoomType() + ". What is the new room type?");
							passengerList[input-1].setRoomType(scan.nextLine());
							flag = false; 
							flag2 = false;
							break;
					}
				}
			}
		}
	}
	
	public static boolean checkInput (String input)//calling this method will check the main menu input and verify that it is valid
	{
		boolean flag = true;
		try // try/else loop will test if the input is an integer between 1 and 7
		{
			if (!input.equals("A") && !input.equals("B") && !input.equals("C") && !input.equals("D") && !input.equals("E") && !input.equals("F") && !input.equals("X"))
			{
				int in = Integer.parseInt(input);
				if (in < 1 || in > 6)
					flag = false;
			}
		}
		catch (Exception e)
		{
			System.out.println("Not a valid menu selection.\n");
		}
		return flag;
	}
	
	public static boolean checkInt (String input)//it will simply check if input is an integer
	{
		boolean flag = true;
		try 
		{
			Integer.parseInt(input);
		}
		catch (Exception e)
		{
			flag = false;
		}
		return flag;
	}
	
	public static boolean checkBoolean (String input)//it will simply check if input is an boolean
	{
		boolean flag = true;
		try 
		{
			Boolean.parseBoolean(input);
		}
		catch (Exception e)
		{
			flag = false;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		
		//counts how many objects are in each array
		int shipCount = 0;
		int cruiseCount = 0;
		int passengerCount = 0;

		//stores ships into an array. also counts how many were stored
		Ship [] shipList = initializeShipList();
		for(int i = 0; i < shipList.length; i++)
			if (shipList[i] != null)
				shipCount++;
		
		//initializes cruise list. counts cruises stored
		Cruise [] cruiseList = initializeCruiseList();
		for(int i = 0; i < cruiseList.length; i++)
			if (cruiseList[i] != null)
				cruiseCount++;

		//initializes passenger list. counts passengers stored
		Passenger [] passengerList = initializePassengerList();
		for(int i = 0; i < passengerList.length; i++)
			if (passengerList[i] != null)
				passengerCount++;
		
		boolean flag = true;
		while (flag)//this is the initial loop. it will end when the user picks the option to end system
		{
			String input = displayMenu();//starts main menu
			boolean check = checkInput (input);
			if (check)//it will only continue if input was verified
			{
				if (input.equals("1"))//addShip method
				{
					Ship s = addShip();
					shipList[shipCount] = s;
					shipCount++;
				}
				if (input.equals("2"))//editShip method
				{
					editShip(shipList, shipCount);
				}
				if (input.equals("3"))//addCruise method
				{
					Cruise c = addCruise();
					cruiseList[cruiseCount] = c;
					cruiseCount++;
				}
				if (input.equals("4"))//editCruise method
				{
					editCruise(cruiseList, cruiseCount, shipList, shipCount);
				}
				if (input.equals("5"))//addPassenger method
				{
					Passenger p = addPassenger();
					passengerList[passengerCount] = p;
					passengerCount++;
				}
				if (input.equals("6"))//editPassenger method
				{
					editPassenger(passengerList, passengerCount, cruiseList, cruiseCount);
				}
				if (input.equals("A") || input.equals("B") || input.equals("C"))//displayShipList method
				{
					printShipList(shipList, input);
				}
				if (input.equals("D") || input.equals("E"))//displayCruiseList method
				{
					printCruiseList(cruiseList, input);
				}
				if (input.equals("F"))//displayPassengerList method
				{
					printPassengerList(passengerList);
				}
				if (input.equals("X"))//end program
				{
					System.out.println("\nGoodbye!");
					flag = false;
				}
			}
			else
			{
				System.out.println("Please enter a correct input.");
			}
			
		}
	}
}
