/**
 *  @author Milo Mitchell-Brooks
 *  @version v1
 *  @aim To check the distance of lightning
 */

import java.util.Scanner;

public class L06FavouriteSubjects 
{

	public static void main(String[] args) 
	{
		// Create scanner objects
		Scanner szKeyboard = new Scanner(System.in);
		Scanner iKeyboard = new Scanner(System.in);
		
		// Declare variables
		boolean bAgain = false;
		boolean bAgain1 = false;
		boolean bAgain2 = false;
		boolean bCompleted = false;
		boolean bCompleted1 = false;
		boolean bCompleted2 = false;
		String szSubject = "";
		String szGCSE = "";
		String szAgain = "";
		int iGCSE = 0;
		int iFavourite = 0;
		int iFilled = 0;
		int iCount = 0;
	

		while (!bCompleted) 
		{
			if (bAgain)
			{
				System.out.println("Enter another whole number");
			} else
			{
				System.out.println("How many of your GCSE's do you enjoy?");
			} // End of if-else statement
			
			szGCSE = szKeyboard.nextLine();
			
			if (szGCSE.matches("\\d+"))
			{
				try 
				{
					iGCSE = Integer.parseInt(szGCSE);
				} catch (NumberFormatException e) 
				{
					System.out.println("Not a valid interger");
					bAgain = true;
					continue;
				} // End of try and catch
				
				if (iGCSE > 10) 
				{
					System.out.println("The maximum number of subjects you can enter is 10.");
					continue;
				} else if (iGCSE < 1) 
				{
					System.out.println("The minimum number of subjects you can enter is 1.");
					continue;
				} else 
				{
					String[][] szSubjects = new String[iGCSE][2];
					for (int i = 1; i < iGCSE + 1; i++) 
					{
						System.out.println("Enter subject " + (i) + ":");
						szSubject = szKeyboard.nextLine();
						szSubjects[i-1][0] = szSubject;
					} // End of for statement
					bCompleted = true;
					System.out.println("You enjoy following subjects:");
					iFilled = 0;
					for (int i = 0; i < szSubjects.length; i++) 
					{
						System.out.println(i+1 + ". " + szSubjects[i][0]);
					}
					while (!bCompleted1) 
					{
						iFavourite = 0;
						
						if (bAgain1) 
						{
							System.out.println("Enter another favourite, choose a number between 1-" + szSubjects.length);
						} else 
						{
						System.out.println("Which one is your favourite, choose a number between 1-" + szSubjects.length);
						} // End of if-else statement
						
						szSubject = szKeyboard.nextLine();
						if (szSubject.matches("\\d+")) 
						{
							try 
							{
								iFavourite = Integer.parseInt(szSubject);
							} catch (NumberFormatException e) 
							{
								System.out.println("Not a valid interger");
								bAgain1 = true;
								continue;
							} // End of try catch
							
							if (iFavourite < 1 || iFavourite > szSubjects.length) 
							{
								System.out.println("Not a number between 1 and " + szSubjects.length);
								continue;
							} else 
							{
								szSubjects[iFavourite - 1][1] = szSubjects[iFavourite - 1][0];
								iFilled++;
								bCompleted2 = false; // RESET HERE
								while (!bCompleted2) 
								{
									if (bAgain2) 
									{
										System.out.println("Enter y or n");
										bAgain2 = false; // Reset after showing message
									}
									
									if (iFilled < szSubjects.length)
									{
										System.out.println("Do you want to add another favourite? (y or n):");
										szAgain = szKeyboard.nextLine();
										szAgain = szAgain.strip().toLowerCase();
										if (szAgain.equals("y")) 
										{
											bAgain1 = false;
											bCompleted2 = true;
											continue;
										} else if (szAgain.equals("n")) 
										{
											bCompleted2 = true;
											bCompleted1 = true;
										} else 
										{
											bAgain2 = true;
											continue;
										}
									} else 
									{
										bCompleted2 = true;
										bCompleted1 = true;
									}
								} // End of while loop
							} // End of else-if statement
						} else 
						{
							System.out.println("Not a valid interger");
							bAgain1 = true;
							continue;
						} // End of else-if statement
					} // End of while statement
					System.out.println("Your favourite subjects are:");
					for (int i = 0; i < szSubjects.length; i++) 
					{
						if (szSubjects[i][1] != null) 
						{
							System.out.println((iCount + 1) + ". " + szSubjects[i][1]);
							iCount++;
						} // End of if statement
					} // End of for loop
				} // End of else-if statement
			} else 
			{
				System.out.println("Not a valid interger");
				bAgain = true;
				continue;
			} // End of else-if statement
			
			
		} // End of while
		
		szKeyboard.close();
		iKeyboard.close();
	} // End of main

} // End of class
